public class App {
    public static void main(String[] args) throws Exception {
        int total=0;
        int tirada=0;
        for (int i = 1; i <= 3; i++) {
            tirada = (int)(Math.random()*6)+1;
            total=tirada+total;
            System.out.print(tirada+" ");
        }
        System.out.println("");
        System.out.println("La suma de todas las tiradas es de: "+total);
    }
}
