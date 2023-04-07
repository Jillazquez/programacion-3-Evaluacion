package PracticaExamen_7;

public class Coche extends Vehiculo{
   
    private String tipoCombustible;
    private double capacidadCombustible;
    
    public Coche(String marca, String modelo, int anio, String color, String tipoCombustible, double capacidadCombustible) {
        super(marca, modelo, anio, color);
        this.capacidadCombustible = capacidadCombustible;
        this.tipoCombustible = tipoCombustible;
    }
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void cargarCombustible(int gasolina){
        capacidadCombustible+=gasolina;
    }
    public void conducir(int distancia){
        int gasto = distancia/10;
        if(capacidadCombustible>gasto){
            capacidadCombustible=capacidadCombustible-gasto;
        }else{
            System.out.println("No hay suficiente combustible para recorrer esa distancia");
        }
    }
}
