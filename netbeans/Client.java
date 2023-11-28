
package clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Logger;

import javafx.print.PrintColor;

public class Client {

    public static void main(String[] args) {
        System.out.println("Client...");
        String hostname = "10.0.2.13";
        int port = 9000;
        try {
            Socket s = new Socket(hostname,port);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            out.println("Hi!");
            String res = in.readLine();
            System.out.println("res: "+res);
            s.close();
        } catch (IOException e) {
            //Logger.getLogger(Client.class.getName(e));
        }
    }
    
}
