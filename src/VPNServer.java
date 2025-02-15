import java.io.*;
import java.net.*;

public class VPNServer {
    public static void main(String[] args) {
        int port = 8090; // Change this to your VPN port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("VPN Server started on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
