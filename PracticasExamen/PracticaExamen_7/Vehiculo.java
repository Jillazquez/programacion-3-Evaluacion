package PracticaExamen_7;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Vehiculo(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void arrancar(){
        System.out.println("El vehiculo esta arrancado");
    }
    public void detener(){
        System.out.println("El vehiculo se ha detenido");
    }
}
