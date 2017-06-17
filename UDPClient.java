// UDPClient.java: A simple UDP client program.

import java.net.*;
import java.io.*;

public class UDPClient {

    final static String data = "Hello there!";
    final static int PORT = 1300;
    final static int BUFSIZE = 1024;

    public static void main(String args[]) {


		for(iint i=0;i<10000;i++){
        try ( DatagramSocket aSocket = new DatagramSocket();) {
            InetAddress aHost = InetAddress.getByName(args[0]);
            
            byte[] dataArray = data.getBytes();
            DatagramPacket requestPacket = new DatagramPacket(dataArray, dataArray.length, aHost, PORT);
            aSocket.send(requestPacket);

            //byte[] buffer = new byte[BUFSIZE];
            //DatagramPacket recievePacket = new DatagramPacket(buffer, buffer.length);
            //aSocket.receive(recievePacket);
            
            System.out.println("Reply:" + new String(recievePacket.getData()));
            
            
            
        } 
        
        catch (Exception e) {
            System.out.println("Socket: " + e.getMessage());
        } 
    }
}
