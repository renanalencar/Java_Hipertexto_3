import java.util.Iterator;
import java.util.PriorityQueue;

public class TestePriorityQueue {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.add("Java");
        filaPrioridade.add("Collections");
        filaPrioridade.add("Framework");

        System.out.println("Cabeça: " + filaPrioridade.element());
        System.out.println("Cabeça: " + filaPrioridade.peek());

        System.out.println("Iterando os elementos da fila: ");
        Iterator iterador = filaPrioridade.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}