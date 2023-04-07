package PracticaExamen_7;

public class Moto extends Vehiculo{
    private int cilindrada;
    private String tipoMoto;

    public Moto(String marca, String modelo, int anio, String color,int cilindrada, String tipoMoto){
        super(marca,modelo,anio,color);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public String getTipoMoto() {
        return tipoMoto;
    }
    public void hacerCaballito(){
        System.out.println("La moto esta haciendo un caballito");
    }
    public void cambiarAceite(){
        System.out.println("Se ha cambiado el aceite de la moto");
    }
}
