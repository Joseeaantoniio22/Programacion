public class EquipoBaloncesto {
    String nombre = "";
    int numjugadores = 0;
    int presupuesto = 0;
    JugadoresBaloncesto Jugador1;
    JugadoresBaloncesto Jugador2;
    JugadoresBaloncesto Jugador3;

    EquipoBaloncesto(String nombre, int numjugadores, int presupuesto) {
        this.nombre = nombre;
        this.numjugadores = numjugadores;
        this.presupuesto = presupuesto;
    }

    public void asignarJuagador(JugadoresBaloncesto Jugador1, JugadoresBaloncesto Jugador2,
            JugadoresBaloncesto Jugador3) {
        this.Jugador1 = Jugador1;
        this.Jugador2 = Jugador2;
        this.Jugador3 = Jugador3;
    }

    public String getEquipo() {
        return (nombre);
    }

    public String toString() {
        return "Este equipo esta compuesto por los siguientes jugadores: \n" + Jugador1 + Jugador2 + Jugador3;
    }

}
