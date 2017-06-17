// UDPServer.java: A simple UDP server program.

import java.net.*;
import java.io.*;
import java.util.*;

public class UDPServer {
    final static int PORT = 1300;
    final static int BUFSIZE = 1024;
    double start;
    
    public static void main(String args[]) {


		for(int i=0;i<10000;i++){
        try (DatagramSocket aSocket = new DatagramSocket(PORT);) {
            byte[] bufferRecieve = new byte[BUFSIZE];          
            DatagramPacket recievePacket = new DatagramPacket(bufferRecieve, BUFSIZE);
			 aSocket.send(replyPacket);
			 
			 
			if(i=0)
			start =  System.currentTimeMillis();
		
			//aSocket.receive(recievePacket);
			//DatagramPacket replyPacket = new DatagramPacket(
                    //recievePacket.getData(), recievePacket.getLength(), 
                    //recievePacket.getAddress(), recievePacket.getPort());

                      
        }
	}
        
	
         catch (Exception e) {            
            System.out.println("Socket: " + e.getMessage());            
        }
        
        double t =  System.currentTimeMillis() - start;
        System.out.println("Throughput: " + t);   
    }
    }


