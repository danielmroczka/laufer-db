package com.labs.dm.lauferdb.core.jdbc;

/**
 *
 * @author daniel 
 */
public class ConnectionParser {

    private final String name;
    
    public ConnectionParser(String url) {
        String suffix = url.substring("jdbc:laufer:".length());
        
        this.name = suffix;
    }

    public String getName() {
        return name;
    }
    
    
}
