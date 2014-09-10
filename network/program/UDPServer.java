import java.net.*;
import java.io.*;
public class UDPServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket dsock = new DatagramSocket(8888);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        for (;;) {
            dsock.receive(dp);
            byte[] data = dp.getData();
            int offset = dp.getOffset();
            int length = dp.getLength();
            System.out.write(data, offset, length);
        }
    }
}
