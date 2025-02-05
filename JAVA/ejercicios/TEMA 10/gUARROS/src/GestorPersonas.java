import java.util.ArrayList;
import java.util.HashMap;

public class GestorPersonas {
    private HashMap<String, ArrayList<Personas>> miHashMap = new HashMap<>();
    private ArrayList<Personas> mArrayList = new ArrayList<>();

    public void añadirPersona(String colorPelo, Personas persona){
        if (!miHashMap.containsKey(colorPelo)) {
            mArrayList.add(persona);
            miHashMap.put(colorPelo, mArrayList);
            System.out.println("Persona: su pelo es "+colorPelo+", "+persona);
        }
        else{
            mArrayList=miHashMap.get(colorPelo);
            boolean personaEncontrada = false;
            for (int i = 0; i < mArrayList.size() && !personaEncontrada; i++) {
                Personas personaLista = mArrayList.get(i);
                if (persona.toString().equals(personaLista.toString())) {
                    personaEncontrada= true;
                }
            }
            if (!personaEncontrada) {
                mArrayList.add(persona);
                System.out.println("Persona añadida: "+colorPelo+", "+persona);
            }
        }
    }

    public void borrarPersona(String colorPelo, Personas personas){
        if (!miHashMap.containsKey(colorPelo)) {
            System.out.println("Lo siento, esta condicion para borrar a esta persona no existe");
        }
        else{
            int i=0;
            boolean personaEncontrada=false;
            while (i<mArrayList.size() && !personaEncontrada ) {
                Personas personaLista = mArrayList.get(i);
                if (personaLista.toString().equals(personas.toString())) {
                    mArrayList.remove(i);
                    System.out.println("Persona eliminada correctamente");
                }
            }
        }
    }

    public void listarColorPelo(String colorPelo){
        if (miHashMap.containsKey(colorPelo)) {
            System.out.println("Personas "+colorPelo+": ");
            mArrayList = miHashMap.get(colorPelo);
            for (Personas personas : mArrayList) {
                System.out.println(personas);
            }
        }
        else{
            System.out.println("No hay personas con este color de pelo ");
        }
    }

    public void listar(){
        for (Personas personas : mArrayList) {
            System.out.println(personas);
        }
    }

}
