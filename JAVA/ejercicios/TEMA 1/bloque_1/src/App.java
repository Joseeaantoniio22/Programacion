import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print ("Hola, digame su nombre por favor: ");
        String nom = s.next();
        System.out.println("Digame el producto que desea");
        String pro = s.next();
        System.out.println("Digame la cantidad de productos que quieres");
        Double cant = s.nextDouble();
        System.out.println("Dime el precio unitario del prodcuto que deseas");
        Double prec = s.nextDouble();
        //El precio total de los productos
        double total;
        total= (cant * prec);
        //Total + IVA
        Double tiva;
        tiva = total + (total*0.21);
        Double iva;
        iva = total * 0.21;
        System.out.println("┌────────────────────┬────────────────────┐");
        System.out.printf("│%-20.16s│%20.16s│\n", "Nombre:", nom);
        System.out.printf("│%-20.16s│%20.16s│\n", "Producto:", pro);
        System.out.printf("│%-20.16s│%20.2f│\n", "Cantidad:", cant);
        System.out.printf("│%-20.16s│%19.2f$│\n", "Precio Unitario:", prec);
        System.out.printf("│%-20.16s│%20s│\n", "Precio Total", " ");
        System.out.printf("│\033[31m%-20.16s\033[39;49m│%19.2f$│\n", "Sin Impuestos:", total);
        System.out.println("├────────────────────┼────────────────────┤");
        System.out.printf("│%-20.16s│%19.2f$│\n", "IVA (21%)", iva);
        System.out.println("├────────────────────┼────────────────────┤");
        System.out.printf("│\033[31m%-20.16s\033[39;49m│%19.2f$│\n", "Total:", tiva);
        System.out.println("└────────────────────┴────────────────────┘");
        s.close();
    }
}
