package funcion;

public class Funcion {
    public static void piramide(int alt){
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j<alt ;  j++) {
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
