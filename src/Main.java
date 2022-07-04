import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ThreadClient threadClient = new ThreadClient();
        ThreadServer threadServer = new ThreadServer();
        threadServer.start();
        threadClient.start();

    }
}
