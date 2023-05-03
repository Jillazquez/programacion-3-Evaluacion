package Ordenacion;

public class prueba {
    public static void main(String[] args) {
        Integer[] x = new Integer[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10000);
        }
        Ordenable burbu = new burbuja(x);
        burbu.ordenar(x);
    }
}
