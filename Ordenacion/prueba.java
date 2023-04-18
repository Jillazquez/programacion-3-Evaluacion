package Ordenacion;

public class prueba {
    public static void main(String[] args) {
        Integer[] x = {67,23,45,12,2,4,5,56,98,32,54};
        Ordenable burbu = new burbuja(x);
        burbu.ordenar(x);
    }
}
