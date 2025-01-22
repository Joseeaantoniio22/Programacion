public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime que cantidad de dinero quieres apostar: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        int dado1 = (int) (Math.random() * 6 - 1 + 1) + 1;
        int dado2 = (int) (Math.random() * 6 - 1 + 1) + 1;
        int dados = dado1 + dado2;
        int segundosDados = 0;
        switch (dados) {
            case 7, 11:
                cantidad *= 2;
                System.out.println("Has ganado: " + cantidad);
                break;
            case 2, 3, 12:
                System.out.println("Has perdido");

                break;
            default:
                while (segundosDados != dados && segundosDados != 7) {
                    segundosDados = (int) (Math.random() * 12 - 2 + 1) + 1;
                    if (segundosDados == dados) {
                        System.out.println("Has ganado: " + cantidad * 2);
                        System.out.println("La suma de los dados es de: " + dados);
                    } else if (segundosDados == 7) {
                        System.out.println("Has perdido.");
                        System.out.println("La suma de los dados es de: " + dados);
                    }
                }
                break;
        }
    }
}
