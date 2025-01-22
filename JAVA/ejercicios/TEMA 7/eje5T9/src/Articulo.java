public class Articulo {
    String nombre;
    int cantidad;
    double coste;
    double precio;

    Articulo(String nombre, int cantidad, double coste, double precio) {
        this.cantidad = cantidad;
        this.coste = coste;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int GetCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidadNueva) {
        cantidad=cantidadNueva;
    }

    public void setCantidadVendida(int cantidadVendida) {
        cantidad -= cantidadVendida;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
