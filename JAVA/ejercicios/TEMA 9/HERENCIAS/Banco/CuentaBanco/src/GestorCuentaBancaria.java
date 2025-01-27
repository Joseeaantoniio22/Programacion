public class GestorCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria misCuentas[] = new CuentaBancaria[3];
        misCuentas[0] = new CuentaAhorro(523.32, 0.6, "A001");
        misCuentas[1] = new CuentaCorriente(6516.31, 1.00, "CC001");
        misCuentas[2] = new CuentaCorriente(624.42, 0.2, "CC002");

        misCuentas[2].depositar(10.24);
        misCuentas[1].retirar(513.51);
        for (int i = 0; i < misCuentas.length; i++) {
            ((Operaciones)misCuentas[i]).mostrarResultados();
        }
    }
}
