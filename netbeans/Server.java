
package clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server {

    public static void main(String[] args) {
        System.out.println("Server...");
        int port = 9000;
        try {
            ServerSocket server = new ServerSocket(port);
            Socket s = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream());
            String req;
            while(true){
             req = in.readLine();
            System.out.println("req: "+req);
            out.println(req);
            }
        } catch (IOException e) {
            //Logger.getLogger(Client.class.getName(e));
        }
    }
    
}
