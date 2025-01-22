public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime un numeto y te digo cuantas cifras tiene: ");
        int num = Integer.parseInt(System.console().readLine());
        long i = 1;
        if (num == 0) {
            System.out.println("El numero tiene " + i + " dígitos.");
        }
        while (num != 0) {
            System.out.println("El numero tiene " + i + " dígitos.");
            num = num / 10;
            i++;
        }
    }
}
