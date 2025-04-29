package interfaces;
public interface HeapTDA {
    void inicializar ();
    void agregar (int x);
    void eliminar (int x);
    boolean heapVacio ();
    int dimension ();
}