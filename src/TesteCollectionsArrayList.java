import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */
public class TesteCollectionsArrayList {
    public static void main(String[] args) {
        // Criando ArrayList
        ArrayList<String> lista = new ArrayList<>();
        // Adicionando objeto no ArrayList
        lista.add("Java");
        lista.add("Collections");
        lista.add("Framework");
        // Percorrendo a lista através do Iterator
        Iterator iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}