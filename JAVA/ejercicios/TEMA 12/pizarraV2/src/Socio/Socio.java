package Socio;

public class Socio {
    private String nombre;
    private String localidad;
    private int edad;
    private int estatura;
    private int id;

    
    public Socio(Socio miSocio) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
    }

    public Socio(String nombre, String localidad, int edad, int estatura, int id) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
}
