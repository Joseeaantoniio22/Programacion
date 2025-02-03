import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> misCartas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            misCartas.add((int)(Math.random()*(40-1+1)+1));
        }
    }
}
