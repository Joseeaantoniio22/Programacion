public class Articulo {
    private String nombre;
    private int cantidad;
    private double coste;
    private double precio;

    Articulo(String nombre, int cantidad, double coste, double precio){
        this.cantidad=cantidad;
        this.coste=coste;
        this.nombre=nombre;
        this.precio=precio;
    }

    public  String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int nuevaCantidad){
        cantidad+=nuevaCantidad;
    }
    
    public double getCoste(){
        return coste;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(Double precioNuevo){
        precio=precioNuevo;
    }
}
