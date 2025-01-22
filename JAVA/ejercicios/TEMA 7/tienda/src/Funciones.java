public class Funciones {
    public static int ultimoArticulo(Articulo articulos[]) {
        int i = 0;
        while (articulos[i] != null) {
            i++;
        }
        return i;
    }

    public static void posicionArticulo(Articulo articulos[], String nombre){
        int i=0;
        while (i<articulos.length && articulos[i]!=null) {
            if (nombre.equals(buscarArticulo(articulos, nombre).getNombre())) {
                System.out.println(i);
                articulos[i]=null;

            }
            i++;
        }
    }
    public static Articulo buscarArticulo(Articulo articulos[], String nombre) {
        String nombreMinuscula = minuscula(nombre);
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            if (nombreMinuscula.equals(articulos[i].getNombre())) {
                return articulos[i];
            }
        }
        return null;
    }

    public static String minuscula(String articulos) {
        return articulos.toLowerCase();
    }
    public static void eliminarArticulo(Articulo articulos[]){
        System.out.println("Dime el articulo que quieras borrar");
        String nombre = System.console().readLine();
        posicionArticulo(articulos, nombre);
    }

    public static void entradaProducto(Articulo articulos[]) {
        System.out.println("Dime el nombre del articulo que quieres añadir al almacen: ");
        String nombre = System.console().readLine();
        if (buscarArticulo(articulos, nombre) != null) {
            System.out.println("Este articulo ya está en nuestro almacén.");
            System.out.println("Pulse enter para salir al menú");
            System.console().readLine();
        } else {
            System.out.println("Dime la cantidad introducida en almacen: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Dime el coste total de los articulos:");
            double coste = Double.parseDouble(System.console().readLine());
            System.out.println("Dime el precio de salida que va a tener la unidad:");
            double precio = Double.parseDouble(System.console().readLine());
            articulos[ultimoArticulo(articulos)] = new Articulo(nombre, cantidad, coste, precio);
            System.out.println("Articulo creado con éxito, pulse enter para volver al menú");
            System.console().readLine();
        }
    }

    public static void salidaProducto(Articulo articulos[]) {
        String nombre;
        boolean continuar = false;
        do {
            System.out.println("Dime el nombre del producto que va a salir:");
            nombre = System.console().readLine();
            if (buscarArticulo(articulos, nombre) != null) {
                System.out.println("Dime la cantidad de este producto que va a salir");
                int cantidad = Integer.parseInt(System.console().readLine());
                cantidad *= -1;
                buscarArticulo(articulos, nombre).setCantidad(cantidad);
                System.out.println("Pulse enter para volver al menú");
                System.console().readLine();
                continuar = true;
            } else {
                System.out.println("Este producto no existe");
                System.out.println("Teclee 'si' para volver a intentarlo: ");
                String valor = System.console().readLine();
                if (valor.equals("si")) {
                    continuar = false;
                } else {
                    continuar = true;
                }
            }
        } while (continuar == false);
    }

    public static void listadoAlmacen(Articulo articulos[]) {
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            System.out.println((i + 1) + ". " + articulos[i].getNombre() + ", hay una cantidad total en almacén de: "
                    + articulos[i].getCantidad());
        }
        System.out.println("Pulse enter para salir");
        System.console().readLine();
    }
}
