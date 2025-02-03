import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> misNumeros = new ArrayList<Integer>();
        System.out.println("Te voy a decir 10 numeros aleatorios y te los voy a ordenar");
        for (int i = 0; i < 10; i++) {
            misNumeros.add((int)(Math.random()*(10-1+1)+1));
        }
        System.out.println("Estos son los numero sin ordenar");
        System.out.println(misNumeros);
        Collections.sort(misNumeros);
        System.out.println("Numeros Ordenados");
            System.out.println(misNumeros);
    }
}
