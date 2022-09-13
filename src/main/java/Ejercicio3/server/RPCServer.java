package Ejercicio3.server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;
//Bustos Anna Christina
public class RPCServer {

    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Initialize server...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("Methods", Methods.class);

        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();

        System.out.println("Waiting requests ...");
        System.out.println("Server running ejercicio 3...");
    }

}
