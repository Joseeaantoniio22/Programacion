public class App {
    public static void main(String[] args) throws Exception {
        Articulo articulos[] = new Articulo[100];
        System.out.println("Bienvenido a GESTISIMAL");
        System.out.println(" ");
        int valor = 0;
        articulos[0] = new Articulo("Grafica", 10, 220.38, 400);

        while (valor != 7) {
            System.out.println("Por favor seleccione lo que desea realizar: ");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    Funciones.listarProducto(articulos);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                Funciones.modificarObejto(articulos);
                    break;
                case 5:
                    Funciones.adquirirObjeto(articulos);
                    break;
                case 6:
                    Funciones.venderObjeto(articulos);
                    break;
                case 7:

                    break;
                default:
                    System.out.println("Introduce bien los datos, por favor (Pulse intro para intentarlo de nuevo)");
                    System.console().readLine();
                    break;
            }
        }
    }
}
