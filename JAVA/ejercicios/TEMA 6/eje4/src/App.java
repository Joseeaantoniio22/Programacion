public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            int a=0;
            int b=10;
            int num= (int)(Math.random()*(b-a+1))+a;
            System.out.print(num+" ");
        }
    }
}
