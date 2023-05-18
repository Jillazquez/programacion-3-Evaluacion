package Ficheros.Ejercicios;

import java.io.*;
import java.util.*;

public class ej4 {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Faltan argumentos/");
        }
        ArrayList<String> palabras = new ArrayList<>();

        BufferedReader reader = null;
        BufferedWriter writer = null;
                try {
            int num;
            reader = new BufferedReader(new FileReader(args[0]));
            writer = new BufferedWriter(new FileWriter(args[1]));
            String linea;
            while ((linea = reader.readLine()) != null) {
                palabras.add(linea);
            }
            
            Collections.sort(palabras);
            
            for(String palabra : palabras){
                writer.write(palabra);
                writer.write('\n');
            }
            System.out.println(palabras);
        } finally {
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
    }
}
