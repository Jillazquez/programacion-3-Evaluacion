package Ficheros.ExamenLike.PARTE2ILLAZQUEZDUÑAN3EV;

import java.io.Serializable;

public class tripulantetecnico extends tripulante implements Serializable{

    private int horasVuelo;

    public tripulantetecnico(String nombre, String dni) {
        super(nombre, dni);
    }
    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }
    public int getHorasVuelo() {
        return horasVuelo;
    }
    @Override
    public String toString() {
        return "Tripulante Tecnico" + getNombre() + " con DNI " + getDNI()+", horas de vuelo "+horasVuelo;
    }
}
