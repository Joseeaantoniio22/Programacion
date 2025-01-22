public class App {
    public static final String RED = "\033[0;91m"; // RED
    public static final String GREEN = "\033[0;92m"; // GREEN
    public static final String YELLOW = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 5;
        int figura1 = (int) (Math.random() * (b - a + 1)) + a;
        int figura2 = (int) (Math.random() * (b - a + 1)) + a;
        int figura3 = (int) (Math.random() * (b - a + 1)) + a;
        prueba(figura1);
        prueba(figura2);
        prueba(figura3);
        System.out.println("");
        if (figura1==figura2 && figura2==figura3) {
            System.out.println("Enhorabuena, has ganado 10 coins");
        }
        else if (figura1==figura2 || figura2==figura3 || figura1==figura3) {
            System.out.println("Bien, has recuperado las coins");
        }
        else{
            System.out.println("Has palmado pasta como un campeon");
        }
    }

    public static void prueba(int figura) {
        switch (figura) {
            case 1:
                System.out.print(RED+"corazon "+RESET);
                break;
            case 2:
                System.out.print(GREEN+"diamante "+RESET);
                break;
            case 3:
            System.out.print(YELLOW+"herradura "+RESET);
                break;
            case 4:
            System.out.print(RED+"campana "+RESET);
                break;
            case 5:
            System.out.print(YELLOW+"limon "+RESET);
                break;
            default:
                break;
        }
    }
}
