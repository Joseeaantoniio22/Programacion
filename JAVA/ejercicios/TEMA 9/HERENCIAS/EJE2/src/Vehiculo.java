public abstract class Vehiculo {
    private static int kmTotales;
    private static int cantidadVehiculos=0;

    public static int getKmTotales(){
        return kmTotales;
    }

    public static void setKmTotales(int kmRecorridos){
        kmTotales+=kmRecorridos;
    }

    public int getCantidadVehiculos(){
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(){
        cantidadVehiculos++;
    }
    
}
