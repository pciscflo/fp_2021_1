package com.fundamentos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre=null, mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre = scanner.nextLine();
        if (nombre.equals("Pepe")){ // para comparar cadenas se usa equals
            mensaje = "Encontrado";
        }else{
            mensaje = "No Existe";
        }
        System.out.println(mensaje);
    }
}
