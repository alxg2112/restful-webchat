package server;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

/**
 * Service that implements chat room.
 */
@Path("/chatserver")
public class ChatServer {

    @GET
    @Produces("text/plain")
    public String getNewMessage() {
//        Message message = null;
//        try {
//            message = messages.take();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return message == null?"":message.getFrom() + ": " + message.getText();
        return "test";
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/chatserver");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
