package com.upc.soporte.repetitivas;

public class Ejercicio6 {
/*
 Una empresa tiene como reglamento dar aumento de sueldo a sus trabajadores
 todos los años, el porcentaje de aumento está dado de acuerdo con el tipo
 de trabajador: Gerente (g) o empleado (e). Los gerentes reciben un aumento
 del 14% anual y los empleados reciben el 8% anual. Cada 4 años en vez de 14%
 reciben 18% y en vez de 8% reciben 12% (dependiendo del tipo de trabajador).
 Desarrollar los módulos que determinen el sueldo que tendrá un trabajador
 después de N años y el porcentaje de aumento de sueldo que ha obtenido
 comparando su sueldo original y su sueldo después de N años. Tenga en cuenta
 que los aumentos obtenidos van a su sueldo.
 Se le solicita lo siguiente:
   a.	Cálculo del sueldo después de N años
   b.	Calcular el porcentaje de aumento después de N años.
 */
public static void main(String[] args) {
    /// etc...
    double sueldoFinal;
    sueldoFinal = obtenerSueldoTrabajador2(2,1000,"Gerente");//ok
    System.out.println("Sueldo Final:" + sueldoFinal);//prueba unitaria ok
    System.out.println("Porcentaje de Aumento:" + porcentajeAumento(2, 1000, "Gerente"));//ok
    // System.out.println("Porcentaje de aumento: " +  porcentajeAumento(1000, sueldoFinal));//opcional

}

    public static double porcentajeAumento(int n, double sueldo, String cargo){
        double sueldoFinal, porcentaje;
        sueldoFinal = obtenerSueldoTrabajador2(n,sueldo,cargo);
        porcentaje = (sueldo / sueldoFinal)*100;
        return porcentaje;
    }
    public static double obtenerSueldoTrabajador2(int n, double sueldo, String cargo) {
        double incremento=0;
        for (int i = 1; i <= n; ++i) {
            if ("Gerente".equalsIgnoreCase(cargo)) {
                if (n % 4 == 0) {
                    incremento =  (0.18 * sueldo);
                } else {
                    incremento =  (0.14 * sueldo);
                }
            } else {
                if (n % 4 == 0) {
                    incremento =  (0.12 * sueldo);
                } else {
                    incremento =  (0.8 * sueldo);
                }
            }
            sueldo = sueldo + incremento;
        }
        return sueldo;
    }

    public static double porcentajeAumento(double sueldoInicial, double sueldoFinal){
        return (sueldoInicial/sueldoFinal)*100;
    }
}
