public class Main {
    public static void main(String[] args) {
        int valor;
        GestorPersonas miGestorPersonas = new GestorPersonas();
        do {
            System.out.println("Dime que opcion quieres realizar");
            System.out.println("1. Añadir persona");
            System.out.println("2. Borrar persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Listar personas por color de pelo");
            System.out.println("5. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    System.out.println("Digame su nombre");
                    String nombre = System.console().readLine();
                    System.out.println("Dime la edad");
                    int edad = Integer.parseInt(System.console().readLine());
                    System.out.println("Dime el color de pelo que tiene");
                    String colorPelo = System.console().readLine();
                    Personas miPersonas = new Personas(nombre, edad);
                    miGestorPersonas.añadirPersona(colorPelo, miPersonas);
                    System.out.println(miPersonas);
                    break;
                case 2:
                    System.out.println("Digame su nombre");
                    nombre = System.console().readLine();
                    System.out.println("Dime la edad");
                    edad = Integer.parseInt(System.console().readLine());
                    System.out.println("Dime el color de pelo que tiene");
                    colorPelo = System.console().readLine();
                    miPersonas = new Personas(nombre, edad);
                    miGestorPersonas.borrarPersona(colorPelo, miPersonas);
                    break;
                case 3:
                    miGestorPersonas.listar();
                    break;
                case 4:
                    System.out.println("Dime el color de pelo de las personas que quieres listar");
                    colorPelo = System.console().readLine();
                    miGestorPersonas.listarColorPelo(colorPelo);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Escribe un valor válido");
                    break;
            }
        } while (valor != 5);
    }
}
