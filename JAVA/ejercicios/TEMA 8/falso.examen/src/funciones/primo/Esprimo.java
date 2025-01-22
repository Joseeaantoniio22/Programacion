package funciones.primo;

public class Esprimo {
    public static boolean esprimo(int numero){
        for (int i = 2; i < numero; i++) {
            if (numero%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void comprimo(int min, int max){
        while (min<max) {
            if (esprimo(min)==true) {
                System.out.println(min+" este numero es primo");
            }
            min++;
        }
    }
}
