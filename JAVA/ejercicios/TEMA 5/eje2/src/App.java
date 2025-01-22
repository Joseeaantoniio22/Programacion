public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int num;
        num = 0;
        while (num <= 100) {
            // System.out.println(num);
            // num+=5;
            // Otra manera de realizarlo
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
