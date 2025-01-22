public class App {
    public static void main(String[] args) throws Exception {
        int sumatorio=0;
        int contador=0;
        while (sumatorio<10000) {
            System.out.print("Dime un numero y te lo voy a ir sumando, el programa parará cuando llegue a 10000: ");
            int numeros = Integer.parseInt(System.console().readLine());
            sumatorio=sumatorio+numeros;
            contador++;
        }
        System.out.println("La media de tus numeros introducidos es: "+sumatorio/contador);
    }
}
