package Ficheros.ExamenLike.IllazquezDuñan3Ev;

import java.io.Serializable;

public class tripulante implements Serializable {
    private String nombre;
    private String DNI;

    public tripulante(String nombre, String dni) {
        this.nombre = nombre;
        dni= añadirCifrasDNI(dni);
        if (verificarDNI(dni)) {
            this.DNI = dni;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Tripulante " + nombre + " con DNI " + DNI;
    }
    public static String añadirCifrasDNI(String dni){
        if (dni.length() != 9) {
            if (dni.length() < 9) {
                for (int i = dni.length(); i < 9; i++) {
                    dni = "0" + dni;
                }
            }

        }
        return dni;
    }

    // Preguntar a antonio si asi se puede con numero y no substring
    public boolean verificarDNI(String dni) {

        int numdni = Integer.parseInt(dni.substring(0, 8));
        char letradni = dni.charAt(8);
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        char letracorrecta = letras[numdni % 23];
        if (letradni == letracorrecta)
            return true;
        return false;

    }
}
