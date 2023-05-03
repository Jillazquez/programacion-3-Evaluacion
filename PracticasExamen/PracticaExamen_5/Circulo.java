package PracticaExamen_5;
public class Circulo extends FigurasGeometricas{

    private int radio;

    public Circulo(int lados, int largoLado, int radio) {
        super(lados, largoLado);
        this.radio=radio;

    }

    @Override
    public int calculaArea() {
        return (int) (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public int calculaPerimetro() {
        return (int) (2*Math.PI*radio);
    }
    
}
