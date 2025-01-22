package utilidades;

public class GeneradorAleatorio {
    public static int generarCarta() {
        return (int) (Math.random() * (40 - 1 + 1) + 1);
    }

    public static int generarDados() {
        return (int) (Math.random() * (6 - 1 + 1) + 1);
    }
}
/*
 * @Author Jose Antonio Fernandez Guerrero
 * En esta funcion lo que he hecho ha sido invocar numeros aleatorios para
 * cartas y otro para dados
 */