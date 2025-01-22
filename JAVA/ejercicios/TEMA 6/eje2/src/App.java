public class App {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 4;
        int palos = (int) (Math.random() * (b - a + 1)) + a;
        int c = 1;
        int d = 13;
        int cartas = (int) (Math.random() * (d - c + 1)) + c;
        switch (palos) {
            case 1:
                System.out.println("Tu palo es de picas");
                break;
            case 2:
                System.out.println("Tu palo es de corazones");
                break;
            case 3:
                System.out.println("Tu palo es de diamantes");
                break;
            case 4:
                System.out.println("Tu palo es de trebol");
                break;
            default:
                break;
        }
        switch (cartas) {
            case 1:
                System.out.println("Su carta es AS");
                break;
            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Su carta es el " + cartas);
                break;
            case 11:
                System.out.println("Su carta es J");
                break;
            case 12:
                System.out.println("Su carta es Q");
                break;
            case 13:
                System.out.println("Su carta es K");
                break;
            default:
                break;
        }
    }
}
