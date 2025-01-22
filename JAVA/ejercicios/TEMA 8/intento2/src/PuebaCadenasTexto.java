import org.alanturing.texto.CadenasTexto;;
public class PuebaCadenasTexto {
    public static void main(String[] args) throws Exception {
        String palabra="dabale arroz a la zorra el abad";
        System.out.println(CadenasTexto.contadorVocales(palabra));
        System.out.println(CadenasTexto.invertirPalabra(palabra));
        System.out.println(CadenasTexto.esPolidromo(palabra));
        System.out.println(CadenasTexto.quitarEspacios(palabra));
    }
}
