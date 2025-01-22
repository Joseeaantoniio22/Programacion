public class Incidencias {
    private int  puesto=0;
    private String problema="";
    private int codigo=0;
    private String solucion="";
    private String estado="";

    public Incidencias (int puesto, String problema){
        this.puesto=puesto;
        this.problema=problema;
    }

    public void generarCodigo(){
        codigo=(int)(Math.random()*(1000-1+1)+1);
    }
    public int getCodigo(){
        return codigo;
    }
    public String resuelto(){
        return "";
    }
    public String toString(){
        return "Puesto: "+puesto+" - "+problema+" - "+estado;
    }
}
