package entity;

import jdbc.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Customer extends DBConnection{
        private int idcustomer;
        private String customerName;
        private String phone;
        private String address;
        public Customer() {
        }
        public Customer(int idcustomer,String customerName,String phone,String address) {
            this.idcustomer = idcustomer;
            this.customerName = customerName;
            this.phone = phone;
            this.address = address;
        }
        public int getIdcustomer() {
            return idcustomer;
        }
        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public List<Customer> getAllCustomer() throws SQLException{
            List<Customer> customerList = new ArrayList<Customer>();
            DBConnection db = new DBConnection();
            Connection conn = db.getConnection();
            Statement statement = null;
            try {
                statement = conn.createStatement();
            }catch (SQLDataException e){
                e.printStackTrace();
            }
            String sql = "SELECT idcustomer, customerName,phone, address FROM Customer";
            ResultSet resultSet;
            try {
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                   int idcustomer = resultSet.getInt("idcustomer");
                   String customerName = resultSet.getString("customerName");
                   String phone = resultSet.getString("phone");
                   String address = resultSet.getString("address");
                   Customer customer = new Customer(idcustomer,customerName,phone,address);
                   customerList.add(customer);

                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            return customerList;
            }
            public boolean createCustomer(Customer customer)throws SQLException{
            String sql = "INSERT INTO customer(idcustomer,customerName,phone,address) values(?,?,?,?)";
            DBConnection dbConnection = new DBConnection();
           Connection conn = dbConnection.getConnection();
           PreparedStatement statement = null;
           try {
               statement = conn.prepareStatement(sql);
           }
           catch (SQLException e){
               e.printStackTrace();
           }
           statement.setInt(1,customer.getIdcustomer());
           statement.setString(2,customer.getCustomerName());
           statement.setString(3,customer.getPhone());
           statement.setString(4,customer.getAddress());
           boolean rowInserted = statement.executeUpdate()>0;
           statement.close();
           try {
               statement.close();
           }
           catch (SQLException e){
               e.printStackTrace();
           }
           return rowInserted;

            }
            protected boolean edit(Customer customer)throws SQLException{
            String sql = "UPDATE customer SET customerName = ?,phone = ?,address = ? WHERE idcustomer = ?";
            DBConnection connection = new DBConnection();
            Connection conn = connection.getConnection();
            PreparedStatement statement = null;
            try {
                statement = conn.prepareStatement(sql);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            statement.setString(1,customer.getCustomerName());
            statement.setString(2,customer.getPhone());
            statement.setString(3,customer.getAddress());
            boolean rowInserted = statement.executeUpdate()>0;
            statement.close();
            try {
                statement.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            return rowInserted;

            }
            public boolean delete(Customer customer)throws SQLException{
            String sql = "DELETE FROM customer WHERE idcustomer = ?";
            DBConnection dbConnection = new DBConnection();
            Connection conn = dbConnection.getConnection();
            PreparedStatement statement = null;
            try {
                statement = conn.prepareStatement(sql);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            statement.setInt(1,customer.getIdcustomer());
            boolean deleteRow = statement.executeUpdate()>0;
            statement.close();

            return deleteRow;
            }
    }

