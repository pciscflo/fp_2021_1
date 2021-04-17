package com.upc.fundamentos.arreglos;

public class Ejercicio4 {
    /*
    Una empresa vendedora de fotocopiadoras necesita calcular cual ha sido el volumen de ventas
    de cada uno de sus agentes comerciales durante el presente mes y en base a eso determinar
    distintos indicadores, así como montos a pagar en comisión de ventas.
    Como ejemplo, tenemos los siguientes valores de prueba:
    Vendedores	Ventas
    Hugo	      15
    Mariana	      16
    Luis	       1
    Jennifer	   0 --> i = 3 -- ventas[i] ----vendedores[i]
    Jorge	       4
    Valeria	      15
    Manuel	      13
Se le solicita:
a)	Obtener el total de unidades vendidas durante el presente mes.
    Para eso se tiene como dato de entrada un arreglo con la cantidad de unidades
    vendidas por cada agente comercial.
b)	Si se sabe que la cuota de venta de cada vendedor es 5 unidades,
    determinar cuál es el porcentaje de vendedores que superaron la cuota de venta.
    Para eso se tiene como dato de entrada un arreglo con la cantidad de unidades
    vendidas por cada agente comercial.
c)	Se desea saber quién(es) fueron los agentes de ventas que superaron la cuota de venta.
d)	Si se sabe que por cada unidad vendida se tiene que pagar una comisión de ventas
    de 300 soles, determinar cuánto es lo que se tiene que pagar como comisión este mes.
     */

    public static void main(String[] args) {
        String[] vendedores = {"Hugo", "Mariana","Luis","Jennifer","Jorge", "Valeria", "Manuel"};
        int[] ventas = {15, 16, 1, 0, 4, 15, 13};
        System.out.println("Unidades Vendidas Total:"+ obtenerTotalUnidadesVendidas(ventas));

    }
    public static int obtenerTotalUnidadesVendidas(int[] ventas){
        int suma=0;
        for(int i=0 ; i<ventas.length; i++){
            suma+=ventas[i];
        }
        return suma;
    }
}
