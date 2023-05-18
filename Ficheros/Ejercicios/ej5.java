package Ficheros.Ejercicios;

import java.util.*;
import java.io.*;

public class ej5 {
    public static void main(String[] args) throws IOException {
        if(args.length<2)
            throw new IllegalArgumentException("Faltan argumentos");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try{
            int c;
            reader = new BufferedReader(new FileReader(args[0]));
            writer = new BufferedWriter(new FileWriter(args[1]));
            while((c = reader.read()) != -1){
                if((char)(c)=='/'){
                    c = reader.read();
                    if((char)(c)=='/'){
                        reader.readLine();
                    }else{
                        writer.write('/');
                        writer.write((char)(c));
                    }
                }else{
                writer.write((char)(c));
                }
            }
        }finally{
            if(reader!= null)
                reader.close();
            if(writer!= null)
                writer.close();
        }
    }
}