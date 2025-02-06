import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorCoches implements CRUD<Coche> {
    private File file;
    private ArrayList<Coche> mArrayList = new ArrayList<>();
    GestorCoches(File file){
        this.file=file;
    }
    @Override
    public ArrayList<Coche> recuperarTodos() {
        try {
            BufferedWriter br = new BufferedWriter(new FileReader(file));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    @Override
    public Coche recuperarUno(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarUno'");
    }
    @Override
    public Coche añadir(Coche data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }
    @Override
    public Coche eliminar(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
    @Override
    public Coche modificar(Coche data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }


}
