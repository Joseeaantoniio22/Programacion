public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero y te digo los 100 numeros siguientes");
        int num = Integer.parseInt(System.console().readLine());
        int i=0;
        while (i<=100) {
            System.out.println(num+i);
            i++;
        }
    }
}
