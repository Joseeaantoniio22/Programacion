public class Televisor extends Dispositivo implements Encendible {
    private int diagonal;
    private String tecnologia;
    private boolean encendido;
    private String canal;

    Televisor(String canal, String tecnologia, boolean encendido, int diagonal, String marca){
        super(marca);
        this.tecnologia=tecnologia;
        this.canal=canal;
        this.diagonal=diagonal;
        encendido=false;
    }

    public void encender(){
        encendido=true;
        canal= canal;
    }

    public void apagar(){
        encendido=false;
    }

    @Override
    public String toString(){
        if (encendido==true) {
            return "La tele esta encendida, está en el canal "+canal+", tu tele es de marca "+marca;
        }
        return "La tele está apagada y es de marca "+marca;
    }
}
