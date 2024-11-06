import java.net.*;
public class Udp_client {

public static void main(String[] args) throws Exception {

DatagramSocket socket = new DatagramSocket(); 
InetAddress address = InetAddress.getByName("localhost");

// Send message to server
String message = "Hello Server!";
byte[] buffer = message.getBytes();
DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000); 
socket.send(packet);

// Receive response from server
byte[] responseBuffer = new byte[1024];
DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
socket.receive(responsePacket);
System.out.println("Server says: " + new String(responsePacket.getData(), 0, responsePacket.getLength()));

// Close the socket 
socket.close(); 

}}