public class FichaDomino {
    int num1=0;
    int num2=0;
    
    public FichaDomino(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public String Espacio(int num){
        if (num==0) {
            return " ";
        }
        return ""+num;
    }
    public int getDelante(){
        return num1;
    }
    public int getDetras(){
        return num2;
    }
    public boolean Encaja(FichaDomino f){
        if (num1==f.getDelante() || num1==f.getDetras()) {
            return true;
        }
        else if (num2==f.getDelante() || num2==f.getDetras()) {
            return true;
        }
        return false;
    }
    public String Voltea(){
        return "["+Espacio(num2)+"|"+Espacio(num1)+"]";
    }
    public String toString(){
        return "["+Espacio(num1)+"|"+Espacio(num2)+"]";
    }
}
