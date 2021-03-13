package com.fundamentos;

import java.util.Scanner;

public class App2 {
    /*
      Desarrollar un programa que permita calcular el area de un circulo.
      Recordar que el area es: PIxradio2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double area;
        System.out.print("Ingrese radio:");
        radio = sc.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        System.out.println("Area del circulo:" + area);
    }
}
