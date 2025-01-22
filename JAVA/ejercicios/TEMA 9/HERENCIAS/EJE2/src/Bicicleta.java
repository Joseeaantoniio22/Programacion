public class Bicicleta {
    private int kmBicicleta;
    Bicicleta(){
        Vehiculo.setCantidadVehiculos();
    }

    public void kmBicicleta(){
        System.out.println("Dime cuantos kilómetros has hecho con la bicicleta");
        kmBicicleta = Integer.parseInt(System.console().readLine());
        Vehiculo.setKmTotales(kmBicicleta);
    }

    public String toString(){
        return "Has realizado en bicleta "+kmBicicleta;
    }
}