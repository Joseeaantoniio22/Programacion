package funcion;

public class Funcion {
    public static void rectangulo(){
        int h=0;
        int b=0;
        h=numeroAleatorio(100, 60);
        b=numeroAleatorio(200, 120);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int numeroAleatorio(int max, int min){
        return (int)(Math.random()*(max-min+1)+min);
        
    }
}
