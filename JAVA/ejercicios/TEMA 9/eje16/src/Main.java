public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3.24, 5.10);
        Punto p2 = new Punto(2.34, 5.79);
        Linea l = new Linea(p1, p2);
        System.out.println(l);
        Punto p3 = new Punto(8.24, 5.10);
        Punto p4 = new Punto(5.34, 5.79);
        Linea l1 = new Linea(p3, p4);
        System.out.println(l1);
    }
}
