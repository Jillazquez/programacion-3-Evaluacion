package Ordenacion;

public class Shell {
    public static void main(String[] args) {
        Integer[] shell = { 6, 10, 3, 54, 1, 27 };
        int d = shell.length;

        while (d > 1) {
            d /= 2;
            for (int i = d; i < shell.length; i++) {
                if (shell[i] > shell[i + d]) {
                    int aux = shell[i];
                    shell[i] = shell[i + d];
                    shell[i + d] = aux;
                }
            }
        }
        for (int i = 0; i < shell.length; i++) {
            System.out.print(shell[i] + " ");
        }
    }
}
