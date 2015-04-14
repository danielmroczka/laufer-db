package com.labs.dm.lauferdb.core;

import com.labs.dm.lauferdb.core.jdbc.JdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class Driver implements java.sql.Driver {

    public static String URL_PREFIX = "jdbc:laufer:";
    
    static {
        load();
    }

    private static void load() {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        if (info == null) {
            info = new Properties();
        }
        if (!acceptsURL(url)) {
            return null;
        }

        return new JdbcConnection(url, info);
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return url.startsWith(URL_PREFIX);
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 1;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
