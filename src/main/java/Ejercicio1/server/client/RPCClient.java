package Ejercicio1.server.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {

    public static void main(String[] args) throws XmlRpcException, MalformedURLException {

        Scanner datos = new Scanner(System.in);

        String nombre;
        double peso;
        double estatura;

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Ingresa tu nombre");
        nombre = datos.nextLine();
        System.out.println("Ingresa tu peso");
        peso = datos.nextDouble();
        System.out.println("Ingresa tu estatura");
        estatura = datos.nextDouble();

        Object[] data = {peso, estatura};
        Double response = (Double) client.execute("Methods.imc", data);
        System.out.println("Hola " + nombre + " tu IMC es de: " + response);
    }
}
