package Ficheros.Ejercicios;

import java.util.*;
import java.io.*;

public class ej6 {
    public static void main(String[] args) throws IOException {
        int contador = 0;
        ArrayList<String> palabras = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("palabras.txt"));
            String palabra;
            while ((palabra = reader.readLine()) != null) {
                palabras.add(palabra);
            }
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
            return;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        for (String palabra : palabras) {
            if (palabra.equals("perro"))
                contador++;
        }
        System.out.println("La palabra perro aparece " + contador + " veces");
    }
}
