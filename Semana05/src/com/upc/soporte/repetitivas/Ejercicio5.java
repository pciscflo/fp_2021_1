package com.upc.soporte.repetitivas;

public class Ejercicio5 {
    /*
    Desarrollar los siguientes métodos:
   1) Que reciba un número positivo entero y retorne la suma de sus dígitos
   2) Que retorne la suma de los cuadrados los n primeros numero enteros desde 1.
      1^2 + 2^2 + 3^2 + .......n^2
   3) Que retorne la suma de los cubos de los n primeros números múltiplos de 3.
       3^3 + 6^3 + 9^3 ....+ n términos
   */
    public static void main(String[] args) {
        System.out.println(obtenerSumaDigitos(5555));
        System.out.println(obtenerSumaDigitosBreak(5555));
        System.out.println("Suma de Cuadrados:" + sumarCuadrados(2));
        System.out.println("Suma de Cubos:" + sumarCubosMultiplosDe3(2));
        System.out.println("Suma de Cubos:" + sumarCubosMultiplosDe3Sol(2));
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
    public static int sumarCuadrados(int n){
        int suma = 0;
        for(int i=1 ; i<=n; i++){

            suma+=Math.pow(i,2);//suma = suma + Math.pow(i,2)
        }
        return suma;
    }
    public static int sumarCubosMultiplosDe3(int n){
        int suma = 0;
        int contadorTerminos =0;
        for(int i=1 ; contadorTerminos < n; i++){
            if(i % 3 == 0) {
                suma += Math.pow(i, 3);//suma = suma + Math.pow(i,2) //3^3 + 6^3
                contadorTerminos++;//1,2
            }
        }
        return suma;
    }
    public static int sumarCubosMultiplosDe3Sol(int n){
        int suma = 0;
        int contadorTerminos =0;
        for(int i=3 ; contadorTerminos < n; i+=3){  //i = i + 3
            suma += Math.pow(i, 3);//suma = suma + Math.pow(i,2) //3^3 + 6^3
            contadorTerminos++;//1,2

        }
        return suma;
    }
}
