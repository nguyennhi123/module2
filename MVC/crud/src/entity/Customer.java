package entity;

import connect.DBConnect;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
        private int id;
        private String phone;
        private String address;
        private String name;
        private int id_employer;
        public Customer() {
        }

        public Customer(int id, String phone, String address, String name, int id_employer) {
            this.id = id;
            this.phone = phone;
            this.address = address;
            this.name = name;
            this.id_employer = id_employer;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId_employer() {
            return id_employer;
        }

        public void setId_employer(int id_employer) {
            this.id_employer = id_employer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
        public Connection getConnect(){
            DBConnect Connection = new DBConnect();
            Connection connection = Connection.getConnection();
            return connection;
        }
        public Connection connection = getConnect();
        public List<Customer> getAllCustomer(){
            List<Customer>customer = new ArrayList<>();
            Statement statement = null;
            String sql = "SELECT id,phone,address,name,id_employer FROM customer";
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ResultSet resultSet;
            try {
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String phone = resultSet.getString("phone");
                    String address = resultSet.getString("address");
                    String name = resultSet.getString("name");
                    int id_employer = resultSet.getInt("id_employer");
                    Customer customerNew = new Customer(id,phone,address,name,id_employer);
                    customer.add(customerNew);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return customer;
        }
        public boolean create(Customer newCustomer) throws SQLException {
            String sql = "INSERT INTO customer(id,phone,address,name,id_employer) values (?,?,?,?,?)";
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.setInt(1,newCustomer.getId());
            statement.setString(2,newCustomer.getPhone());
            statement.setString(3,newCustomer.getAddress());
            statement.setString(4,newCustomer.getName());
            statement.setInt(5,newCustomer.getId_employer());
            boolean newRow = statement.executeUpdate(sql)>0;
            statement.close();
            try {
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            return newRow;

        }

    }

