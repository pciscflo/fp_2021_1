package com.fundamentos;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad=10;
        String mensaje=null;
        if (edad>=18){
            mensaje = "Es mayor";
        }
        if(edad<18){
            mensaje = "Es menor";
        }
        System.out.println(mensaje);
    }
}
