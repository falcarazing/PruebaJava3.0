package com.fovissste.ejercicio2;

public class Clientes {
    private String nombre;
    private CuentaBancaria cuenta;

    public Clientes(String nombre, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void obtenerDatosDeCuenta(){
        System.out.println("El numero de cuenta es: "+this.cuenta.getNumero());
        System.out.println("El saldo de la cuenta es: "+this.cuenta.getSaldo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}
