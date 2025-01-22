public class App {
    public static void main(String[] args) throws Exception {
        int i =0;
        System.out.print("Dime un numero y te digo su tabla de multiplicar hasta el 10: ");
        int num = Integer.parseInt(System.console().readLine());
        while (i <= 10) {
            System.out.println("" + num + "x" + i + "= " + (num * i));
            i++;
        }
    }
}
