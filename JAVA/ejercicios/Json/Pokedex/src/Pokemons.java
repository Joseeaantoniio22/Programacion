import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Pokemons {
    public static void main(String[] args) {
        Pokemons gestor = new Pokemons();
        int valor = 0;
        do {
            System.out.println("(1). Exportar pokemon");
            System.out.println(("(2). Importar pokemon"));
            System.out.println("(3). Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    gestor.exportar("./src/pokedex.json");
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    break;
            }
        } while (valor != 3);
    }

    @SuppressWarnings("unchecked")
    public void exportar(String nombreFichero) {
        JSONObject caracteristicas = new JSONObject();
        caracteristicas.put("Identificador", 151);
        caracteristicas.put("Nombre", "Jose antonio");
        caracteristicas.put("Numero", "151");

        JSONObject tipos = new JSONObject();
        tipos.put("Tipo1", "Roca");
        tipos.put("Tipo2", "Hierro");

        caracteristicas.put("Tipo", tipos);
        try {
            FileWriter file = new FileWriter(nombreFichero);
            file.write(caracteristicas.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(caracteristicas.toJSONString());
        System.out.println();

    }

    public void importar(String nombreFichero){
        try {
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader(nombreFichero);
            Object jsonObj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) jsonObj;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
