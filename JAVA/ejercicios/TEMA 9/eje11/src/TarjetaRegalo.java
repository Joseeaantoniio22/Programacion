public class TarjetaRegalo {
    double saldo = 0;
    int id = 0;
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        id = Generador();
    }

    public int getId() {
        return id;
    }
    public int Generador() {
        int numTarjeta = 0;
        int digito = 0;
        for (int i = 0; i < 5; i++) {
            numTarjeta *= 10;
            digito = (int) (Math.random() * (9 + 0 - 1) + 0);
            numTarjeta = digito + numTarjeta;
        }
        return numTarjeta;
    }

    public void  gasta(double cantidad){
        if (cantidad>saldo) {
            System.out.println("No puedes gastar más dinero que el que tienes en la tarjeta.");
        }
        else{
            saldo-=cantidad;
            System.out.println("Tarjeta nº " + id +"- Gasta " + saldo);
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public TarjetaRegalo fusionar(TarjetaRegalo nombre){
        TarjetaRegalo t3 = new TarjetaRegalo(saldo+nombre.getSaldo());
        nombre.setSaldo(0);
        setSaldo(0);
        return t3;
    }

    public void setSaldo(int saldo){
        this.saldo=saldo;
    }

    public String toString() {
        return "Tarjeta nº " + id + " - Saldo " + saldo;
    }
}
