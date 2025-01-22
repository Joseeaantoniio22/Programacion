public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime un numero y te dire la media: ");
        double num = Integer.parseInt(System.console().readLine());
        double i = 1;
        double media;
        double x = 1;
        while (x > 0) {
            System.out.print("Dime un numero y te dire la media: ");
            x = Integer.parseInt(System.console().readLine());
            if (x < 0) {
                break;
            }
            num += x;
            i++;
        }
        media = num / i;
        System.out.println("La media es de: "+media);
    }
}
