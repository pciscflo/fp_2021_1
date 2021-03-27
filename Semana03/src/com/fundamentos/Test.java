package com.fundamentos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int numero;
        numero = 20;
        String respuesta;
        if (numero > 0) {

            respuesta = "Positivo";

        } else if (numero < 0) {

            respuesta = "Negativo";

        } else  {

            respuesta = "Nulo";

        }
        System.out.println(respuesta);
    }
}
