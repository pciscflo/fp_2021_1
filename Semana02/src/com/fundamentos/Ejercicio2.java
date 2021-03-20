package com.fundamentos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int horaslaborables;//ojo es entero
        double importe;//ojo es real
        final double PORCENTAJE=0.10;//ojo es constante
        double descuento;
        double sueldo;
        double pagototal;
        System.out.print("Ingrese horas de trabajo:");
        horaslaborables=scanner.nextInt();
        System.out.print("Costo de horas de trabajo:");
        importe=scanner.nextDouble();
        sueldo=horaslaborables*importe;//por partes mejor
        descuento=sueldo*PORCENTAJE;
        pagototal=sueldo-descuento;
        System.out.println("Pago total: " + pagototal);
    }
}
