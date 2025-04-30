package metodos;
import implementaciones.HeapEstatico;
import interfaces.HeapTDA;

public class MetodosHeap {
    // Método auxiliar opcional: imprimir el heap
    public void imprimirHeap(HeapTDA heap, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(heap + " ");
        }
        System.out.println();
    }
}
