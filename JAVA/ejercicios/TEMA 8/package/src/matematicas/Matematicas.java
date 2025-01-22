package matematicas;
public class Matematicas {
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int SiguientePrimo(int numero) {
        numero += 1;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }

    public static int voltea(int numero) {
        int numRev = 0;
        while (numero > 0) {
            numRev = numero % 10 + numRev * 10;
            numero /= 10;
        }
        return (numRev);
    }

    public static boolean esCapicua(int numero) {
        if (numero == voltea(numero)) {
            return true;
        }
        return false;
    }

    public static int Digitos(int numero) {
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static int Potencia(int base, int exponente) {
        int potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
        }
        return potencia;
    }

    public static int DigitosN(int numero, int posicion) {
        numero = voltea(numero);
        int digito = 0;
        for (int i = -1; i < posicion; i++) {
            digito = numero;
            digito %= 10;
            numero /= 10;
        }
        return digito;
    }

    public static int PosicionDeDigito(int numero, int posicionNumero) {
        int contador = 0;
        numero = voltea(numero);
        while (numero % 10 != posicionNumero) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static int QuitaPorDetras(int numero, int QuitarDigitos){
        for (int i = 0; i < QuitarDigitos; i++) {
            numero/=10;
        }
        return numero;
    }

    public static int QuitaPorDelante(int numero, int QuitarDigitos){
        numero=voltea(numero);
        numero=QuitaPorDetras(numero,QuitarDigitos);
        numero=voltea(numero);
        return numero;
    }
    public static int pegPorDetras(int numero, int digito){
        numero*=10;
        numero=numero+digito;
        return numero;
    }
    public static int pegaPorDelante(int numero, int digito){
        numero=voltea(numero);
        numero*=10;
        numero+=digito;
        numero=voltea(numero);
        return numero;
    }
    public static void main(String[] args) {
        System.out.println(pegaPorDelante(23456, 2));
    }
}
