package com.upc.fundamentos;

import java.util.Scanner;

public class Ejercicio2 {
    static String [] codigos = {"5633INDG2", "3234MINV4", "1456MINV5", "8938INDP4", "9237PESP2", "4902INDV2"};
    public static int obtenerCantidadProveedores(String rubro){
        int contador = 0;
        for(int i=0; i<codigos.length;i++){
           if(codigos[i].substring(4,7).equals(rubro)){
               contador++;
           }
        }
        return contador;
    }
    public static int obtenerMayorID(String rubro){
        int maximo = 0;
        int valor;
        for (int i=0; i < codigos.length; i++){
            valor = Integer.parseInt(codigos[i].substring(0,4));
            if (valor > maximo && codigos[i].substring(4,7).equals(rubro)){
                maximo = valor;
            }
        }
        return maximo;
    }
    public static String[] obtenerListaProveedoresJV(){
        String [] temporal;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rubro;
        System.out.print("Ingrese rubro:");
        rubro = sc.nextLine();
        System.out.println("Cantidad de Proveedores:" + obtenerCantidadProveedores(rubro));
        System.out.println("El mayor ID es: " + obtenerMayorID(rubro));

    }
}
