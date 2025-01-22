public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            esCapicua(i);
        }
    }
    public static int vuelta(int numero){
        int digito=0;
        int numVolt=0;
        while (numero>0) {
            digito=numero%10;
            numero/=10;
            numVolt*=10;
            numVolt=digito+numVolt;
            
        }
        return numVolt;
    }
    public static int esCapicua(int numero){
        if (numero==vuelta(numero)) {
            System.out.println(numero);
        }
        return numero;
    }
}
