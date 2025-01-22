public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime un numero que va a ser la altura de tu píramide: ");
        int num = Integer.parseInt(System.console().readLine());
        int fila=0;
        int colu=0;
        while (fila<=num) {
            colu=0;
            while (colu<=fila) {
                System.out.print("*");
                colu++;
            }
            System.out.println(" ");
            fila++;
        }
    }
}
