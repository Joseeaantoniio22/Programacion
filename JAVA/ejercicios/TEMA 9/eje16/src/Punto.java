public class Punto {
    private double x=0;
    private double y=0;
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "("+x+", "+y+")";
    }
}
