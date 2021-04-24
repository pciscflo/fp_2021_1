package com.upc.cadenas;

public class Ejercicio3a {
    static String[] codigos = {"AR000101", "PE125610", "CH452315","BR521317", "BR123620","PE752124",
            "AR124511", "PE262405", "PE563222", "BR452102", "AR455210"};

    public static int obtenerCantidadProductos(String nacionalidad){
        int contador = 0;
        for (int i=0; i< codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                contador++;
            }
        }
        return contador;
    }

    public static int obtenerMaximoCorrelativo(String nacionalidad){
        int maximo =0;
        for(int i=0 ; i<codigos.length;i++){
            //para comparar un string vs un numero hay que convertir el string a numero entero
            //Integer.parseInt(cadenaNumerica)
            if(Integer.parseInt(codigos[i].substring(2,6)) > maximo  && codigos[i].substring(0,2).equals(nacionalidad)){
                maximo = Integer.parseInt(codigos[i].substring(2,6));
            }
        }
        return maximo;
    }
    public static int calcularCostoAlmacenajeTotal(String nacionalidad){
        int suma =0;
        for(int i=0 ; i<codigos.length;i++){
            if(codigos[i].substring(0,2).equals(nacionalidad)){
                //sumar el costo de almacenar ese producto
                suma+= Integer.parseInt(codigos[i].substring(6,8));
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(obtenerCantidadProductos("PE"));
        System.out.println(obtenerMaximoCorrelativo("AR"));
        System.out.println(calcularCostoAlmacenajeTotal("AR"));
    }
}
