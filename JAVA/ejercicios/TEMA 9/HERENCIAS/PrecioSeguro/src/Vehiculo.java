public abstract class Vehiculo {
    protected double precioMercado;
    protected int año;
    private static int vehiculosTotales;

    Vehiculo(double precioMercado, int año){
        this.precioMercado=precioMercado;
        this.año=año;
        vehiculosTotales++;
    }

    public static int getVehiculosTotales(){
        return vehiculosTotales;
    }
}
