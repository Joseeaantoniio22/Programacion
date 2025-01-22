public class eje1 {
    public static void main(String[] args) throws Exception {
        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        //Aqui te pido el numero de años que quieres que calcule
        System.out.print("Ingrese el número de años: ");
        int años = Integer.parseInt(System.console().readLine());
        //AQUI LE DOY VALOR A TODAS LAS VARIABLES QUE UTILIZO PARA PODER CALCULAR LOS KM
        int año;
        año = 365;
        int dia;
        dia = 24;
        int hora;
        hora = 3600;
        //AQUI CALCULO LOS SEGUNDOS DE UN DIA
        long seg_dia;
        seg_dia = hora * dia;
        long seg_año;
        //AQUI CALCULO LOS SEGUNDOS DE UN AÑO
        seg_año = seg_dia * año;
        long km_seg;
        km_seg = 299792;
        //AQUI CALCULO LA VELOCIDAD SUPONIENDO QUE EN UN SEGUNDO HACE 299792
        long vel_kmseg;
        vel_kmseg = km_seg * seg_año;
        System.out.printf("La luz recorre aproximadamente %10d kilometros en %2d años", vel_kmseg, años);
    }
}
//JOSE ANTONIO FERNANDEZ GUERRERO