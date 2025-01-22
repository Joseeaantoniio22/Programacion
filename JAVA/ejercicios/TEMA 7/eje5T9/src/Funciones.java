public class Funciones {
    public static Articulo buscarProducto(String producto, Articulo articulos[]) {
        String nombreProducto = minuscula(producto);
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            if (nombreProducto.equals(articulos[i].getNombre())) {
                return (articulos[i]);
            }
        }
        return null;
    }

    public static void listarProducto(Articulo articulos[]) {
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            System.out.println(
                    (i + 1) + ". " + articulos[i].getNombre() + ": " + articulos[i].GetCantidad() + " en almacén.");
        }
        System.out.println("Pulse enter para volver al menu");
        System.console().readLine();
    }

    public static int ultimoProducto(Articulo articulos[]) {
        int i = 0;
        while (i < articulos.length && articulos[i] != null) {
            i++;
        }
        return i;
    }

    public static void modificarObejto(Articulo articulos[]) {
        System.out.print("Dime el nombre del articulo que quieras modificar: ");
        String nombre = System.console().readLine();
        boolean exit = false;
        if (buscarProducto(nombre, articulos) == null) {
            while (buscarProducto(nombre, articulos) == null && exit == false) {
                System.out.println("El articulo no existe o has escrito mal el nombre");
                System.out.println("Escriba 'si' si quieres volver a buscar, sino pulse enter: ");
                String continuar = System.console().readLine();
                if (continuar.toLowerCase().equals("si")) {
                    exit = false;
                    System.out.print("Dime el nombre del articulo que quieras modificar: ");
                    nombre = System.console().readLine();
                    if (buscarProducto(nombre, articulos) != null) {
                        System.out.println("Pulse el numero que quieras realizar");
                        System.out.println(" ");
                        System.out.println("1. Cambiar nombre");
                        System.out.println("2. Cambiar cantidad");
                        int opcion = Integer.parseInt(System.console().readLine());
                        switch (opcion) {
                            case 1:
                                System.out.print("Dime el nuevo nombre que quieres poner al objeto: ");
                                String nuevoNombre = System.console().readLine();
                                buscarProducto(nombre, articulos).setNombre(nuevoNombre);
                                System.out.println("Pulse enter para salir");
                                System.console().readLine();
                                break;
                            case 2:
                                System.out.print("Dime la cantidad que quieras poner: ");
                                int nuevaCantidad = Integer.parseInt(System.console().readLine());
                                buscarProducto(nombre, articulos).setCantidad(nuevaCantidad);
                                break;

                            default:
                                System.out.println("Introduce la opción correcta.");
                                break;
                        }
                        exit = true;
                    }
                } else {
                    exit = true;
                }
            }
        } else {
            System.out.println("Pulse el numero que quieras realizar");
            System.out.println(" ");
            System.out.println("1. Cambiar nombre");
            System.out.println("2. Cambiar cantidad");
            int opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.print("Dime el nuevo nombre que quieres poner al objeto: ");
                    String nuevoNombre = System.console().readLine();
                    buscarProducto(nombre, articulos).setNombre(nuevoNombre);
                    System.out.println("Pulse enter para salir");
                    System.console().readLine();
                    break;
                case 2:
                    System.out.print("Dime la cantidad que quieras poner: ");
                    int nuevaCantidad = Integer.parseInt(System.console().readLine());
                    buscarProducto(nombre, articulos).setCantidad(nuevaCantidad);
                    break;

                default:
                    System.out.println("Introduce la opción correcta.");
                    break;
            }
        }

    }

    public static void adquirirObjeto(Articulo articulos[]) {
        System.out.print("Dime el nombre del articulo: ");
        String nombre = System.console().readLine();
        if (buscarProducto(nombre, articulos) == null) {
            System.out.print("Dime la cantidad adquirida: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            System.out.print("Dime el coste del producto: ");
            double coste = Double.parseDouble(System.console().readLine());
            System.out.print("Dime el precio al que quieres venderlo: ");
            double venta = Double.parseDouble(System.console().readLine());
            articulos[ultimoProducto(articulos)] = new Articulo(nombre, cantidad, coste, venta);
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        } else {
            System.out.println("Este producto ya existe, pulse intro para salir");
            System.console().readLine();
        }
    }

    public static void venderObjeto(Articulo articulos[]) {
        System.out.print("Dime el nombre del articulo que se ha vendido: ");
        String nombre = System.console().readLine();
        if (buscarProducto(nombre, articulos) != null) {
            System.out.print("Dime la cantidad vendida: ");
            int cantidadVendida = Integer.parseInt(System.console().readLine());
            buscarProducto(nombre, articulos).GetCantidad();
            buscarProducto(nombre, articulos).setCantidadVendida(cantidadVendida);
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        } else {
            System.out.println("Este producto no existe, pulse intro para salir");
            System.console().readLine();
        }
    }

    public static String minuscula(String producto) {
        return producto.toLowerCase();
    }
}
