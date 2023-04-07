package PracticaExamen_5;

public class Triangulo extends FigurasGeometricas{
        private int base;
        private int ladoizq;
        private int ladoder;
        private int altura;

    public Triangulo(int lados, int largoLado,int base, int ladoder, int ladoizq) {
        super(lados, largoLado);
        this.base=base;
        this.ladoder=ladoder;
        this.ladoizq=ladoizq;
        this.altura=(int)Math.sqrt(Math.pow(ladoizq, 2)-Math.pow(base*0.5, 2));
    }

    @Override
    public int calculaArea() {
        return (int)((base*altura)*0.5);
    }

    @Override
    public int calculaPerimetro() {
        return base+ladoder+ladoizq;
    }
    
}
