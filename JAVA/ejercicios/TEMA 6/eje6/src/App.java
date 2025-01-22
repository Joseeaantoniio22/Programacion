public class App {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 100;
        int numero = (int) (Math.random() * (b - a + 1)) + a;
        int intentos = 0;
        int numeroIntroducido = 0;
        while (numeroIntroducido != numero && intentos < 5) {
            System.out.println(numero);
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            intentos++;
            if (numeroIntroducido != numero) {
                if (numeroIntroducido < numero) {
                    System.out.println("El numero introducido es menor que el numero aleatorio");
                } else if (numeroIntroducido > numero) {
                    System.out.println("El numero introcido es mayor que el numero aleatorio.");
                }
                System.out.println("Llevas " + intentos + " intentos de 5.");
            } else {
                System.out.println("Has acertado el numero aleatorio");
            }
        }
    }
}
