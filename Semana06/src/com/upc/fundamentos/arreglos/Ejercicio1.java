package com.upc.fundamentos.arreglos;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] alumnos = {12,16,19,17,14,12};
        int suma = 0 ;
        //practicando...
        System.out.println(alumnos[5]);//12 (5 es el indice o posicion) ok
       // System.out.println(alumnos[6]);// (la posicion o indice 6 no existe, da error)
        System.out.println(alumnos.length); // 6 ok
        int prueba;
        prueba = alumnos[0] + alumnos[4];
        System.out.println(prueba);// 12 + 14 = 26 ok
        System.out.println("------ Con arreglos ----");
        for (int i=0; i<alumnos.length;i++){
            //System.out.println(alumnos[i]);
            suma+=alumnos[i];
        }
        System.out.println("Suma:"+ suma);
        System.out.println("-------Mayor nota------");
        int maximo=0;
        for(int i=0; i<alumnos.length;i++){
            if (alumnos[i]>maximo){
                maximo = alumnos[i];//19
            }
        }
        System.out.println("Mayor nota:" + maximo);


    }
}
