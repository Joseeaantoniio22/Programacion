package videojuegos;

public class Videojuego {
    private int identificador;
    private String nombre;
    private String fecha;
    private float precio;
    private String descripción;
    private String imagen;
 
    public Videojuego() {
        this(0,"", "", 0, "", "");
    }

    public Videojuego(int identificador, String nombre, String fecha, float precio, String descripción, String imagen) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.descripción = descripción;
        this.imagen = imagen;
    }
    
    public Videojuego(Videojuego vj) {
        this.identificador = vj.identificador;
        this.nombre = vj.nombre;
        this.fecha = vj.fecha;
        this.precio = vj.precio;
        this.descripción = vj.descripción;
        this.imagen = vj.imagen;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return String.format("Identificador: %d, Nombre: %s, Fecha: %s, Precio: %.2f, Descripción: %s, Imagen: %s", 
        this.identificador, this.nombre, this.fecha, this.precio, this.descripción, this.imagen);
    }
}