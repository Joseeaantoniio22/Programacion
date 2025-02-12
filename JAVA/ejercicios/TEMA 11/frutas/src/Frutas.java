0
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Frutas {
    private int id;
    private String fruta;
    private String nomFichero;
    
    Frutas(int id, String fruta, String nomFichero){
        this.id=id;
        this.fruta=fruta;
        this.nomFichero=nomFichero;
    }

    public int getId() {
        return id;
    }

    public String getFruta() {
        return fruta;
    }
    
    public String crearFruta(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichero));
            String misFrutas = 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public String serializar(Object object){
        return id+";"+fruta;
    }
    public Object deserializar(String contenido){
        String datos[] = contenido.split(";");
        return new 
    }
}
