package com.fovissste.ejercicio1;

import java.util.Scanner;

public class HipotenusaXXX {

    private int leerValor(){
        int valor=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloca el valor del Triangulo-Rectangulo:");
        try{
            valor = entrada.nextInt();
        }catch (Exception e){
            System.out.println("El valor debe ser numerico");
            leerValor();
        }
       return valor;
    }

    public static void main(String args[]){
        double valor_hipotenusa = 0;
        HipotenusaXXX hipotenusa = new HipotenusaXXX();
        double cateto1 = hipotenusa.leerValor();
        double cateto2 = hipotenusa.leerValor();
        cateto1 = cateto1 * cateto1; //
        System.out.println("El valor de la hipotenusa con los valores dados es:");
        System.out.println("cateto1:"+cateto1);
        cateto2 = cateto2 * cateto2; //
        System.out.println("cateto2:"+cateto2);
        valor_hipotenusa = Math.sqrt(cateto1 + cateto2);
        System.out.println("Hipotenusa:"+valor_hipotenusa);

    }
}
