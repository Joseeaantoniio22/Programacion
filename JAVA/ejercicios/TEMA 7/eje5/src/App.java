public class App {
    public static void main(String[] args) throws Exception {
        int numero [] = new int [5];
        int max=0;
        int min=1000000000;
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Dime un numero: ");
            numero[i] = Integer.parseInt(System.console().readLine());
            if (numero[i]>max) {
                max=numero[i];
            }
            if (numero[i]<min) {
                min=numero[i];
            }
        }
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == max) {
                System.out.println(max+" es el numero maximo");
            }
            else if (numero[i] == min) {
                System.out.println(min+" es el numero minimo");
            }
            else{
                System.out.println(numero[i]);
            }
        }
    }
}
