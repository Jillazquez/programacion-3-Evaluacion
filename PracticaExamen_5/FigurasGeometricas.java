package PracticaExamen_5;

public abstract class FigurasGeometricas {
    private int lados;
    private int largoLado;

    public FigurasGeometricas(int lados,int largoLado){
        this.lados =lados;
        this.largoLado=largoLado;
    }
    public int getLados() {
        return lados;
    }
    public int getLargoLado() {
        return largoLado;
    }
    public abstract int calculaArea();
    public abstract int calculaPerimetro();

}
