package entity;

import jdbc.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int idcustomer;
    private String name;
    private int idemployers;
    private String phone;
    private String sex;

    public Customer() {
    }

    public Customer(int idcustomer, String name, int idemployers, String phone, String sex) {
        this.idcustomer = idcustomer;
        this.name = name;
        this.idemployers = idemployers;
        this.phone = phone;
        this.sex = sex;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdemployers() {
        return idemployers;
    }

    public void setIdemployers(int idemployers) {
        this.idemployers = idemployers;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public List<Customer> getAllCustomer()throws SQLException{
        List<Customer>customerList = new ArrayList<Customer>();
        String sql = "SELECT idcustomer,name,idemployers,phone,sex FROM customer";
        DBConnection db = new DBConnection();
        Connection conn = db.getConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int idcustomer = resultSet.getInt("idCustomer");
                String name = resultSet.getString("name");
                int idemployers = resultSet.getInt("idEmployers");
                String phone = resultSet.getString("phone");
                String sex = resultSet.getString("sex");
                Customer customer = new Customer(idcustomer,name,idemployers,phone,sex);
                customerList.add(customer);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customerList;
    }
    public boolean create(Customer customer)throws SQLException{
        String sql = "INSERT INTO customer(idcustomer,name,idemployers,phone,sex) values (?,?,?,?,?)";
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        statement.setInt(1,customer.getIdcustomer());
        statement.setString(2,customer.getName());
        statement.setInt(3,customer.idemployers);
        statement.setString(4,customer.getPhone());
        statement.setString(5,customer.getSex());
        boolean rowNew = statement.executeUpdate()>0;
        statement.close();
        try {
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rowNew;
    }
    public boolean edit (Customer customers)throws SQLException{
        String sql = "UPDATE customer SET name = ?,phone = ?,sex = ?,idemployers=? WHERE idcustomer=?";
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        statement.setString(1,customers.getName());
        statement.setString(2,customers.getPhone());
        statement.setString(3,customers.getSex());
        statement.setInt(4,customers.getIdemployers());
        statement.setInt(5,customers.getIdcustomer());
        boolean rowNew = statement.executeUpdate()>0;
        statement.close();
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowNew;
    }
    public Customer getCustomer(int idcustomer)throws SQLException{
        Customer customer = null;
        String sql = "SELECT name,phone,sex,idemployers FROM customer WHERE idcustomer = ?";
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        statement.setInt(1,idcustomer);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()){
            int idemployers = resultSet.getInt("idemployers");
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");
            String sex = resultSet.getString("sex");
            customer = new Customer(idcustomer,name,idemployers,phone,sex);
        }
        statement.close();
        resultSet.close();
        return customer;

    }
    public boolean delete(Customer customer)throws SQLException{
        String sql = "DELETE FROM customer WHERE idcustomer = ?";
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        statement.setInt(1,customer.getIdcustomer());
        boolean deleteRow = statement.executeUpdate()>0;
        statement.close();
        connection.close();
        return deleteRow;
    }

}
