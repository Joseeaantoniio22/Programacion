package utilidades;

public class ImpresoraResultados {
    public static double imprimirResultados(double mago1, double mago2) {
        if (mago1 == mago2) {
            System.out.println("EMPATE");
        } else if (mago1 > mago2) {
            System.out.println("Enhorabuena ha ganado el mago 1");
            return mago1;
        }
        System.out.println("Enhorabuena ha ganado el mago 2");
        return mago2;
    }
}
/*
 * @Author Jose Antonio Fernandez Guerrero
 * Aqui basicamente comparo la acumulatia de los dos magos para saber quien ha
 * ganado
 * o si ha quedado empate.
 */