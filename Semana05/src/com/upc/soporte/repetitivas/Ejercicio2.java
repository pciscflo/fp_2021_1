package com.upc.soporte.repetitivas;

public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 0;
        while (a<=18){
            a++;//1,2,3,19
            System.out.println(a);//1,2,3,  ... 18,19
        }
        System.out.println("------------");
        a=0;
        while (a<=18){
            System.out.println(a);//0,1,2,3,  ... ,18
            a++;//1,2,3,18, 19
        }
    }
}
