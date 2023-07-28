package Ficheros.ExamenLike.PARTE2ILLAZQUEZDUÑAN3EV;

import java.io.Serializable;

public abstract class tripulante implements Serializable {
    private String nombre;
    private String DNI;
    private boolean empleado;

    public tripulante(String nombre, String dni) {
        this.nombre = nombre;
        if(dni.length()!=9){
        dni= añadirCifrasDNI(dni);
        }
        if (verificarDNI(dni)) {
            this.DNI = dni;
        } else {
            throw new IllegalArgumentException();
        }
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
    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }
    public boolean getEmpleado(){
        return empleado;
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

    // Preguntar a antonio si asi se puede con numero y no substring
    public boolean verificarDNI(String dni) {
        if (dni.length() != 9)
            return false;
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
