package com.fundamentos;

public class Ejercicio3 {
    /*
    Dado un numero entero, determinar si es positivo, negativo o nul(cero)
    Desarrolle un metodo(funcion) que reciba el número y retorne el resultado.
    La función (subproceso) debe llamarse queTipo
     */
    public static String queTipo(int numero){
        String respuesta;
        if (numero > 0) {
            respuesta = "Positivo";
        } else if (numero < 0) {
            respuesta = "Negativo";
        } else {
            respuesta = "Nulo";
        }
        return respuesta;
    }
    public static double sumar(double a,  double b){
        double s;
        s = a + b;
        return s;
    }

    public static void main(String[] args) {
        String r;
        double s;
        r = queTipo(100);
        System.out.println(r);
        r = queTipo(-8);
        System.out.println(r);
        s = sumar(2.5,2.5);
        System.out.println("Suma:" + s);
    }
}
