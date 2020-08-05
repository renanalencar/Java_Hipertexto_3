import java.util.Iterator;
import java.util.Vector;

/**
 * TesteCollectionsVector
 */
public class TesteCollectionsVector {

    public static void main(String[] args) {
        
        Vector<String> vector = new Vector();

        vector.add("Java");
        vector.add("Collections");
        vector.add("Framework");

        Iterator iterador = vector.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}