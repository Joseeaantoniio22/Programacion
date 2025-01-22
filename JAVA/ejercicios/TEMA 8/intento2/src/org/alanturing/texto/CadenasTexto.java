package org.alanturing.texto;

public class CadenasTexto {
    public static int contadorVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static String quitarEspacios(String palabra){
        String palabraEspacio="";
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)!=' ') {
                palabraEspacio+=palabra.charAt(i);
            }
        }
        return palabraEspacio;
    }

    public static String invertirPalabra(String palabra) {
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }
        return palabraInvertida;
    }

    public static boolean esPolidromo(String palabra){
        String palabraInvertida="";
        palabra=quitarEspacios(palabra);
        palabraInvertida=quitarEspacios(palabra);
        if (palabraInvertida.equals(palabra)) {
            return true;
        }
        return false;
    }
}
