
public class Main {
    public static void main(String[] args) {
        ThreadClient threadClient = new ThreadClient();
        ThreadServer threadServer = new ThreadServer();
        threadServer.start();
        threadClient.start();

    }
}
