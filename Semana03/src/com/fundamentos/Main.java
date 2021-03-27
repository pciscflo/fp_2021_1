package com.fundamentos;

public class Main {

    public static void main(String[] args) {
        // write your code here 1. if 2. if else 3. if else anidada 4.switch
        int edad = 12;
        String mensaje;
        if (edad >= 18) { //condicion entre parentesis obligatorio
            mensaje = "Es mayor de edad";
        } else {
            mensaje = "Es menor de edad";
        }
        System.out.println(mensaje);
    }
}
