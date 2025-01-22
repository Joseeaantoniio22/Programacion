public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        long cod;
        cod=0;
        //int i;
        //i=0;
        /*while (i<4) {
            System.out.println("Dime la clave de la caja");
            cod=Integer.parseInt(System.console().readLine());
            if (cod==4444) {
                System.out.println("La clave es correcta.");
                break;
            }
            else{
                System.out.println("La clave es incorrecta.");
            }
            i++;
            System.out.println("Intentalo de nuevo");
            
        }
        */
        /*while (cod!=4444) {
            if (i==4) {
                System.out.println("Has terminado los intentos posibles");
                break;
            }
            System.out.println("Digame la clave de la caja fuerte.");
            cod=Integer.parseInt(System.console().readLine());
            if (cod==4444) {
                System.out.println("Clave correcta.");
            }
            i++;
        }
        */
        for (int i = 1; i <= 4; i++) {
            System.out.println("Dime la clave de la caja");
            cod=Integer.parseInt(System.console().readLine());
            if (cod==4444) {
                System.out.println("Clave correcta");
                break;
            }
            else{
                System.out.println("Clave incorrecta.");
            }
        }
    }
}
