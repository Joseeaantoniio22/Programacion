import java.util.Scanner;
    public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        //DATOS DEL CLIENTE

        System.out.print("Ingrese el nombre del cliente: ");
        String nom = entrada.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String dir = entrada.nextLine();
        System.out.print("Ingrese el numero de telefono del cliente: ");
        Long tele = entrada.nextLong();
        entrada.nextLine();
        
        //PRODUCTOS

        System.out.print("Dime el nombre del primer producto: ");
        String pro1 = entrada.nextLine();
        System.out.print("Digame el precio unitario de este producto: ");
        float pre1 = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de productos que desea: ");
        int cant1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dime el nombre del segundo producto: ");
        String pro2 = entrada.nextLine();
        System.out.print("Digame el precio unitario de este producto: ");
        float pre2 = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de productos que desea: ");
        int cant2 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dime el nombre del tercer producto: ");
        String pro3 = entrada.nextLine();
        System.out.print("Digame el precio unitario de este producto: ");
        float pre3 = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de productos que desea: ");
        int cant3 = entrada.nextInt();

        // Formulas

        float tot1;
        tot1 = pre1*cant1;
        float tot2;
        tot2 = pre2*cant2;
        float tot3;
        tot3 = pre3*cant3;
        float total;
        total= tot1+tot2+tot3;
        double imp;
        imp = total*0.18 ;
        double desc;
        desc = total *0.05;
        double totalt;
        totalt= total-desc+imp ;
        entrada.close();

        //Dibujo de factura
        System.out.println("------------------------------");
        System.out.println("            FACTURA           ");
        System.out.println("------------------------------");
        System.out.println("Cliente: " +nom);
        System.out.println("Dirección: " +dir);
        System.out.println("Teléfono: " +tele);
        System.out.println(" ");
        System.out.printf("%-19s %-19s %-19s %-19s\n", "Producto", "Precio Unitario", "Cantidad", "Total Parcial");
        System.out.println(
            "----------------------------------------------------------------------------------");
        System.out.printf("%-19s %-19.2f %-18d $%-19.2f\n", pro1, pre1, cant1, tot1);
        System.out.printf("%-19s %-19.2f %-18d $%-19.2f\n", pro2, pre2, cant2, tot2);
        System.out.printf("%-19s %-19.2f %-18d $%-19.2f\n", pro3, pre3, cant3, tot3);
        System.out.println(
            "----------------------------------------------------------------------------------");
        System.out.printf("%-19s %-19.2s %-18s \033[33m$%-19.2f\033[39;49m\n", "Subtotal:", " ", " ", total);
        System.out.printf("%-19s %-19.2s %-18s $%-19.2f\n", "Impuesto (18%):", " ", " ", imp );
        System.out.printf("%-19s %-19.2s %-18s $%-19.2f\n", "Descuento (5%):", " ", " ", desc );        
        System.out.println(
            "----------------------------------------------------------------------------------");
        System.out.printf("%-19s %-19.2s %-18s $%-18.2f\n", "Total a Pagar:", " ", " ", totalt ); 
    }

}
