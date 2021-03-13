package com.fundamentos;

import java.util.Scanner;

public class App1 { //nombre de una clase debe iniciarse en mayúscula
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creo un objeto para capturar datos de teclado
        String nomb; //sensitivo a las mayusculas y minusculas
        System.out.println("Ingrese su nombre:");//mostrar mensaje Ingrese....
        nomb = sc.next(); //captura dato del teclado/consola y almacena en la variable nomb
        System.out.println("Bienvenido " + nomb);    // + concatena
    }
}
