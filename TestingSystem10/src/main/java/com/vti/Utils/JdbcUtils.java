package com.vti.Utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    static Connection connection = null;

    public static void main(String[] args) {
        getConnection();
        closeConnection();
    }
    public static Connection getConnection() {
        try {

            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/db.properties"));
            String username = properties.getProperty("user");
            String password = properties.getProperty("password");
            //StrString password ="1234"
            String url = properties.getProperty("url");
            //String url="jdbc:mysql://localhost:3306/assignment10"
            String driver = properties.getProperty("driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            if(connection!=null){
                System.out.println("ket noi thanh cong");
            }else {
                System.out.println("ket noi that bai");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("co loi xay ra");
            }
        }

    }

}
