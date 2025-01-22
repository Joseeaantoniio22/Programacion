public class App {
    public static void main(String[] args) throws Exception {
        int numero[][] = new int[2][3];
        int fila = 0;
        int columna = 0;
        int total = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Dime los numeros de la " + (i + 1) + " fila.");
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println(" ");
            for (int i = 0; i < numero.length; i++) {
            fila = 0;
            for (int j = 0; j < numero[i].length; j++) {
                System.out.print(numero[i][j] + "   ");
                fila += numero[i][j];
            }
            total += fila;
            System.out.println("El sumatorio de esta fila es de: " + fila);
            System.out.println("");
        }
        for (int j = 0; j < numero[0].length; j++) {
            for (int i = 0; i < numero.length; i++) {
                columna += numero[i][j];
            }
            total += columna;
            System.out.print(columna + "   ");
            columna = 0;
        }
        System.out.println("El total del sumatorio de la tabla es de: "+total);
    }

}
