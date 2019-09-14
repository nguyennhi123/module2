package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public DBConnection(){
    }
    public Connection getConnection(){
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost";
            String myDB = "mohinhmvc";
            String url = "jdbc:mysql://" + serverName + "/" + myDB;
            String username = "root";
            String password = "12345678";
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
