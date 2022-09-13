package Ejercicio4.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner datos = new Scanner (System.in);

        int num1,num2,num3,num4,num5;

        System.out.println("INICIO----");
        System.out.println("Ingrese el num1");
        num1 = datos.nextInt();
        System.out.println("Ingrese el num2");
        num2 = datos.nextInt();
        System.out.println("Ingrese el num3");
        num3 = datos.nextInt();
        System.out.println("Ingrese el num4");
        num4 = datos.nextInt();
        System.out.println("Ingrese el num5");
        num5 = datos.nextInt();

        Object[] data = {num1,num2,num3,num4,num5};
        String response = (String) client.execute("Methods.orden",data);
        System.out.println(response);

    }
}
