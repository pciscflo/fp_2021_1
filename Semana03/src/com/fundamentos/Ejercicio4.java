package com.fundamentos;

public class Ejercicio4 {
    public static void main(String[] args) {
        int opcion;
        opcion = 3;
        double tasa=0;
        double sueldo = 1000;//reemplazar por el scanner
        switch (opcion){ // variable controladora
            case 1:
                tasa = 0.10;
                break;
            case 2:
                tasa = 0.23;
                break;
            case 3:
                tasa = 0.50;
                break;
            default:
                tasa = 0;
        }
        sueldo = sueldo + sueldo*tasa;
        System.out.println("Nuevo sueldo:" + sueldo);
        System.out.printf("Nuevo sueldo: %.2f", sueldo);
    }
}
