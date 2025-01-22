public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, te voy a mostrar tu factura");
        System.out.println("  Articulo      Precio/Saco     NºSacos  ");
        System.out.println("-----------------------------------------");
        System.out.printf("%-9s     %12.2f      %8d\n", "Cemento", 3.75, 10);
        System.out.printf("%-9s     %10.2f      %8d\n", "Arena", 5.25, 20);
        System.out.printf("%-9s     %10.2f      %8d\n", "Grava", 8.99, 5);
    }
}
