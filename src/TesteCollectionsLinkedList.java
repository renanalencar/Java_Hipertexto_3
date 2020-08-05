import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */
public class TesteCollectionsLinkedList {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Java");
        lista.add("Collections");
        lista.add("Framework");

        Iterator iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}