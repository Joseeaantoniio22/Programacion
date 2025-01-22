public class JugadoresBaloncesto {
    int altura =0;
    int años=0;
    String nombre="";

    EquipoBaloncesto miEqupo ;

    JugadoresBaloncesto(String nombre, int altura, int años){
        this.nombre=nombre;
        this.altura=altura;
        this.años=años;
    }

    public void asignarEquipo(EquipoBaloncesto equipo){
        this.miEqupo=equipo;
    }

    public int getEdad(){
        return años;
    }

    public int getAltura(){
        return altura;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString() {
        return "El jugador se llama "+nombre+", mide "+altura+" cm y tiene "+años+" años. Y esta en el equipo "+ miEqupo.getEquipo()+"\n";
    }
}
