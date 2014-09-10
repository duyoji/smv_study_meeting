import java.net.*;
import java.io.*;
public class UDPClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket dsock = new DatagramSocket();

        for (int b; (b = System.in.read()) != -1; ) {
            byte[] buffer = new byte[1024];
            buffer[0] = (byte)b;
            DatagramPacket dp = new DatagramPacket(buffer, 1,
                    new InetSocketAddress("192.168.32.255", 8888));
            dsock.send(dp);
        }
    }

}
