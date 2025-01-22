public class copia{
    public static void main(String[] args) throws Exception {
        System.out.print("Dime la cantidad de metros que tiene el camino: ");
        int metros = Integer.parseInt(System.console().readLine());
        int curvas = 0;
        int obstaculo = 0;
        int tipoObstaculo = 0;
        String caracterObstaculo = "";
        String espacios = " ";
        int posicion = 0;
        for (int i = 0; i < metros; i++) {
            curvas = numerosRandom(0, 2);
            switch (curvas) {
                case 0:

                    break;
                case 1:
                    System.out.print(espacios);
                    break;
                case 2:
                    System.out.print(espacios + " " + espacios);
                    break;

                default:
                    break;
            }

            obstaculo = numerosRandom(1, 2);
            if (obstaculo == 0) {
                System.out.println("|    |");
            } else {
                tipoObstaculo = numerosRandom(1, 2);
                switch (tipoObstaculo) {
                    case 1:
                        caracterObstaculo = "*";
                        break;
                    case 2:
                        caracterObstaculo = "O";
                        break;
                    default:
                        break;
                }
                posicion = numerosRandom(1, 4);
                System.out.print("|");
                for (int posicionInicial = 1; posicionInicial < posicion; posicionInicial++) {
                    System.out.print(" ");
                }
                System.out.print(caracterObstaculo);
                while (posicion + 1 <= 4) {
                    System.out.print(" ");
                    posicion++;
                }
                System.out.println("|");
            }
        }
    }
    public static int numerosRandom (int a, int b){
        return (int)(Math.random()*(b-a+1)+a);
    }
}

