import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Funciones {
    public static void iniciarBaseDatos(HashMap<String, ArrayList<Integer>> lista) {
        lista.put("Malaga", new ArrayList<Integer>());
        lista.get("Malaga").add(29007);
        lista.get("Malaga").add(29129);
        lista.get("Malaga").add(29038);

        lista.put("Sevilla", new ArrayList<Integer>());
        lista.get("Sevilla").add(41007);
        lista.get("Sevilla").add(41015);
        lista.get("Sevilla").add(41105);

        lista.put("Almeria", new ArrayList<Integer>());
        lista.get("Almeria").add(04500);
        lista.get("Almeria").add(04070);
        lista.get("Almeria").add(04501);

    }

    public static void crearProvincia(HashMap <String, ArrayList<Integer>> lista){
        System.out.println("Dime el nombre de la provincia que quieras añadir");
        String provincia = System.console().readLine();
        lista.put(provincia, new ArrayList<Integer>());
        System.out.println("Provincia agregada correctamete");
        System.out.println("Pulse enter para volver al menu");
        System.console().readLine();
    }

    public static void crearCP(HashMap <String, ArrayList<Integer>> lista){
        System.out.println("Dime la provincia que le deseas añadir el codigo postal");
        String provincia = System.console().readLine();
        if (!lista.containsKey(provincia)) {
            System.out.println("Lo siento, la provincia que has indicado no existe");
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        } else {
            System.out.println("Digame el codigo postal de esa provincia");
            int cp = Integer.parseInt(System.console().readLine());
            if (lista.get(provincia).contains(cp)) {
                System.out.println("Ya tenemos este codigo postal");
                System.out.println("Pulse enter para volver al menu");
                System.console().readLine();
            }
            else{
                lista.get(provincia).add(cp);
                System.out.println("Codigo postal agregado correctamente");
                System.out.println("Pulse enter para volver al menu");
                System.console().readLine();
            }
        }
    }

    public static void listarProvincia(HashMap<String, ArrayList<Integer>> lista) {
        /*System.out.println("Dime el nombre de la provincia que deseas listar");
        String provincia = System.console().readLine();

        if (!lista.containsKey(provincia)) {
            System.out.println("Lo siento, la provincia que has indicado no existe");
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        } else {
            System.out.println("Estos son los códigos postales de " + provincia);
            System.out.println(lista.get(provincia));
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        }*/

        System.out.println("Dime el nombre de la pronvicia que quieras listar");
        String provincia = System.console().readLine();

        if (lista.containsKey(provincia)) {
            System.out.println("Los codigos postales de "+provincia+" son los siguientes: ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(provincia).get(i));
                if (i < lista.size()-1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Pulse enter para volver al menu");
        System.console().readLine();
    }

    public static void listarTodos(HashMap<String, ArrayList<Integer>> lista) {
        /*System.out.println(lista);
        System.out.println("Pulse enter para volver al menu");
        System.console().readLine();*/
        for (Map.Entry <String, ArrayList<Integer>> valores : lista.entrySet()) {
            System.out.println("La provincia "+valores.getKey()+", tiene los siguientes codigos postales: ");

            for (int i = 0; i < valores.getValue().size(); i++) {
                System.out.print(valores.getValue().get(i));
                if (i < valores.getValue().size()-1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Pulse enter para volver al menu");
        System.console().readLine();
    }

    public static void borrarProvincia(HashMap<String, ArrayList<Integer>> lista) {
        System.out.println("Dime el nombre de la provincia que quieras borrar");
        String provincia = System.console().readLine();

        if (lista.containsKey(provincia)) {
            lista.remove(provincia);
            System.out.println("Provincia borrada con éxito");
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        } else {
            System.out.println("La provincia que quieres borrar no existe o está mal escrito");
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        }
    }

    public static void borrarCp(HashMap <String, ArrayList<Integer>> lista){
        System.out.println("Dime el nombre de la provincia del codigo postal que quieras borrar");
        String provincia = System.console().readLine();
        if (lista.containsKey(provincia)) {
            System.out.println("Digame el codigo postal que quieras borrar");
            Integer cp = Integer.parseInt(System.console().readLine());
            if (lista.get(provincia).contains(cp)) {
                lista.get(provincia).remove(cp);
                System.out.println("Codigo postal borrado correctamente");
                System.out.println("Pulse enter para volver al menu");
                System.console().readLine();
            }
            else{
                System.out.println("El codigo postal escrito no existe o esta mal escrito");
                System.out.println("Pulse enter para volver al menu");
                System.console().readLine();
            }
        }
        else{
            System.out.println("La provincia que quieres borrar no existe o está mal escrito");
            System.out.println("Pulse enter para volver al menu");
            System.console().readLine();
        }
    }
}
