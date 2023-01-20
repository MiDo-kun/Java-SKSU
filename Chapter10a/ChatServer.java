package Chapter10a;

import java.net.*;

public class ChatServer {
  public static void main(String args[]) throws Exception {
    MulticastSocket server = new MulticastSocket();
    InetAddress group = InetAddress.getByName("234.5.6.7"); // returns IP address of given host.
    server.joinGroup(group);
    boolean infinite = true; 

    while (infinite) {
      byte buf[] = new byte[1024];
      DatagramPacket data = new DatagramPacket(buf, buf.length);
      server.receive(data);

      String msg = new String(data.getData()).trim();
      System.out.println(msg);
    }

    server.close();
  }
}
