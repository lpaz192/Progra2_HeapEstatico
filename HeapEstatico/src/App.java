import implementaciones.HeapEstatico;
import interfaces.HeapTDA;
import metodos.MetodosHeap;

public class App {public static void main(String[] args) {
        // Crear e inicializar el heap
        HeapTDA heap = new HeapEstatico();
        heap.inicializar();

        // Verificar si está vacío
        System.out.println("¿Heap vacío? " + heap.heapVacio());

        // Agregar elementos
        heap.agregar(40);
        heap.agregar(15);
        heap.agregar(30);
        heap.agregar(50);
        heap.agregar(20);

        System.out.println("Tamaño del heap: " + heap.dimension());

        // Imprimir heap
        System.out.print("Contenido del heap: ");
        heap.imprimirHeap();
        

        // Eliminar un elemento
        System.out.println("Eliminando 30...");
        heap.eliminar(30);

        // Estado final
        System.out.print("Heap después de eliminar 30: ");
        heap.imprimirHeap();	

        System.out.println("Tamaño actual del heap: " + heap.dimension());
        System.out.println("¿Heap vacío? " + heap.heapVacio());

        MetodosHeap metodos = new MetodosHeap();
        metodos.EliminarMayoresaX(((HeapEstatico)heap).heap, heap.dimension(), 30);
        System.out.print("Contenido del heap: ");
        heap.imprimirHeap();
    }

}
