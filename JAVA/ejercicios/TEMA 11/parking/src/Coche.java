public class Coche implements Serializable {
    private String matricula;
    private String marca;
    private int año;

    Coche(String matricula, String marca, int año){
        this.año=año;
        this.marca=marca;
        this.matricula=matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public int getAño(){
        return año;
    }

    public String serializar(){
        return String.format("%s,%s,%d", this.matricula, this.marca, this.año);
    }

    public void deserializar(String linea){
        String[] datos = linea.split(";");
        this.matricula=datos[0];
        this.marca=datos[1];
        this.año=Integer.parseInt(datos[2]);
    }
}
