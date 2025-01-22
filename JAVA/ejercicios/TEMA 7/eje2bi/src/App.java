public class App {
    public static void main(String[] args) throws Exception {
        int tabla[][] = new int[3][6];
        tabla[0][1]=30;
        tabla[0][2]=-2;
        tabla[0][5]=5;
        
        System.out.println("Así queda la tabla: ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Fila "+(i+1)+": ");
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
