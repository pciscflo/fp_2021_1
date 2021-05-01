package com.upc.cadenas;

public class Ejercicio4 {

//Ejemplo
    public static int calcularMontoPagar(String codigoPromocional, String tipoEntrada, String[] listaCodigos,
                                         int[] descuentos) {
        int precioEntrada=0, descuento=0;
        switch (tipoEntrada) {
            case "normal":
                precioEntrada = 700;
                break;
            case "silver":
                precioEntrada = 1700;
                break;
            case "gold":
                precioEntrada = 2700;
                break;
        }
        //busco en la lista de codigos el codigo promocional del asistente al evento
        for (int i=0;  i< listaCodigos.length;i++){
            if(codigoPromocional.equals(listaCodigos[i])){
                descuento = descuentos[i];
            }
        }
        return precioEntrada-descuento;
    }

    public static  boolean validarCodigoPromocional(String codigoPromocional, String[] codigosPromocionales){
        boolean valido1 = true, valido2=false;
        if(codigoPromocional.length()!=10){
            valido1 = false;
        }
        for(int i=0; i<codigosPromocionales.length;i++){
            if (codigoPromocional.equals(codigosPromocionales[i])){
                valido2=true;
            }
        }
        if (valido1 == true && valido2 == true){
            return true;
        }else {
            return false;
        }
    }
    public static  boolean validarCodigoPromocional2(String codigoPromocional, String[] codigosPromocionales){
        boolean valido1 = true, valido2=false;
        if(codigoPromocional.length()!=10){
           return false;
        }
        for(int i=0; i<codigosPromocionales.length;i++){
            if (codigoPromocional.equals(codigosPromocionales[i])){
                valido2=true;
            }
        }
       return valido2;
    }
    public static void main(String[] args) {
        String[] codigosPromocionales = {"AVIAV1223D", "LANLA0342T", "AARAA0034D", "COPCP0234D", "ASDF123456"};
        int[] descuentos = {300, 900, 1200, 400, 100};

        System.out.println(calcularMontoPagar("AVIAV1223D", "normal", codigosPromocionales,
                descuentos));



    }
}
