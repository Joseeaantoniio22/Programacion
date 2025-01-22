public class App {
    public static void main(String[] args) throws Exception {
        int resultado = (int) (Math.random() * 8) + 1;
        switch (resultado) {
            case 1:
                System.out.println("Ha salido el 1");
                break;
            case 2:
                System.out.println("Ha salido el 2");
                break;
            case 3:
                System.out.println("Ha salido el 3");
                break;
            case 4:
                System.out.println("Ha salido el 4");
                break;
            case 5:
                System.out.println("Ha salido el 5");
                break;
            case 6, 7, 8:
                System.out.println("Ha salido el 6");
                break;

            default:
                break;
        }
    }
}
