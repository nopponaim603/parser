package opendota;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
    
public class Main {

    public static void main(String[] args) throws Exception {
    	System.out.println("Parser Java Application Run...");
        HttpServer server = HttpServer.create(new InetSocketAddress(Integer.valueOf(args.length > 0 ? args[0] : "5600")), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(java.util.concurrent.Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
        server.start();
        
        System.out.println("Parser Java Application Start Webserver on Port 5600.");
    }
    
    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            t.sendResponseHeaders(200, 0);
            System.out.println("Show input.");
            System.out.println(t.getRequestHeaders().toString());
            
            InputStream is = t.getRequestBody();
            OutputStream os = t.getResponseBody();


            try {
            	new Parse(is, os);
            }
            catch (Exception e)
            {
            	e.printStackTrace();
            }




            os.close();

        }
    }
}
