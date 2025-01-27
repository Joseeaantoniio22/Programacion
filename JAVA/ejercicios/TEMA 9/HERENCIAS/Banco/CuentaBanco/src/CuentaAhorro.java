public class CuentaAhorro extends CuentaBancaria implements Operaciones{
    CuentaAhorro(double saldo, double tipoInteres, String numeroCuenta){
        super(tipoInteres, saldo, numeroCuenta);
    }

    public double calcularIntereses(){
        return saldo*(tipoInteres/100);
    }

    public void mostrarResultados(){
        System.out.println("Tu cuenta tiene unos interes de "+calcularIntereses()+", dispones de un saldo "+saldo);
    }
}
