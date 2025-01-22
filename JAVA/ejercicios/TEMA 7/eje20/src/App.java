public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime la cantidad total de nombres de reyes: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        System.out.println("Vaya introduciendo los nombres de los reyes y pulse INTRO: ");
        String reyes[] = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            reyes[i] = System.console().readLine();
        }
        System.out.println(" ");
        for (int i = 0; i < reyes.length; i++) {
            int orden = 1;
            /*
             * Este bucle lo que hace es comprobar todos los reyes que hay, si hay alguno,
             * suma la cantidad
             */
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    orden++;
                }
            }
            System.out.println(reyes[i] + " " + orden + "º");
        }
    }
}
