package Ordenacion;

public class burbuja {

    public static void ordenar(Integer[] e) {
        int ayuda = 0;
        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[i] > e[j]) {
                    ayuda = e[i];
                    e[i] = e[j];
                    e[j] = ayuda;
                }
            }

        }
        for (int k = 0; k < e.length; k++) {
            System.out.print(e[k] + " ");
        }
    }

    public static void main(String[] args) {
        burbuja b = new burbuja();
        long tik_actual = System.currentTimeMillis();
        Integer[] v = {43,1,42,56,10,6,23,76,3,5};
        burbuja.ordenar(v);
        System.out.println();
        System.out.println(System.currentTimeMillis()-tik_actual);
    }

}
