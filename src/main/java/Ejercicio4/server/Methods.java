package Ejercicio4.server;

import java.util.Arrays;

public class Methods {
    public String orden(int num1,int num2,int num3,int num4,int num5){
        int asc[] = {num1,num2,num3,num4,num5};
        Arrays.sort(asc);

        for(int i=num1; i < asc.length; i++){
            System.out.println("Numero: "+ asc[i]);
        }
        System.out.println("Ordenado ascendente: ");

        return (asc[0]+" "+asc[1]+" "+asc[2]+" "+asc[3]+" "+asc[4]);
    }
}
