public class App {
    public static void main(String[] args) throws Exception {
        int numeroAleatorio = 0;
        int digitos = 0;
        System.out.print("Dame el valor minimo del numero: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Dame el valor maximo del numero: ");
        int b = Integer.parseInt(System.console().readLine());
        numeroAleatorio = (int) (Math.random() * (b - a + 1) + a);
        System.out.println(numeroAleatorio);
        while (numeroAleatorio > 0) {
            digitos = (numeroAleatorio % 10);
            numeroAleatorio = numeroAleatorio / 10;
            System.out.println(" ");
            System.out.print("| "+digitos+" |");
            for (int colores=1;colores <= digitos; colores++) {
                System.out.print(" * |");

            }
            for (int espacios=digitos ; espacios < 9; espacios++) {
                System.out.print("   |");
            }
        }
    }
}
