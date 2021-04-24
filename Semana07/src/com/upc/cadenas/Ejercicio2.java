package com.upc.cadenas;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Pedro", "Jorge"};
        System.out.println(nombres[0].substring(0,1));//C
        System.out.println("-----------------");
        //imprimir la primera letra se cada nombre del arreglo
        for (int i=0; i<nombres.length;i++){
            System.out.println(nombres[i].substring(0,1));
        }
        System.out.println("---- Años -------");
        //u201724635, u202116648, u202117960,  el año de ingreso se encuentra a partir del segundo
        //caracter
        //imprimir el año de ingreso de cada uno de los alumnos
        String[] codigos ={"u201724635", "u202116648", "u202117960"};
        for(int i=0; i<codigos.length;i++){
            System.out.println(codigos[i].substring(1,5));
        }




    }
}
