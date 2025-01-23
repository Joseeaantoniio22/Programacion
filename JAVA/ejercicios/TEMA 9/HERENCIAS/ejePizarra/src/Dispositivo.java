public abstract class Dispositivo {
    private static int contadorDisp = 0;
    protected String marca;

    Dispositivo(String marca) {
        contadorDisp++;
        this.marca = marca;
    }

    public static int getContadorDisp() {
        return contadorDisp;
    }

    public String toString(String marca) {
        return "Tu dispositivo es de marca " + marca;
    }
}
