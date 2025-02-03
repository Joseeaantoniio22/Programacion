import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("España", "Madrid");
        mapa.put("Argentina", "Panchilandia");
        mapa.put("Alemania", "Nazis");
        if (mapa.containsKey("Alemania")==true) {
            System.out.println("Esto existe");
        }
        else{
            System.out.println("No existe");
        }
        System.out.println(mapa.get("España"));
        System.out.println(mapa.entrySet());
    }
}
