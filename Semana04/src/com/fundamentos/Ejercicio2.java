package com.fundamentos;

public class Ejercicio2 {
    public static void main(String[] args) {
        int monto = 0; //acumuluador : acumulador = acumulador + incremento(variable)
        //acumula los diversos valores que toma la variable(incremento)
        int contador = 0; //contador = contador + 1 (incremento es una constante)
        int cantidad1 = 20, cantidad2 = 30;
        monto = monto + cantidad1; //nuevo valor de monto es igual valor anterior de monto + cantidad1
        //monto 20
        System.out.println(monto);
        monto = monto + cantidad2;//nuevo valor de monto es igual valor anterior de monto + cantidad2
        //monto 50
        System.out.println(monto);
        //el contador no acumula solo cuenta
        contador = contador + 1;//1 se lee nuevo valor es igual al valora enterior + 1
        contador = contador + 1;//2
        contador = contador + 1;//3
        System.out.println(contador);//3

    }
}
