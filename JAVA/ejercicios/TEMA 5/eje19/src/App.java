public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime la altura de la piramide:");
        int alutra =Integer.parseInt(System.console().readLine());
        int fila=1;
        int columna=0;
        while (fila<=alutra) {
            columna=0;
            while (columna<=alutra-1-fila) {
                System.out.print(" ");
                columna++;
            }
            columna=0;
            while (columna<fila*2-1) {
                System.out.print("*");
                columna++;
            }
            
            System.out.println(" ");
            fila++;
        }
    }
}
