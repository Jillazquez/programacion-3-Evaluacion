package Ej5;

import java.util.*;

public class SimulacionColas {
    public static void main(String[] args) {
        boolean uno = false, dos = false, tres = false, cuatro = false, cinco = false;
        ArrayList<cliente> colauno = new ArrayList<cliente>();
        ArrayList<cliente> colados = new ArrayList<cliente>();
        ArrayList<cliente> colatres = new ArrayList<cliente>();
        ArrayList<cliente> colacuatro = new ArrayList<cliente>();
        ArrayList<cliente> colacinco = new ArrayList<cliente>();
        int tiempouno = 0, tiempodos = 0, tiempotres = 0, tiempocuatro = 0, tiempocinco = 0, menor = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 5 == 0) {
                cliente client = new cliente();
                for (cliente c : colauno) {
                    tiempouno += c.getTiempo();
                }
                for (cliente c : colados) {
                    tiempodos += c.getTiempo();
                }
                for (cliente c : colatres) {
                    tiempotres += c.getTiempo();
                }
                for (cliente c : colacuatro) {
                    tiempocuatro += c.getTiempo();
                }
                for (cliente c : colacinco) {
                    tiempocinco += c.getTiempo();
                }
                menor = tiempouno;
                uno = true;
                if (tiempodos < menor) {
                    menor = tiempodos;
                    dos = true;
                    uno = false;
                }
                if (tiempotres < menor) {
                    menor = tiempotres;
                    tres = true;
                    dos = false;
                    uno = false;
                }
                if (tiempocuatro < menor) {
                    menor = tiempocuatro;
                    cuatro = true;
                    tres = false;
                    dos = false;
                    uno = false;
                }
                if (tiempocinco < menor) {
                    menor = tiempocinco;
                    cinco = true;
                    cuatro = false;
                    tres = false;
                    dos = false;
                    uno = false;
                }
                if (uno) {
                    colauno.add(client);
                }
                if (dos) {
                    colados.add(client);
                }
                if (tres) {
                    colatres.add(client);
                }
                if (cuatro) {
                    colacuatro.add(client);
                }
                if (cinco) {
                    colacinco.add(client);
                }

                uno = false;
                dos = false;
                tres = false;
                cuatro = false;
                cinco = false;
                tiempouno = 0;
                tiempodos = 0;
                tiempotres = 0;
                tiempocuatro = 0;
                tiempocinco = 0;
            }
            if(i%15==0){
                for (cliente c : colauno) {
                    tiempouno += c.getTiempo();
                }
                for (cliente c : colados) {
                    tiempodos += c.getTiempo();
                }
                for (cliente c : colatres) {
                    tiempotres += c.getTiempo();
                }
                for (cliente c : colacuatro) {
                    tiempocuatro += c.getTiempo();
                }
                for (cliente c : colacinco) {
                    tiempocinco += c.getTiempo();
                }
                System.out.println("-------------------------------------------------");
                System.out.println("Tiempo de la cola uno " + tiempouno);
                System.out.println("Tiempo de la cola dos " + tiempodos);
                System.out.println("Tiempo de la cola tres " + tiempotres);
                System.out.println("Tiempo de la cola cuatro " + tiempocuatro);
                System.out.println("Tiempo de la cola cinco " + tiempocinco);
            }
            if(!colauno.isEmpty()){
                colauno.get(0).setTiempo(colauno.get(0).getTiempo()-1);
                if(colauno.get(0).getTiempo()==0){
                    colauno.remove(0);
            }
        }
            if(!colados.isEmpty()){
                colados.get(0).setTiempo(colados.get(0).getTiempo()-1);
                if(colados.get(0).getTiempo()==0){
                    colados.remove(0);
            }
        }
            if(!colatres.isEmpty()){
                colatres.get(0).setTiempo(colatres.get(0).getTiempo()-1);
                if(colatres.get(0).getTiempo()==0){
                    colatres.remove(0);
            }
        }
            if(!colacuatro.isEmpty()){
                colacuatro.get(0).setTiempo(colacuatro.get(0).getTiempo()-1);
                if(colacuatro.get(0).getTiempo()==0){
                    colacuatro.remove(0);
            }
        }
            if(!colacinco.isEmpty()){
                colacinco.get(0).setTiempo(colacinco.get(0).getTiempo()-1);
                if(colacinco.get(0).getTiempo()==0){
                    colacinco.remove(0);
            }
        }


        }
    }
}
