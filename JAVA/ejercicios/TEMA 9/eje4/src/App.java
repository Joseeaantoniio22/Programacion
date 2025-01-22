public class App {
    public static void main(String[] args) {
        JugadoresBaloncesto Jose = new JugadoresBaloncesto("Jose", 190, 22);
        JugadoresBaloncesto Adrian = new JugadoresBaloncesto("Adrian", 200, 24);
        JugadoresBaloncesto Federico = new JugadoresBaloncesto("Federico", 150, 20);
        EquipoBaloncesto Malaga = new EquipoBaloncesto("Malaga", 3, 100000);
        Jose.asignarEquipo(Malaga);
        Adrian.asignarEquipo(Malaga);
        Federico.asignarEquipo(Malaga);
        Malaga.asignarJuagador(Jose, Adrian, Federico);
        System.out.println(Malaga);
    }
}
