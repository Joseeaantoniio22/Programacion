public class SistemaGestorEstudiantes {
    public static void main(String[] args) throws Exception {
        /**
         * @Author Jose Antonio Fernández Guerrero
         *         En esta clase creamos el menú para que el usuario pueda interactuar,
         *         con dichas opciones en el menú, llamando a funciones de las otras
         *         clases
         */
        int valor;
        String nombre;
        double nota;
        GestorEstudiante sistemas = new GestorEstudiante();
        /**
         * Creamos este bucle para que el usuario este todo el rato dentro del programa
         * hasta que se quiera salir
         */
        do {
            System.out.println("Seleccione que opción desea realizar");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar notas de un estudiante");
            System.out.println("3. Mostrar información de los estudiantes");
            System.out.println("4. Mostrar estudiantes con mayor promedio");
            System.out.println("5. Buscar estudiantes por su nombre");
            System.out.println("6. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    System.out.println("Dígame el nombre del estudiante: ");
                    nombre = System.console().readLine();
                    sistemas.agregarEstudiante(nombre);
                    break;
                case 2:
                    System.out.println("Digame el nombre del estudiante que le quieras agregar la nota: ");
                    nombre = System.console().readLine();
                    System.out.println("Dígame la nota que le quieras introducir: ");
                    nota = Double.parseDouble(System.console().readLine());
                    sistemas.agregarNotaEstudiante(nombre, nota);
                    break;
                case 3:
                    System.out.println("Estos son los estudiantes: ");
                    sistemas.mostrarEstudiantes();
                    ;
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Dígame el nombre del estudiante que quieres buscar: ");
                    nombre = System.console().readLine();
                    sistemas.buscarEstudiante(nombre);
                    break;
                case 6:

                    break;

                default:
                    System.out.println("Seleccione una opción correcta (Pulse enter para volver a intentarlo)");
                    System.console().readLine();
                    break;
            }
        } while (valor != 6);

    }
}
