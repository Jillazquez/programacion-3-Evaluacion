package Ficheros.Ejercicios;

import java.util.*;
import java.io.*;

public class CribaEratostenes {
    public static void main(String[] args) throws IOException {
        int limite = 500;
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> primo = new ArrayList<>();
        for (int i = 2; i <= limite; i++) {
            primos.add(i);
            primo.add(i);
        }
        int num = 2;
        while (primos.contains(primo.get(num-2) * primo.get(num-2)) && primo.get(num-2) < limite) {
            for (Integer p : primos) {
                if (p % num == 0 && p != num) {
                    primo.remove(p);
                }
            }
            num++;
        }
        FileWriter escrito = null;
        try {
            escrito = new FileWriter("primos.txt");

            for (Integer p : primo) {
               String cosa = p.toString()+", ";
                escrito.write(cosa);
                /*
                for(int i = 0;i<cosa.length();i++){
                    escrito.write((cosa.charAt(i)));
                    System.out.print((cosa.charAt(i)));
                }
                */

            }
        } finally {

            if (escrito != null){
                escrito.close();
            }
            System.out.println();
        }
    }
}
