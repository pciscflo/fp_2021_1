package com.upc.cadenas;

public class Ejercicio1 {
    public static void main(String[] args) {
        String a = "Hola";
        System.out.println(a.substring(0,1));//substring(0, 0+desplazamiento)
        System.out.println(a.substring(1,4));//substring(1, 1 + 3 (caracteres))
        String mensaje = "Amigo";
        System.out.println(mensaje.substring(2,5));//igo
        System.out.println(mensaje.substring(3,5));//go
        System.out.println(mensaje.substring(0,3));//Ami

    }
}
