public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime un numero y te diré su secuencia de Fibonacci: ");
        int numero=Integer.parseInt(System.console().readLine());
        int a=0;
        int b=1;
        int c=0;
        for (int i = 0; i <= numero; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
}
