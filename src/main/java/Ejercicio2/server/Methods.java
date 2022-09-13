package Ejercicio2.server;

public class Methods {
    private double producto;
    private double suma;
    private double promedio;

    public String operaciones(double num1, double num2, double num3, double num4){
        producto = num1*num2*num3*num4;
        suma = num1+num2+num3+num4;
        promedio = suma/4;

        return "Producto: "+producto+" Suma: "+suma+" Promedio: "+promedio;

    }
}
