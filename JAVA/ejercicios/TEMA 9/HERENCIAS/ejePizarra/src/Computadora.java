public class Computadora extends Dispositivo implements Encendible {
    private String ram;
    private String disco;
    private String procesador;
    private boolean encendido = false;
    private String programa;

    Computadora(String ram, String disco, String procesador, String marca, boolean encendido, String programa) {
        super(marca);
        this.disco = disco;
        this.ram = ram;
        this.procesador = procesador;
        encendido = false;
        programa = "";
    }

    public void encender() {
        encendido = true;
        programa = "notepad";
    }

    public void apagar() {
        encendido = false;
        programa = "";
    }

    @Override
    public String toString() {
        if (encendido == true) {
            return "Tu ram es de " + ram + ", tienes un disco " + disco + ", tienes un procesador " + procesador
                    + ", tu ordenador esta encendido, y esta en el programa " + programa + " y es de marca " + marca;
        }
        return "Tu ram es de " + ram + ", tienes un disco" + disco + ", tienes un procesador " + procesador
                + ", tu ordenador esta apagado, y esta en el programa" + programa + " y es de marca " + marca;
    }
}
