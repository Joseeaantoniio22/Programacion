public class GestorDispositivo {
    public static final int MAX = 10;

    public static void main(String[] args) {
        Dispositivo[] misDispositivos = new Dispositivo[MAX];
        misDispositivos[0] = new Computadora("16Gb", "1TB", "i7 12400F", "HP", true, "notepad");
        misDispositivos[1] = new Televisor("Canal Sur", "Oled", false, 34, "Toshiba");
        for (int i = 0; i < Dispositivo.getContadorDisp(); i++) {
            ((Encendible) misDispositivos[i]).encender();
            System.out.println(misDispositivos[i]);
        }
    }
}
