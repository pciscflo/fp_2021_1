package com.fundamentos;

import java.util.Scanner;

public class Ejercicio1 {
    /*
       Calcular el sueldo neto de un trabajador, sabiendo
       que tiene un sueldo básico y que recibe un bono
       de 50 soles por hijo, adicionalmente se le descuenta
       el 13% por afp.
       - calcularBono(numeroHijos)
       - calcularDescuentoAFP(sueldoBasico)
       - calcularSueldoNeto(numeroHijos, sueldoBasico)
       ** un método puede llamar o invocar a otro método
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroHijos;
        double sueldoBasico, bono, descuentoAFP;
        System.out.print("Ingresar Sueldo Básico:");
        sueldoBasico = sc.nextDouble();
        System.out.print("Ingresar Número de Hijos:");
        numeroHijos = sc.nextInt();
        bono = calcularBono(numeroHijos);
        descuentoAFP = calcularDescuentoAFP(sueldoBasico);
        System.out.println("Bono:" + bono);
        System.out.println("Descuento de AFP:" + descuentoAFP);
        System.out.println("Sueldo Neto:" + calcularSueldoNeto(numeroHijos,sueldoBasico));
    }
    //evita la redundancia
    public static double calcularBono(int numeroHijos){
        double bono;
        bono = 50*numeroHijos;
        return bono;
    }
    public static double calcularDescuentoAFP(double sueldoBasico){
        double afp;
        afp = sueldoBasico*0.13;
        return afp;
    }
    public static  double calcularSueldoNeto(int numeroHijos, double sueldoBasico){
        double neto;
        neto = sueldoBasico + calcularBono(numeroHijos) - calcularDescuentoAFP(sueldoBasico);
        return neto;
    }
}
