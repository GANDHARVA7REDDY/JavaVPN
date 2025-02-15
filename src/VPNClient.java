import java.io.*;
import java.net.*;

public class VPNClient {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // Change this to your VPN server IP
        int port = 8080;

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to VPN Server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
