public class Camion extends Vehiculo {
    private int cargaMax;

    Camion(double precioMercado, int año, int cargaMax){
        super(precioMercado, año);
        this.cargaMax=cargaMax;
    }

    public void calcularSeguro(){
        if (cargaMax>2000) {
            System.out.println("El precio del seguro ronda los "+((precioMercado*1.02)+((2025-año)*0.05)));
        }
        else{
            System.out.println("El precio del seguro ronda los "+((precioMercado*1.005)+((2025-año)*0.05)));
        }
    }
}
