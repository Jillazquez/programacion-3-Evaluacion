package PracticaExamen_3;

public class Motos extends Vehiculo{

    private int cilindraje;
    private String transmision;

    public Motos(String marca, String modelo, int añoFabricacion, int cilindraje, String transmision) {
        super(marca, modelo, añoFabricacion);
        this.transmision=transmision;
        this.cilindraje=cilindraje;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public String getTransmision() {
        return transmision;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("La moto tiene cilindraje "+cilindraje);
        System.out.println("La transmision de la motos es "+transmision);
    }
    
}
