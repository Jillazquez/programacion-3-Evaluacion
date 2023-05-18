package Ficheros.ExamenLike.Ej1;

import java.io.Serializable;

public class sancion implements Serializable{
    private String fecha;
    private String motivo;
    private int importe;

    public sancion(String fecha, String motivo, int importe){
        this.fecha = fecha;
        this.motivo = motivo;
        this.importe = importe;
    }
    public String getFecha() {
        return fecha;
    }
    public int getImporte() {
        return importe;
    }
    public String getMotivo() {
        return motivo;
    }

    public String toString(){
        return "Sancion con fecha de "+fecha+" el motivo es: "+motivo+" con un importe total de "+importe;
    }
}
