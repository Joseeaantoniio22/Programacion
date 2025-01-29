public class Coche extends Vehiculo implements Asegurable {
    private int numPuertas=0;

    Coche(int numPuertas, int año, double precioMercado){
        super(precioMercado, año);
        this.numPuertas=numPuertas;
    }

    public void calcularSeguro(){
        if (numPuertas>3) {
            System.out.println("El precio del seguro ronda los "+((precioMercado*1.02)+((2025-año)*0.5)));
        }
        else{
            System.out.println("El precio del seguro ronda los "+((precioMercado*1.002)+((2025-año)*0.05)));
        }
    }

    public String mostrarDetalles(){
        return "El precio de mercado es de "+precioMercado+", es del año "+año+" y el numero de puertas es de "+numPuertas;
    }

    public int getPuertas(){
        return numPuertas;
    }

    public int getAño(){
        return año;
    }

    public double getPrecio(){
        return precioMercado;
    }
}
