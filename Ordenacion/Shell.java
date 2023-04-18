package Ordenacion;

public class Shell {
    public static void main(String[] args) {
        Integer[] shell = { 6, 10, 3, 54, 1, 27, 4};
        int n = shell.length;
        int d = n / 2;
    
        while (d > 0) {
            for (int i = d; i < n; i++) {
                int aux = shell[i];
                int j = i;
    
                while (j >= d && shell[j - d] > aux) {
                    shell[j] = shell[j - d];
                    j -= d;
                }
                shell[j] = aux;
            }
            d /= 2;
        }
        for (int i = 0; i < shell.length; i++) {
            System.out.print(shell[i] + " ");
        }
    }
}
