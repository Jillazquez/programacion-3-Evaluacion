package PracticaExamen_5;
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas[] f1 = new FigurasGeometricas[3];
        f1[0] = new Cuadrado(4,5,5);
        f1[1] = new Triangulo(3, 5, 4, 9, 7);
        f1[2] = new Circulo(0, 0, 5);
        System.out.println(f1[0].calculaArea()+" "+f1[0].calculaPerimetro());
        System.out.println(f1[1].calculaArea()+" "+f1[1].calculaPerimetro());
        System.out.println(f1[2].calculaArea()+" "+f1[2].calculaPerimetro());
        
    }

}
