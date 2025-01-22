public class App {
    public static void main(String[] args) throws Exception {
        int numeros[] = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=aleatorio();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(ultimoDigito(numeros[i])+" ");
        }
    }

    public static int ultimoDigito(int numero){
        int digito=0;
        digito=numero%10;
        if (digito>0 && digito<=5) {
            digito=5;
            numero/=10;
            numero=numero*10+digito;
        }
        else{
            while (numero%5!=0) {
                numero++;
            }
        }
        return numero;
    }

    public static int aleatorio(){
        return ((int)(Math.random()*(500-0+1)-0));
    }
}
