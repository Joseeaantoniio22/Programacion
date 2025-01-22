public class App {
    public static void main(String[] args) {
        Gato animales[] = new Gato[4];
        for (int i = 0; i < animales.length; i++) {
            System.out.println("Dime el nombre del gato: ");
            String nombre = System.console().readLine();
            System.out.println("Dime la edad del gato: ");
            int edad = Integer.parseInt(System.console().readLine());
            System.out.println("Dime la raza del gato: ");
            String raza = System.console().readLine();
            animales[i] = new Gato(nombre, edad, raza);
        }
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].toString());
        }
    }
}
