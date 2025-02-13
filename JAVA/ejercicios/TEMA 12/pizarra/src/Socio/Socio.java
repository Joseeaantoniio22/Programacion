package Socio;
public class Socio{
    private int edad;
    private int id;
    private String nombre;
    private String localidad;
    private int estatura;
    
    public Socio(Socio miSocio) {
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.estatura = estatura;
    }

    public Socio(int edad, int id, String nombre, String localidad, int estatura) {
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Socio [edad=" + edad + ", id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + ", estatura="
                + estatura + "]";
    }

    

}