package com.upc.fundamentos.arreglos;

public class Ejercicio4 {
    /*
    Una empresa vendedora de fotocopiadoras necesita calcular cual ha sido el volumen de ventas
    de cada uno de sus agentes comerciales durante el presente mes y en base a eso determinar
    distintos indicadores, así como montos a pagar en comisión de ventas.
    Como ejemplo, tenemos los siguientes valores de prueba:
    Vendedores	Ventas
    Hugo	      15--> i=0 ventas[i] -- vendedores[i]
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
        String[]  vendedoresTop;
        System.out.println("a)Unidades Vendidas Total:"+ obtenerTotalUnidadesVendidas(ventas));
        System.out.println("b)Porcentaje Vendedores:" + obtenerPorcentajeVendedoresSuperaronCuota(ventas));
        vendedoresTop = obtenerAgentesSuperanCuota(ventas,vendedores);
        System.out.println("------ Vendedores Top ------");
        for (int i=0; i<vendedoresTop.length;i++){
            System.out.println(vendedoresTop[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Total de Comisiones:" + calculatTotalComisiones(ventas));

    }
    public static double calculatTotalComisiones(int[] ventas){
        int suma=0;
        for(int i=0 ; i<ventas.length; i++){
            suma+=ventas[i]*300;
        }
        return suma;
    }
    public static String[] obtenerAgentesSuperanCuota(int[] ventas, String[] vendedores){
        String[] temporal = new String[vendedores.length];
        int j =0;//indice de vendedores que cumplen la cuota y va de 1 en 1
        for(int i=0; i<ventas.length;i++){
            if (ventas[i]>=5){ //si se supero la cuota
               temporal[j] = vendedores[i];//temporal[0]="Hugo", temporal[1]="Mariana"...j se incia en 0
                j++;//1..
            }
        }
        //Para que solo devuelva un arreglo sin valores nulos, es opcional en los examenes
       String [] arrF = new String[j];
        System.arraycopy(temporal, 0, arrF, 0, arrF.length);
        return arrF; //return temporal;
    }

    public static int obtenerTotalUnidadesVendidas(int[] ventas){
        int suma=0;
        for(int i=0 ; i<ventas.length; i++){
            suma+=ventas[i];
        }
        return suma;
    }
    public  static double obtenerPorcentajeVendedoresSuperaronCuota(int[] ventas){
        int contadorCuotasPositivas=0;
        double porcentaje;
        for (int i=0; i< ventas.length; i++){
            if(ventas[i]>=5){
                contadorCuotasPositivas++;//contadorCuotasPositivas = contadorCuotasPositivas + 1
            }
        }
        porcentaje = 100*contadorCuotasPositivas*1.0/ventas.length;
        return porcentaje;
    }
}
