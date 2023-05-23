package Ficheros.ExamenLike.Ej2;

import java.io.Serializable;

public class venta implements Serializable{
    private String fecha;
    private int importe;
    private String Cliente;
    private boolean cobrada;

    public venta(String fecha,int importe, String Cliente, boolean cobrada){
        this.fecha = fecha;
        this.importe = importe;
        this.Cliente = Cliente;
        this.cobrada = cobrada;        
    }
    public String getCliente() {
        return Cliente;
    }
    public String getFecha() {
        return fecha;
    }
    public int getImporte() {
        return importe;
    }
    public boolean getCobrada() {
        return cobrada;
    }
    public String toString() {
        if(cobrada){
            return "La venta con fecha de "+fecha+" con un importe de "+importe+" del cliente "+Cliente+" esta pagada";
        }else{
            return "La venta con fecha de "+fecha+" con un importe de "+importe+" del cliente "+Cliente+" no esta pagada";
        }
        
    }
}
