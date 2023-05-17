package Ficheros.Ejercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ej4 {
    public static void main(String[] args) throws IOException {
        //PREGUNTAR COMO CONSEGUIR LAS PALABRAS SEPARADAS NO POR LETRAS
        if (args.length < 1) {
            throw new IllegalArgumentException("Faltan argumentos");
        }
        ArrayList<String> palabras = new ArrayList<>();

        FileReader hola = null;
        FileWriter file2 = null;
        try {
            int num;
            hola = new FileReader(args[0]);
            file2 = new FileWriter(args[1]);
            while ((num = hola.read())!=-1) {
                char letra = (char) (num);
                String palabra = ""+letra;
                palabras.add(palabra);
            }
            Collections.sort(palabras);
            for(String palabra : palabras){
                file2.write(palabra);
            }
            System.out.println(palabras);
        } finally {
            if (hola != null)
                hola.close();
            if (file2 != null)
                file2.close();
        }
    }
}
