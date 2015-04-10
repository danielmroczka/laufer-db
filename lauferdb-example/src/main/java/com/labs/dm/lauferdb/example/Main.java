package com.labs.dm.lauferdb.example;

import com.labs.dm.lauferdb.core.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class Main {

    private Connection connection;
    
    public static void main(String[] args) {
        new Main().execute();
    }

    private void execute() {
        connect(Driver.class.getName(), "jdbc:laufer", "", "");
    }

    public void connect(String driverName, String url, String username, String password) {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

}
