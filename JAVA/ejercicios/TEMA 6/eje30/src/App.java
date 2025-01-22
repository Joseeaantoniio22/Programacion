public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i==0 || i==altura-1 ) {
                    System.out.print("*");
                }
                else if (j>=1 && j<=anchura-2) {
                    System.out.print(" ");
                }
                else if (j==0 || j==anchura-1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
