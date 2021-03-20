package com.fundamentos;
import java.util.Scanner;



public class Ejercicio3 {


        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            double altura, largo, ancho,costom3,m3cubico;
            System.out.print("Ingresa altura:");
            altura = scanner.nextDouble();
            System.out.print("Ingresa largo:");
            largo = scanner.nextDouble();
            System.out.print("Ingresa ancho:");
            ancho = scanner.nextDouble();
            System.out.print("Ingresa costo por m3:");
            costom3 = scanner.nextDouble();
            m3cubico = altura*largo*ancho;
            System.out.print("Total a cobrar " + costom3 * m3cubico);
        }

    }
