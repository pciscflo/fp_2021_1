package com.upc.soporte.repetitivas;

public class Ejercicio3 {
    /*
    El sueldo de una trabajador se inicia en 500 soles
    y en cada mes se incrementa en 20%.
    Cuanto meses pasará para que gane por lo menos 1500 soles?
     */
    public static void main(String[] args) {
        double sueldo =500;
        int meses=1;
        while(sueldo<=1500) {
            sueldo = sueldo + 0.20 * sueldo; //600,......1460,1791
            //System.out.println(sueldo);
            meses++; //2,.....
        }
        System.out.println("Meses:" + meses);
    }
}
