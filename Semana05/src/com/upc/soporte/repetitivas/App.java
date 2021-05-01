package com.upc.soporte.repetitivas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoPerfilContratado;
        int cancionesTotalesIngles,cancionesTotalesEspaniol;
        double pagoTotal;
        System.out.print("Ingrese el tipo de perfil contratado: ");
        tipoPerfilContratado=sc.next();
        System.out.print("Ingrese la cantidad de canciones escuchadas en Ingles: ");
        cancionesTotalesIngles= sc.nextInt();
        System.out.print("Ingrese la cantidad de canciones escuchadas en español: ");
        cancionesTotalesEspaniol= sc.nextInt();
        pagoTotal=obtenerImportePagarPorTipodePerfil(tipoPerfilContratado,cancionesTotalesIngles,cancionesTotalesEspaniol);

        System.out.println("El pago total por el perfil contratado es el siguiente: " + pagoTotal);



    }
    public static double obtenerImportePagarPerfilUnico(int cancionesIngles, int cancionesEspaniol){
        double importePagarIn=0,importePagarEs=0,importePagarUnico;
        double tarifaMensual=30;

        for (int i=1;i<=cancionesIngles;i++){
            if (i<=10){
                importePagarIn= importePagarIn + 3;
            }
            else {
                importePagarIn= importePagarIn + 1.5;
            }

        }
        for (int j=1;j<=cancionesEspaniol;j++){
            if (j<=10){
                importePagarEs=  importePagarEs + 2;
            }
            else {
                importePagarEs= importePagarEs + 1;
            }
        }
        importePagarUnico = tarifaMensual + importePagarIn + importePagarEs;

        return importePagarUnico;
    }
    public static double obtenerImportePagarPerfilGrupal(int cancionesIngles, int cancionesEspaniol){
        double importePagarIn=0,importePagarEs=0,importePagarGrupal;
        double tarifaMensual=70;

        for (int i=1;i<=cancionesIngles;i++){
            if (i<=15){
                importePagarIn=  importePagarIn + 2.5;
            }
            else {
                importePagarIn= importePagarIn + 1;
            }
        }
        for (int j=1;j<=cancionesEspaniol;j++){
            if (j<=15){
                importePagarEs= importePagarEs + 1.5;
            }
            else {
                importePagarEs= importePagarEs + 0.5;
            }
        }
        importePagarGrupal = tarifaMensual + importePagarIn + importePagarEs;

        return importePagarGrupal;
    }

    public static double obtenerImportePagarPorTipodePerfil (String tipoPerfil, int cancionesIngles, int cancionesEspaniol){
        double importePagarTotal=0;
        switch (tipoPerfil){
            case "Único":
                importePagarTotal=obtenerImportePagarPerfilUnico(cancionesIngles,cancionesEspaniol);
                break;
            case "Grupal":
                importePagarTotal=obtenerImportePagarPerfilGrupal(cancionesIngles,cancionesEspaniol);
                break;
        }
        return importePagarTotal;
    }
}
