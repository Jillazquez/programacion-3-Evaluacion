package PracticaExamen_3;
public class Coche extends Vehiculo{

    private int puertas;
    private String combustible;

    public Coche(String marca, String modelo, int añoFabricacion, int puertas, String combustible) {
        super(marca, modelo, añoFabricacion);
        this.combustible=combustible;
        this.puertas=puertas;
    }
    public int getPuertas() {
        return puertas;
    }
    public String getCombustible() {
        return combustible;
    }
    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        super.mostrarInformacion();
        System.out.println("Tiene "+getPuertas()+" puertas");
        System.out.println("Usa combustible "+getCombustible());
    }
    
}
