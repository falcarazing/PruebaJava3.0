package com.fovissste.ejercicio2;

public class Principal {

    public static void main(String[] args){
        Clientes cliente = new Clientes("Fernando", new CuentaBancaria("091029384",50000));
        cliente.obtenerDatosDeCuenta();
    }
}
