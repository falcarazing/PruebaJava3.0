package com.fovissste.ejercicio3;

import java.math.*;
import java.util.Scanner;

public class RestaXXX
{
    public static void main (String[] args)
    {
        double d1 = leerValor();
        double d2 = leerValor();
        double d3 = d1 - d2;
        System.out.println("Numero redondeado es: "+ redondeaADecimales(d3,2));
    }

    public static double redondeaADecimales(double valorSinRedondear, int numeroDeDecimales){
        int cifras=(int) Math.pow(10,numeroDeDecimales);
        return Math.rint(valorSinRedondear*cifras)/cifras;
    }

    private static double leerValor(){
        double valor=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloca el valor:");
        try{
            valor = entrada.nextDouble();
        }catch (Exception e){
            System.out.println("El valor debe ser double");
            leerValor();
        }
        return valor;
    }
}

