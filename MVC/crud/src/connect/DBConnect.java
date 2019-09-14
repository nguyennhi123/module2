package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
        public DBConnect(){}
        public Connection getConnection() {
            try {
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                String serverName = "localhost";
                String myDB = "crud";
                String url = "jdbc:mysql://" + serverName + "/" + myDB + "?useUnicode=true&characterEncoding=utf-8";
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
