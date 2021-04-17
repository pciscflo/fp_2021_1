package com.upc.fundamentos.arreglos;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] alumnos = {12,9,19,17,14,12};
        int s, maximo;
        double promedio;
        s = calcularSuma(alumnos);
        System.out.println("Suma:" + s);
        maximo = obtenerMayorNota(alumnos);
        System.out.println("Mayor nota:" + maximo);
        promedio = calcularPromedio(alumnos);
        System.out.printf("Promedio:%.2f\n", promedio);
        System.out.println("Cantidad de Desaprobados:" + calcularCantidadDesaprobados(alumnos));
    }
    //calcule la cantidad de alumnos desaprobados
    public static int calcularCantidadDesaprobados(int[] alumnos){
        int contadorDesaprobados=0;
        for (int i=0; i<alumnos.length;i++){
            if(alumnos[i]<13){
                contadorDesaprobados = contadorDesaprobados + 1;//contadorDesaprobados++;
            }
        }
        return contadorDesaprobados;//2
    }

    public static int calcularSuma(int[] alumnos){
        int suma =0;
        for (int i=0; i<alumnos.length;i++){
            suma+=alumnos[i];
        }
       return suma;
    }
    public static double calcularPromedio(int[] alumnos){
      double promedio;
      promedio = calcularSuma(alumnos)*1.0/alumnos.length;
      return promedio;
    }
    public static int obtenerMayorNota(int[] alumnos){
        int maximo=0;
        for(int i=0; i<alumnos.length;i++){
            if (alumnos[i]>maximo){
                maximo = alumnos[i];//19
            }
        }
        return maximo;
    }

}
