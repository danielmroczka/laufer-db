package com.labs.dm.lauferdb.core;

import java.sql.SQLException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author daniel
 */
public class DriverTest {

    private final Driver driver = new Driver();

    @Test
    public void shouldAcceptUrl() throws SQLException {

        assertTrue(driver.acceptsURL(Driver.URL_PREFIX));
    }

}
