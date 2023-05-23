package Ficheros.ExamenLike.Ej2;

import java.io.Serializable;
import java.util.*;

public class viajante implements Serializable{

    private String DNI;
    private String Nombre;
    private int antiguedad;
    private int distanciaRecorrida;
    private ArrayList<venta> ventas = new ArrayList<>();

    public viajante(String dni, String nombre,int antiguedad, int distanciaRecorrida){
        this.DNI = dni;
        this.Nombre = nombre;
        this.antiguedad = antiguedad;
        this.distanciaRecorrida = distanciaRecorrida;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public String getDNI() {
        return DNI;
    }
    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    public String getNombre() {
        return Nombre;
    }
    public ArrayList<venta> getVentas() {
        return ventas;
    }
    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public void mostrarInfo(){
        System.out.println("El cliente ha recorrido "+distanciaRecorrida);
        for(venta v : ventas){
            System.out.println(v);
        }
    }



}
