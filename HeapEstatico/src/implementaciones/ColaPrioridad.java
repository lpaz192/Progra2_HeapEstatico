package implementaciones;

import interfaces.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA{
    int[] elementos;
    int[] prioridades;
    int indice;

    public void InicializarCola(){
        indice = 0;
        elementos = new int[100];
        prioridades= new int[100];
    }

    public void Acolar(int x, int prioridad) {
        int j = indice;
        for ( ; j>0 && prioridades[j-1] >= prioridad; j--){
            elementos[j] = elementos[j-1];
            prioridades[j]=prioridades[j-1];
        }
        elementos[j]=x;
        prioridades[j]= prioridad;
        indice ++;
    }

    @Override
    public void Desacolar() {
        indice --;
    }

    @Override
    public boolean ColaVacia() {
        return (indice == 0);
    }

    @Override
    public int primero() {
        return elementos[indice-1];
    }

    public int Prioridad(){
        return prioridades[indice-1];
    }
}
