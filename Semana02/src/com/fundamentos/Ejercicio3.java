package com.fundamentos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,l,n, valorxM3;
        double costo;
        System.out.print("Ingresar ValorxM^3: ");
        valorxM3 = scanner.nextDouble();
        System.out.print("Ingresar Altura: ");
        a = scanner.nextDouble();
        System.out.print("Ingresar Largo: " );
        l = scanner.nextDouble();
        System.out.print("Ingresar Ancho: " );
        n = scanner.nextDouble();
        costo = a*l*n*valorxM3;
        System.out.println("Importe a pagar: " + costo);

    }
}
