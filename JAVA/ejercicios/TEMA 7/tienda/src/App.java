public class App {
    public static void main(String[] args) throws Exception {
        int valor =0;
        Articulo articulos[] = new Articulo[10];
        articulos[0] = new Articulo("dvd", 50, 2.19, 3.50);
        System.out.println("Bienvenido a mi tienda virtual");
        System.out.println("-------------------------------");
        System.out.println(" ");
        while (valor!=8) {
            System.out.println("Seleccione que desea realizar: ");
            System.out.println("1. Entrada de mercancía");
            System.out.println("2. Salida de mercancía");
            System.out.println("3. Subida de stock");
            System.out.println("4. Dar de baja en stock");
            System.out.println("5. Modificacion de mercancía");
            System.out.println("6. Listado de Almacén");
            System.out.println("7. Listado de stock");
            System.out.println("8. Salir");
            System.out.println(" ");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    Funciones.entradaProducto(articulos);
                    break;
                case 2:
                    Funciones.salidaProducto(articulos);
                    break;
                case 3:
    
                    break;
                case 4:
                    break;
                case 5:
                    Funciones.eliminarArticulo(articulos);
                    break;
                case 6:
                        Funciones.listadoAlmacen(articulos);
                    break;
                case 7:
    
                    break;
                case 8:
    
                    break;
                default:
                System.out.println("Seleccione una de las opciones indicadas (pulse enter para volver a intentarlo)");
                System.console().readLine();
                    break;
            }
    
        }
    }
}
