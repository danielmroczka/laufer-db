package com.labs.dm.lauferdb.core.jmx;

import javax.management.NotCompliantMBeanException;
import javax.management.StandardMBean;

/**
 *
 * @author daniel 
 */
public class DatabaseInfo extends StandardMBean {

    public <T extends Object> DatabaseInfo(T implementation, Class<T> mbeanInterface) throws NotCompliantMBeanException {
        super(implementation, mbeanInterface);
    }

}
