import java.util.ArrayList;
import java.util.HashMap;;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<Integer>> lista = new HashMap<String, ArrayList<Integer>>();
        Funciones.iniciarBaseDatos(lista);
        int valor = 0;
        do {
            System.out.println("Digame que desea realizar");
            System.out.println("1. Añadir provincia");
            System.out.println("2. Añadir codigo Postal");
            System.out.println("3. Borrar Codigo Postal");
            System.out.println("4. Borrar provincia");
            System.out.println("5. Listar todas las provincias");
            System.out.println("6. Listar una provincia");
            System.out.println("7. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    Funciones.crearProvincia(lista);
                    break;
                case 2:
                    Funciones.crearCP(lista);
                    break;
                case 3:
                    Funciones.borrarCp(lista);
                    break;
                case 4:
                    Funciones.borrarProvincia(lista);
                    break;
                case 5:
                    Funciones.listarTodos(lista);
                    break;
                case 6:
                    Funciones.listarProvincia(lista);
                    break;
                case 7:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Ingrese un valor correcto ");
                    System.out.println("Pulse enter para volver al menu");
                    System.console().readLine();
                    break;
            }
        } while (valor != 7);
    }
}
