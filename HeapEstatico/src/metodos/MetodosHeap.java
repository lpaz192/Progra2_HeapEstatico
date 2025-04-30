package metodos;

public class MetodosHeap {

    public void EliminarMayoresaX (int[] heap, int tamaño, int x){
        int[] nuevoheap = new int [tamaño];
        int nuevotamaño = 0;

        for (int i=0 ; i<tamaño ; i++){
            if (heap[i] <= x){
                nuevoheap[nuevotamaño]= heap[i];
                nuevotamaño ++;
            }
        }

        for (int i = 0; i < nuevotamaño; i++) {
            heap[i] = nuevoheap[i];
}

        for (int i = nuevotamaño; i < tamaño; i++) {
            heap[i] = 0; // o cualquier valor por defecto
        }
        for (int i = nuevotamaño / 2 - 1; i >= 0; i--) {
            sort(heap, nuevotamaño, i);
    }
}

    // Reordena el heap hacia abajo (heapify-down)
    public void sort(int[] heap, int tamaño, int i) {
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
            swap(heap, i, hijoMayor);

            i = hijoMayor;
            hijoIzq = 2 * i + 1;
        }
    }

    // Intercambia dos elementos del heap
    public void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    }

