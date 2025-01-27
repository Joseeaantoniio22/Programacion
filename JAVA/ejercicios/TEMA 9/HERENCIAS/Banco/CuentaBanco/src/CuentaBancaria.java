public abstract class CuentaBancaria {
    protected double tipoInteres;
    protected double saldo;
    protected String numeroCuenta;

    CuentaBancaria(double tipoInteres, double saldo, String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo=saldo;
        this.tipoInteres=tipoInteres;
    }

    public void depositar(double cantidad){
        saldo+=cantidad;
    }

    public void retirar(double retirar){
        saldo-=retirar;
    }

    public double obtenerSaldo(){
        return saldo;
    }
}
