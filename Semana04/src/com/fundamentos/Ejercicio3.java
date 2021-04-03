package com.fundamentos;

import java.util.Scanner;

public class Ejercicio3 {
    /*
        Un conocido diario ofrece suscripciones anuales a los clientes.
        Con la finalidad de promover este tipo de venta, el diario ha
        ofrecido a otras empresas de diverso índole, suscripciones a
        los trabajadores de dichas empresas con el aval de las mismas.
        Los precios de las suscripciones son las siguientes:
        -	Suscripción a la revista “Vamos”: 150 nuevos soles Anuales.
        -	Suscripción a la revista “Cosas”: 170 nuevos soles Anuales.
        -	Suscripción a la revista “Automas”: 250 nuevos soles Anuales.
        -	Suscripción a la revista “Construye”: 200 nuevos soles Anuales.
        Adicionalmente, dependiendo de la cantidad de suscripciones se
        pueden dar descuentos por volumen:
        -	De 1 a 10 suscripciones, tiene un 0% de descuento.
        -	De 11 a 100 suscripciones, tiene un 15% de descuento.
        -	De 101 a 200 suscripciones, tiene un 21% de descuento.
        -	Más de 200 suscripciones, tiene un 25% de descuento.
        Desarrollar un subprograma que permita determinar el precio de
        cada suscripción, el porcentaje de descuento dependiendo de la
        cantidad de suscripciones a adquirir, así como el total que debería
        pagar la empresa si adquiriera un determinado tipo y número de
        suscripciones
     */

    //Ojo solo para un suscriptor
    public static double obtenerPrecioSuscripcion(String tipoRevista) {
        double precio = 0;
        switch (tipoRevista) {
            case "Vamos":
                precio = 150;
                break;
            case "Cosas":
                precio = 170;
                break;
            case "Automas":
                precio = 250;
                break;
            case "Construye":
                precio = 200;
                break;
        }
        return precio;
    }

    //Descuento global, sobre el total contratado
    public static double obtenerPorcentajeDescuento(int numeroSuscriptores) {
        double porcentaje;
        if (numeroSuscriptores>=1 && numeroSuscriptores<=10){
            porcentaje = 0;
        }else if(numeroSuscriptores>=11 && numeroSuscriptores<=100){
            porcentaje = 0.15;
        }else if(numeroSuscriptores>=101 && numeroSuscriptores<=200){
            porcentaje = 0.21;
        }else if(numeroSuscriptores>200){
            porcentaje = 0.25;
        }else {
            porcentaje =0;
        }
        return porcentaje;
    }

    public static double calcularMontoTotalSuscripciones(String tipoRevista, int numeroSuscripciones) {
        double total, descuento, neto;
        total = obtenerPrecioSuscripcion(tipoRevista)*numeroSuscripciones;
        descuento = total*obtenerPorcentajeDescuento(numeroSuscripciones);
        neto = total - descuento;
        return neto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSuscripciones;
        String tipoRevista;
        double precioCadaSuscripcion, porcentajeDescuento, montoTotal;
        System.out.print("Empresa Ingrese cantidad de suscripciones:");
        numeroSuscripciones = sc.nextInt();
        System.out.print("Empresa Ingrese tipo de Revista:");
        tipoRevista = sc.next();
        precioCadaSuscripcion = obtenerPrecioSuscripcion(tipoRevista);
        System.out.println("Precio de cada suscripcion:" + precioCadaSuscripcion);
        porcentajeDescuento = obtenerPorcentajeDescuento(numeroSuscripciones);
        System.out.println("Porcentaje de descuento:" + porcentajeDescuento);
        montoTotal = calcularMontoTotalSuscripciones(tipoRevista, numeroSuscripciones);
        System.out.println("Total a pagar: " + montoTotal);
    }
}
