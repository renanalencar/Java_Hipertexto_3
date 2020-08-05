import java.util.Iterator;
import java.util.Stack;

public class TesteCollectionsStack {
    
    public static void main(String[] args) {
        
        Stack<String> pilha = new Stack<>();

        pilha.push("Java");
        pilha.push("Collections");
        pilha.push("Framework");

        pilha.pop();

        pilha.peek();

        Iterator iterador = pilha.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}