package com.fundamentos;

public class Ejercicio1_2 {
    /*
    Dado una cantidad de dinero distribuirlo en billetes
    de 50, 20 y 10
     */
    public static void main(String[] args) {
        int numero = 7341;//Entrada
        int cantidaInicial = numero;
        int b50, b20, b10, monedas;
        b50 = numero / 50; //b50 --> 2
        numero = numero % 50;//numero --> 30
        b20 = numero / 20; // b20 ---> 1
        numero = numero % 20;//numero --> 10
        b10 = numero /10; // b10 --> 1
        monedas = numero % 10;
        System.out.println("En " + cantidaInicial);
        System.out.println("Billetes de 50:" + b50); //salida
        System.out.println("Billetes de 20:" + b20); //salida
        System.out.println("Billetes de 10:" + b10); //salida
        System.out.println("Monedas soles:" + monedas); // salida

    }
}
