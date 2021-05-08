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
        String [] temporal = new String[codigos.length-1];
        //6 elementos {"3234MINV4", "1456MINV5", "8938INDP4", null,null, null}
        int j=0;
        for(int i=0; i<codigos.length;i++){
            if(codigos[i].substring(8,9).equals("4") || codigos[i].substring(8,9).equals("5")){
                temporal[j]=codigos[i];//se asigna el codigo que cumple la condicion
                j++;//tamaño del arreglo de los que cumplen la condicion
            }
        }
        //Para que solo devuelva un arreglo sin valores nulos
        String[] arrF = new String[j];//arreglo de 3 elementos
        System.arraycopy(temporal, 0, arrF, 0, arrF.length);
        //{"3234MINV4", "1456MINV5", "8938INDP4"}
        return arrF;//o simplemente return temporal
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String rubro;
        System.out.print("Ingrese rubro:");
        rubro = sc.nextLine();
        System.out.println("Cantidad de Proveedores:" + obtenerCantidadProveedores(rubro));
        System.out.println("El mayor ID es: " + obtenerMayorID(rubro));
        System.out.println("----- Listado de JUE-VI -----");
        String[] listado;
        listado = obtenerListaProveedoresJV();
        for (int i=0; i<listado.length;i++){
            System.out.println(listado[i]);
        }
    }
}
