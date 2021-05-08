package com.upc.repaso;

public class Ejercicio1 {
    static String[] codigosDeAtencion = {"LM12122019G00500230",
                                         "LM12122019G00500050",
                                         "SB01012020X10000800",
                                         "SB23052019C00500050",
                                         "SU13102018E01000100",
                                         "LM13102019E01002000",
                                         "SB27042020C00500100",
                                         "LM11112020X05000120",
                                         "SU22072018X09000400",
                                         "SU06062029C00500180"};

    public static double obtenerPorcentajeAtencionesRealizadas(String distrito){
        int contadorDistritos=0;
        double porcentajeAtenciones;
        for(int i=0; i< codigosDeAtencion.length;i++){
            if(codigosDeAtencion[i].substring(0,2).equals(distrito)){
                contadorDistritos++;
            }
        }
        porcentajeAtenciones = 100*(contadorDistritos*1.0)/codigosDeAtencion.length;
        return porcentajeAtenciones;
    }
    public static double obtenerMontoTotalxConsultas(String tipoConsulta){

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(obtenerPorcentajeAtencionesRealizadas("LM"));
    }
}
