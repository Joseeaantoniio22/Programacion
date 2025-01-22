package funcion;

public class Funcion {
    public static void piramide(int alt){
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < alt-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
