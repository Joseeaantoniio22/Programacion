import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();

    }
}
