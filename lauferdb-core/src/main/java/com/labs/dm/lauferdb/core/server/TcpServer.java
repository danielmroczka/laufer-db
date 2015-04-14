package com.labs.dm.lauferdb.core.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author daniel
 */
public class TcpServer {

    public void start() throws IOException {
        
        while (true) {
            String clientSentence;
            String capitalizedSentence = "";
            try (ServerSocket welcomeSocket = new ServerSocket(8182)) {
                Socket connectionSocket = welcomeSocket.accept();
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                //System.out.println(clientSentence);
                if (clientSentence.equals("set")) {
                    outToClient.writeBytes("connection is ");
                    System.out.println("running here");
                    //welcomeSocket.close();
                    //outToClient.writeBytes(capitalizedSentence);
                }
                capitalizedSentence = clientSentence.toUpperCase() + "\n";
                //if(!clientSentence.equals("quit"))
                outToClient.writeBytes(capitalizedSentence + "enter the message or command: ");
                System.out.println("passed");
                //outToClient.writeBytes("enter the message or command: ");
            }
            System.out.println("connection terminated");
        }
    }

}
