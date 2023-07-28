package Ficheros.ExamenLike.IllazquezDuñan3Ev;

import java.io.Serializable;
import java.util.ArrayList;

public class avion implements Serializable{
    private String nombre;
    private int capacidad;
    private ArrayList<tripulante> tripulantes = new ArrayList<>();

    public avion(String nombre,int capacidad){
        this.nombre = nombre;
        if(capacidad<50||capacidad>348){
            throw new IllegalArgumentException("Dato incorrecto los aviones tienen capacidad desde 50 hasta 348");
        }else
            this.capacidad = capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<tripulante> getTripulantes() {
        return tripulantes;
    }

}
