public class Personas {
    private String nombre;
    private int edad;
    
    Personas(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
    }

    public String toString(){
        return "Esta persona se llama "+nombre+" y tiene "+edad+" años";
    }
}
