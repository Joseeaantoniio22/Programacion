public class App {
    public static void main(String[] args) throws Exception {
        //Le pedimos al usuario que ingrese cuantos km queremos pasar a millas
        System.out.print("Ingrese la cantidad de kilómetros: ");
        int km = Integer.parseInt(System.console().readLine());
        System.out.println("-------------------------------------------");
        System.out.printf("Cantidad de kilómetros: %1d km\n", km);
        //Le damos valor a millas para poder hacer el calculo necesario
        double cant_millas;
        cant_millas = 0.621371;
        //Hacemos la operacion del traspaso de km a milla
        double resul;
        resul = cant_millas * km;
        //Aqui Mostramos por pantalla la cantidad de millas que son los km que nos ha dado anteriormente
        System.out.printf("Equivalente en millas: \033[43m%2.5f mi\033[0m\n", resul);
        System.out.println("-------------------------------------------");
        //Aqui le decimos la conversion utilizada
        System.out.println("La conversión se realizó utilizando la fórmula:");
        System.out.println("\033[41m1km\033[0m = \033[42m0.621371 mi\033[0m");

        // Jose Antonio Fernandez Guerrero
    }
}
