package com.fundamentos;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, arectangulo, atriangulo,aterreno;
        System.out.print("Ingresa lado a:");
        a = scanner.nextDouble();
        System.out.print("Ingresa lado b:");
        b = scanner.nextDouble();
        System.out.print("Ingresa lado c:");
        c = scanner.nextDouble();
        arectangulo = b*c;
        atriangulo = b*(a-c)/2;
        aterreno = arectangulo + atriangulo;
        System.out.println("Area del terreno:"+aterreno);

    }
}
