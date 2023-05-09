package Ej5;

import java.util.*;

public class colas {
    public static void main(String[] args) {
        int tiemuno = 0, tiemdos = 0, tiemtres = 0, tiemcuatro = 0, tiemcinco = 0;
        boolean uno = false, dos = false, tres = false, cuatro = false, cinco = false;
        ArrayList<cliente> colauno = new ArrayList<cliente>();
        ArrayList<cliente> colados = new ArrayList<cliente>();
        ArrayList<cliente> colatres = new ArrayList<cliente>();
        ArrayList<cliente> colacuatro = new ArrayList<cliente>();
        ArrayList<cliente> colacinco = new ArrayList<cliente>();
        int[] tiempo = new int[5];
        int menor;

        for (int i = 1; i < 300; i++) {
            if (i % 5 == 0) {
                cliente client = new cliente();
                for (cliente c : colauno) {
                    tiemuno += c.getTiempo();
                }
                for (cliente c : colados) {
                    tiemdos += c.getTiempo();
                }
                for (cliente c : colatres) {
                    tiemtres += c.getTiempo();
                }
                for (cliente c : colacuatro) {
                    tiemcuatro += c.getTiempo();
                }
                for (cliente c : colacinco) {
                    tiemcinco += c.getTiempo();
                }
                menor = tiemuno;
                uno = true;
                if (tiemdos < menor) {
                    menor = tiemdos;
                    dos = true;
                    uno = false;
                }
                if (tiemtres < menor) {
                    menor = tiemtres;
                    tres = true;
                    dos = false;
                    uno = false;
                }
                if (tiemcuatro < menor) {
                    menor = tiemcuatro;
                    cuatro = true;
                    tres = false;
                    dos = false;
                    uno = false;
                }
                if (tiemcinco < menor) {
                    menor = tiemcinco;
                    cinco = true;
                    cuatro = false;
                    tres = false;
                    dos = false;
                    uno = false;
                }
                if (uno) {
                    colauno.add(client);
                    System.out.println("uno");
                }
                if (dos) {
                    colados.add(client);
                    System.out.println("dos");
                }
                if (tres) {
                    colatres.add(client);
                    System.out.println("tres");
                }
                if (cuatro) {
                    colacuatro.add(client);
                    System.out.println("cuatro");
                }
                if (cinco) {
                    colacinco.add(client);
                    System.out.println("cinco");
                }

                uno = false;
                dos = false;
                tres = false;
                cuatro = false;
                cinco = false;
            }

            if (i % 15 == 0) {
                System.out.println("-------------------------------------------------");
                System.out.println("Tiempo de la cola uno " + tiemuno);
                System.out.println("Tiempo de la cola dos " + tiemdos);
                System.out.println("Tiempo de la cola tres " + tiemtres);
                System.out.println("Tiempo de la cola cuatro " + tiemcuatro);
                System.out.println("Tiempo de la cola cinco " + tiemcinco);
            }
             // Restamos un minuto cada vez y si es cero lo borramos
             if (!colauno.isEmpty()) {
                colauno.get(0).setTiempo(colauno.get(0).getTiempo() - 1);
                if (colauno.get(0).getTiempo() == 0)
                    colauno.remove(colauno.get(0));
            }
            if (!colados.isEmpty()) {
                colados.get(0).setTiempo(colados.get(0).getTiempo() - 1);
                if (colados.get(0).getTiempo() == 0)
                    colados.remove(colados.get(0));
            }
            if (!colatres.isEmpty()) {
                colatres.get(0).setTiempo(colatres.get(0).getTiempo() - 1);
                if (colatres.get(0).getTiempo() == 0)
                    colatres.remove(colatres.get(0));
            }
            if (!colacuatro.isEmpty()) {
                colacuatro.get(0).setTiempo(colacuatro.get(0).getTiempo() - 1);
                if (colacuatro.get(0).getTiempo() == 0)
                    colacuatro.remove(colacuatro.get(0));
            }
            if (!colacinco.isEmpty()) {
                colacinco.get(0).setTiempo(colacinco.get(0).getTiempo() - 1);
                if (colacinco.get(0).getTiempo() == 0)
                    colacinco.remove(colacinco.get(0));
            }
            tiemuno = 0;
            tiemdos = 0;
            tiemtres = 0;
            tiemcuatro = 0;
            tiemcinco = 0;
        }
    }
}
