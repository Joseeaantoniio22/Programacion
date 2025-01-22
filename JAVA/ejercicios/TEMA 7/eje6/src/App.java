public class App {
    public static void main(String[] args) throws Exception {
        int numero[] = new int[5];
        int ult = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Dime un numero: ");
            numero[i] = Integer.parseInt(System.console().readLine());
            if (numero[i] != ult) {
                ult = numero[i];
            }
        }
        for (int i = 0; i < numero.length; i++) {
            if (i == 0) {
                System.out.println("Posicion " + i + ": " + ult);
            } else {
                System.out.println("Posicion " + i + ": " + numero[i - 1]);
            }
        }
    }
}
