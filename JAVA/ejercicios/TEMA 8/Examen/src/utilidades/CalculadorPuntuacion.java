package utilidades;

public class CalculadorPuntuacion {
    public static double calcularPuntuacion(double carta, double dados) {
        double bono = 0;
        double penalizacion = 0;
        if (carta % 2 == 0) {
            bono = (carta * 0.1);
            carta += bono;
            return dados + carta;
        }
        penalizacion = carta * 0.05;
        carta -= penalizacion;
        return dados + carta;
    }
}
/*
 * @Author Jose Antonio Fernandez Guerrero
 * En esta funcion lo que he realizado es calcular la puntuacion dependiendo si
 * la carta es par o impar,
 * a ello le añado sus respectivas penalizaciones y bonos.
 */