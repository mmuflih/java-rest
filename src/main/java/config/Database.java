package config;

import java.sql.*;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class Database {
    public Connection getConnection() {
        try {
            String host = "127.0.0.1";
            String port = ":3306";
            String dbName = "namaDatabase";
            String dbUser = "userLoginMySQL";
            String dbPass = "passLoginMySQL";

            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://" + host + port + "/" + dbName,dbUser,dbPass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
