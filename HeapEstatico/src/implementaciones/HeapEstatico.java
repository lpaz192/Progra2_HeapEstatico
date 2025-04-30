package implementaciones;

import interfaces.HeapTDA;

public class HeapEstatico implements HeapTDA {
    public int[] heap;
    int tamaño;

    public void inicializar(){
        heap = new int[100]; // Capacidad máxima fija (se puede ajustar)
        tamaño = 0;
    }
      // Reordena el heap hacia arriba (heapify-up)
    public void subir(int[] heap, int i) {
        while (i > 0 && heap[i] > heap[(i - 1) / 2]) {
            int padre = (i - 1) / 2;
            intercambiar(heap, i, padre);
            i = padre;
        }
    }

    // Reordena el heap hacia abajo (heapify-down)
    public void bajar(int[] heap, int tamaño, int i) {
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
    public void intercambiar(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Busca la posición de un valor en el heap (O(n))
    public int buscar(int[] heap, int tamaño, int x) {
        for (int i = 0; i < tamaño; i++) {
            if (heap[i] == x) return i;
        }
        return -1;
    }

    public void agregar(int x) {
        if (tamaño >= heap.length) return; // Verificar espacio disponible

        heap[tamaño] = x; // Insertar al final
       subir(heap, tamaño); // Reacomodar hacia arriba
        tamaño++;
    
    }

    public void eliminar(int x) {
        int pos = buscar(heap, tamaño, x);
        if (pos == -1) return; // Si no se encuentra, no se elimina

        tamaño--; // Reducimos el tamaño
        heap[pos] = heap[tamaño]; // Reemplazamos con el último
        bajar(heap, tamaño, pos); // Primero bajamos si es necesario
        subir(heap, pos); // Luego subimos si es necesario
  
    }

    public boolean heapVacio() {
        return tamaño == 0;
   
    }

    public int dimension() {
        return tamaño;
    }

    public void imprimirHeap() {
        for (int i = 0; i < tamaño; i++) {
            if (heap[i] != 0){
            System.out.print(heap[i] + " ");
            }
        }
        System.out.println();
    }

}
