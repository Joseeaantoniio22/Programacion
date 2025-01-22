public class Caballo {
    String raza;
    double peso;
    double estatura;
    String nombre="";
    String color;
    Caballo (String nombre, String raza, String color){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }
    public  String toString() {
        return "Este caballo se llama: "+nombre+" es de raza "+raza+" y es de color "+color;
    }
}
