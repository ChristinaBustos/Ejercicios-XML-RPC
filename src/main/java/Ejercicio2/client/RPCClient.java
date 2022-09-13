package Ejercicio2.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner datos = new Scanner(System.in);

        double num1,num2,num3,num4;

        System.out.println("INICIO");
        System.out.println("Ingrese el num1");
        num1 = datos.nextDouble();
        System.out.println("Ingrese el num2");
        num2 = datos.nextDouble();
        System.out.println("Ingrese el num3");
        num3 = datos.nextDouble();
        System.out.println("Ingrese el num4");
        num4 = datos.nextDouble();

        Object[] data = {num1,num2,num3,num4};
        Object response = client.execute("Methods.operaciones",data);

        System.out.println("Hola "+response);

    }
}
