package PracticaExamen_5;

public class Cuadrado extends FigurasGeometricas{

    private int lado;

    public Cuadrado(int lados, int largoLado,int lado) {
        super(lados, largoLado);
        this.lado = lado;
        //TODO Auto-generated constructor stub
    }
    public int getLado() {
        return lado;
    }

    @Override
    public int calculaArea() {
        return getLado()*getLado();
    }

    @Override
    public int calculaPerimetro() {
        return getLado()*4;
    }

}
