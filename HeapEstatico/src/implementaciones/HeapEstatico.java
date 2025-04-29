package implementaciones;

import interfaces.HeapTDA;
import metodos.MetodosHeap;

public class HeapEstatico implements HeapTDA {
    int[] heap;
    int tamaño;

    public void inicializar(){
        heap = new int[100]; // Capacidad máxima fija (se puede ajustar)
        tamaño = 0;
    }

    public void agregar(int x) {
        if (tamaño >= heap.length) return; // Verificar espacio disponible

        heap[tamaño] = x; // Insertar al final
        MetodosHeap.subir(heap, tamaño); // Reacomodar hacia arriba
        tamaño++;
    
    }

    public void eliminar(int x) {
        int pos = MetodosHeap.buscar(heap, tamaño, x);
        if (pos == -1) return; // Si no se encuentra, no se elimina

        tamaño--; // Reducimos el tamaño
        heap[pos] = heap[tamaño]; // Reemplazamos con el último
        MetodosHeap.bajar(heap, tamaño, pos); // Primero bajamos si es necesario
        MetodosHeap.subir(heap, pos); // Luego subimos si es necesario
  
    }

    public boolean heapVacio() {
        return tamaño == 0;
   
    }

    public int dimension() {
        return tamaño;
    }
    // Método auxiliar opcional: imprimir el heap
    public void imprimirHeap() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
