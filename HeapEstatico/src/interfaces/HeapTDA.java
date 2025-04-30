package interfaces;
public interface HeapTDA {
    void inicializar ();
    void agregar (int x);
    void eliminar (int x);
    boolean heapVacio ();
    int dimension ();
    int buscar(int[] heap, int tamaño, int x);
    void intercambiar(int[] heap, int i, int j);
    void bajar(int[] heap, int tamaño, int i);
    void subir(int[] heap, int i);
}