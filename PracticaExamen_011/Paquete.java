package PracticaExamen_011;

public class Paquete {
    private int trackingnumber;
    private int peso;
    private String remitente;
    private String destinatario;
    private Boolean entregado;

    public Paquete(int trackingnumber, int peso, String remitente, String destinatario){
        this.trackingnumber = trackingnumber;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        entregado = false;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public Boolean getEntregado() {
        return entregado;
    }
    public int getPeso() {
        return peso;
    }
    public String getRemitente() {
        return remitente;
    }
    public int getTrackingnumber() {
        return trackingnumber;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    public void setTrackingnumber(int trackingnumber) {
        this.trackingnumber = trackingnumber;
    }
    
    public void actualizacionPaquete(String nuevo){
        entregado = true;
    }

    public int calculoCostoEnvio(){
        return (int)(getPeso()*0.5);
    }
    public String toString(){
        return "El paquete"+trackingnumber+" con peso "+peso;
    }
}
