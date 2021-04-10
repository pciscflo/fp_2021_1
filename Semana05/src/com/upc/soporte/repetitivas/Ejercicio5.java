package com.upc.soporte.repetitivas;

public class Ejercicio5 {
    /*
    Desarrollar los siguientes métodos:
   1) Que reciba un número positivo entero y retorne la suma de sus dígitos
   2) Que retorne la suma de los cuadrados los n primeros numero enteros desde 1.
   3) Que retorne la suma de los cubos de los n primeros números múltiplos de 3.
   */
    public static void main(String[] args) {
        System.out.println(obtenerSumaDigitos(5555));
        System.out.println(obtenerSumaDigitosBreak(5555));
    }
    public static int obtenerSumaDigitos(int numero){
        int digito, suma =0;
        while(numero>0){
            digito = numero % 10;
            suma = suma + digito;
            numero = numero /10;
        }
        return suma;
    }
    public static int obtenerSumaDigitosBreak(int numero){
        int digito, suma =0;
        while(true){
            digito = numero % 10;
            suma = suma + digito;
            numero = numero /10;
            if (numero == 0){
                break;
            }
        }
        return suma;
    }
}
