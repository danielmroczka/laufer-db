package com.labs.dm.lauferdb.core;

import com.labs.dm.lauferdb.core.server.TcpServer;
import java.io.IOException;

/**
 *
 * @author daniel 
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to LauferDB");
        
        
        for (String arg: args) {
            if (arg.equals("-server")) {
                TcpServer tcpServer = new TcpServer();
                tcpServer.start();
            }
        }
        
        System.out.println("Usage:");
        System.out.println("-server starts tcp server");
    }
}
