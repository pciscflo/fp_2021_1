package com.fundamentos;

import java.util.Random;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        int a = 17;
        int b;
        b = a % 8; //residuo de dividir 17 entre 8, % se denomina módulo
        System.out.println(b); //debe salir 1
        Random random = new Random();
        int n = random.nextInt(10);//genera un numero aleatorio de 0 a 9 inclusive
        System.out.println(n);
        //simulando el lanzamiento de un dado
        int dado = 1 + random.nextInt(6);//genera un número aleatorio del 1 al 6 inclusive
        System.out.println("Dado sale:" + dado);
    }
}
