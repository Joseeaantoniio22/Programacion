package usuario;

import java.util.ArrayList;
import java.util.Scanner;

import pool.ConnectionPool;
import productos.Producto;
import productos.GestorInventario;

public interface Interactuador {    
    // Configuración de la conexión a la base de datos
    final String URL = "jdbc:mariadb://localhost:3306/gestisimal";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    GestorInventario miGestor = new GestorInventario(pool.getConnection());    
    Scanner sc = new Scanner(System.in);

    // Consulta ordenada de productos 
    public static void consultaOrdenada() {
        // TODO: Declaración e inicialización del ArrayList donde guardaremos el resultado de la consulta
        ArrayList<Producto> productos = new ArrayList<>();

        // TODO: Petición al usuario de los criterios de ordenación.
        System.out.println("Dime si lo quieres ordenar ascendente o descendente");
        String filtrado = System.console().readLine().toLowerCase();
    
        try{ 
            // TODO: Solicitud al gestor, comprobación del resultado y muestra de mensaje de error o listado de productos.  
            for (Producto producto : productos) {
                miGestor.requestAll(filtrado);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Consulta de datos por ID
    public static void consultaPorCódigo() {  
            System.out.println("Digame el codigo del producto para que lo pueda mostrar por pantalla");
            //long codigo = (Long) solicitarValorNumérico(Long.class);
            long codigo = sc.nextLong();
        try{  
            System.out.println(miGestor.requestById(codigo));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Alta de nuevo producto
    public static void altaProducto() {    
        System.out.println("Digame el código que le deseas añadir al producto");
        long codigo = (Long) solicitarValorNumérico(Long.class);
        //long codigo = sc.nextLong();
        System.out.println("Dime la descripcion que quieres que tenga el producto");
        String descripcion = sc.next();
        System.out.println("Dime el precio de compra que le quieres poner");
        //double precioCompra = (Double) solicitarValorNumérico(Double.class);
        double precioCompra = sc.nextDouble();
        System.out.println("Dime el precio de venta que quieres que tenga el producto");
        //double precioVenta = (Double) solicitarValorNumérico(Double.class);
        double precioVenta = sc.nextDouble();
        System.out.println("Dime la cantidad de stock que vas a disponer del producto");
        //int stock = (Integer)solicitarValorNumérico(Integer.class);
        int stock = sc.nextInt();
        try{  
            miGestor.create(new Producto(codigo, descripcion, precioCompra, precioVenta, stock));
            System.out.println("Producto creado correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualización de los datos de un producto
    public static void modificaciónProducto() {       
        System.out.println("Dígame el codigo del producto que deseas modificar");
        //long codigo = (Long) solicitarValorNumérico(Long.class);
        long codigo = sc.nextLong();
        System.out.println("Dime la descripción nueva del producto");
        String descripcion = sc.next();
        System.out.println("Dime el nuevo precio de compra del producto");
        //double precioCompra = (Double) solicitarValorNumérico(Double.class);
        double precioCompra = sc.nextDouble();
        System.out.println("Dime el nuevo precio de venta del producto");
        //double precioVenta = (Double) solicitarValorNumérico(Double.class);
        double precioVenta = sc.nextDouble();
        System.out.println("Dime el stock que va a tener el producto");
        //int stock = (Integer)solicitarValorNumérico(Integer.class);
        int stock = sc.nextInt();
        try{ 
            miGestor.update(new Producto(codigo, descripcion, precioCompra, precioVenta, stock));
            System.out.println("Cambios realizado correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Baja de un producto
    public static void bajaProducto() {     
        System.out.println("Dime el código del producto que deseas eliminar");
        //long codigo = (Long) solicitarValorNumérico(Long.class);
        long codigo = sc.nextLong();
        try{
            miGestor.delete(codigo);
            System.out.println("Producto eliminado correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Solicitar opción al usuario
    public static int solicitarElección(int OPCIÓN_MAX) {
        int elección = 0;
        try {
            elección = sc.nextInt();
        if (elección < 1 || elección > OPCIÓN_MAX) throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            sc.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }

     // Solicitar valor numérico al usuario     
     // Ejemplo de uso 1: int existencias = (Integer) solicitarValorNumérico(Integer.class);
     // Ejemplo de uso 2: long código = (Long) solicitarValorNumérico(Long.class);
     // Ejemplo de uso 3: double precioCompra = (Double) solicitarValorNumérico(Double.class);
    private static Object solicitarValorNumérico(Class<?> tipo) {
        Object resultado = null;
        while (resultado == null) {
            try { 
                if (tipo == Short.class) resultado = sc.nextShort();
                else if (tipo == Integer.class) resultado = sc.nextInt();
                else if (tipo == Long.class) resultado = sc.nextLong();
                else if (tipo == Float.class) resultado = sc.nextFloat();
                else if (tipo == Double.class) resultado = sc.nextDouble();
                else System.out.println("Tipo de dato no soportado.");
            } catch (Exception e) {
                System.out.print("Valor inválido.\nPruebe de nuevo: ");
            } finally {
                sc.nextLine(); // Limpiamos buffer de entrada
            }
        }        
        return resultado;
    }

    // Cerrar scanner
    public static void cerrarScanner() {
        sc.close();
    }

}
