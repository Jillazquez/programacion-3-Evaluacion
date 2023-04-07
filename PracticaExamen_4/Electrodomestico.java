package PracticaExamen_4;

public abstract class Electrodomestico {
    private int color;
    private int peso;

    public Electrodomestico(int peso){
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int diasTranscurridos(int dias){
        return dias;
    }
    public boolean debeRevisarse(){
        return false;
    }
    public void pasarRevision(){
        
    }
}
