public class App {
    public static void main(String[] args) throws Exception {
        /* System.out.println("Dime tu edad sexual");
        boolean edad=false;
        do {
            try {
                Integer.parseInt(System.console().readLine());
                edad = true;
            } catch (Exception e) {
                System.out.println("Dime tu edad hijo de puta");
            }
        } while (edad==false);*/
        TarjetaRegalo t1 = new TarjetaRegalo(500);
        TarjetaRegalo t2 = new TarjetaRegalo(100);  
        System.out.println(t1);
        System.out.println(t2);
        t2.gasta(88);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionar(t2);
        System.out.println(t3);
        System.out.println(t2);
    }
}
