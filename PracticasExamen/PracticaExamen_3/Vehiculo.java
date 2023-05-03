package PracticaExamen_3;

public abstract class Vehiculo{
    private String marca;
    private String modelo;
    private int añoFabricacion;

    public Vehiculo(String marca, String modelo, int añoFabricacion){
        this.añoFabricacion=añoFabricacion;
        this.marca=marca;
        this.modelo=modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void mostrarInformacion(){
        System.out.println("La marca es: "+getMarca());
        System.out.println("El modelo es: "+getModelo());
        System.out.println("El año de fabricacion es: "+getAñoFabricacion());
    }
}
