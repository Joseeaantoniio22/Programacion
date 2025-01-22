public class Coche extends Vehiculo {
    private int kmCoche=0;
    private int sumatorio=0;
    Coche(){
        Vehiculo.setCantidadVehiculos();
    }

    public void setKmCoche(){
        System.out.println("Dime los kilometros que posee el coche:");
        kmCoche = Integer.parseInt(System.console().readLine());
        sumatorio+=kmCoche;
        Vehiculo.setKmTotales(sumatorio);
    }

    public void quemaRueda(){
        System.out.println("¡Has quemado rueda! Ahora tienes menos neumáticos jajajaja.");
        System.console().readLine();
    }

    public String toString(){
        return "El coche tiene "+sumatorio;
    }
}
