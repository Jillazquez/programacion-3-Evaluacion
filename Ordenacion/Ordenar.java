package Ordenacion;

public abstract class Ordenar implements Ordenable{
    protected Comparable[] v;

    public Ordenar (Comparable[] c){
        v=c.clone();
    }
    public String toString(){
        return "hola";
    }
    protected void intercambio(int i, int j){
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    
}
