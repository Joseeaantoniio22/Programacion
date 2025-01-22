public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime un numero y te daré los 5 siguientes y te diré di son primos o no: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        for (int i = 0; i <= 5; i++) {
            if (EsPrimo(numeroIntroducido+i)) {
                System.out.println(numeroIntroducido+i+" el numero es primo");
            }
            else{
                System.out.println(numeroIntroducido+i+" el numero No es primo");
            }
        }
    }
    public static boolean EsPrimo(int x){
        int i=2;
        while (i<x) {
            if (x%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}

