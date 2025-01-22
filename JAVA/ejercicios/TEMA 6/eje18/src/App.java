public class App {
    public static void main(String[] args) throws Exception {
        int a=1;
        int b=6;
        int dormitorio1 =(int)(Math.random()*(b-a+1))+a;
        int dormitorio2 =(int)(Math.random()*(b-a+1))+a;
        int dormitorio3 =(int)(Math.random()*(b-a+1))+a;
        if (dormitorio1==dormitorio2) {
            do {
                dormitorio2=(int)(Math.random()*(b-a+1))+a;
            } while (dormitorio1==dormitorio2);
        }
        if (dormitorio2==dormitorio3) {
            do {
                dormitorio3=(int)(Math.random()*(b-a+1))+a;
            } while (dormitorio2==dormitorio3);
        }
        if (dormitorio3==dormitorio1) {
            do {
                dormitorio1=(int)(Math.random()*(b-a+1))+a;
            } while (dormitorio3==dormitorio1);
        }
        System.out.println(dormitorio1 +" "+ dormitorio2+" "+dormitorio3);
        if (dormitorio1==1 || dormitorio2==01 || dormitorio3==1 ) {
            System.out.println("Una de las habitaciones es rojo");
        }
        if (dormitorio1==2 || dormitorio2==2 || dormitorio3==2 ) {
            System.out.println("Una de tus habitaciones es azul");
        }
        if (dormitorio1==3 || dormitorio2==3 || dormitorio3==3 ) {
            System.out.println("Una de tus habitaciones es verde");
        }
        if (dormitorio1==4 || dormitorio2==4 || dormitorio3==4 ) {
            System.out.println("Una de tus habitaciones es amarillo");
        }
        if (dormitorio1==5 || dormitorio2==5 || dormitorio3==5 ) {
            System.out.println("Una de tus habitaciones es violeta");
        }
        if (dormitorio1==6 || dormitorio2==6 || dormitorio3==6 ) {
            System.out.println("Una de tus habitaciones es naranja");
        }
    }
}
