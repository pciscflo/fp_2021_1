package com.upc.soporte.repetitivas;

public class Ejercicio4 {
    /*
   El sueldo de una trabajador se inicia en 500 soles
   y en cada mes se incrementa en 20%.
   Cuanto meses pasará para que gane por lo menos 1500 soles?
   Desarrolle un método que reciba como parámetro el sueldo
   inicial del trabajador y retorne la cantidad de meses
   que debe pasar.
    */
    public static void main(String[] args) {
        int meses;
        meses = obtenerMeses(500);
        System.out.println("Meses:" + meses);
    }
    public static int obtenerMeses(double sueldo){
        int meses=1;
        while(sueldo<=1500) {
            sueldo = sueldo + 0.20 * sueldo; //600,......1460,1791
            //System.out.println(sueldo);
            meses++; //2,.....
        }
       return meses;
    }
}
