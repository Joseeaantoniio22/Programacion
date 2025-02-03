import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> misNumeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            misNumeros.add((int)(Math.random()*(100-1+1)+1));
        }

        for (int i = 0; i < misNumeros.size(); i++) {
            System.out.println(misNumeros.get(i));
        }
    }
}
