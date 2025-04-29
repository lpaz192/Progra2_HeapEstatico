package metodos;
public class MetodosHeap {
    // Reordena el heap hacia arriba (heapify-up)
    public static void subir(int[] heap, int i) {
        while (i > 0 && heap[i] > heap[(i - 1) / 2]) {
            int padre = (i - 1) / 2;
            intercambiar(heap, i, padre);
            i = padre;
        }
    }

    // Reordena el heap hacia abajo (heapify-down)
    public static void bajar(int[] heap, int tamaño, int i) {
        int hijoIzq = 2 * i + 1;

        while (hijoIzq < tamaño) {
            int hijoMayor = hijoIzq;
            int hijoDer = hijoIzq + 1;

            // Comparar con el hijo derecho si existe
            if (hijoDer < tamaño && heap[hijoDer] > heap[hijoIzq]) {
                hijoMayor = hijoDer;
            }

            // Si el padre ya es mayor que sus hijos, se termina
            if (heap[i] >= heap[hijoMayor]) break;

            // Si no, intercambiar con el hijo mayor
            intercambiar(heap, i, hijoMayor);

            i = hijoMayor;
            hijoIzq = 2 * i + 1;
        }
    }

    // Intercambia dos elementos del heap
    public static void intercambiar(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Busca la posición de un valor en el heap (O(n))
    public static int buscar(int[] heap, int tamaño, int x) {
        for (int i = 0; i < tamaño; i++) {
            if (heap[i] == x) return i;
        }
        return -1;
    }

}
