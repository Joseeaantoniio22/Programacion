public class Gato {
    private String nombre;
    private int edad;
    private String raza;

    Gato(String nombre, int edad, String raza){
        this.edad=edad;
        this.nombre=nombre;
        this.raza=raza;
    }

    public String toString(){
        return "El gato se llama "+nombre+", tiene "+edad+" y su raza es "+raza;
    }
} 
