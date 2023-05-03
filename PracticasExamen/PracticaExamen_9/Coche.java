package PracticaExamen_9;

public class Coche {
    private String marca;
    private String modelo;
    private int aniofabricacion;
    private double precioVenta;
    private int unidadesDisponibles;

    public Coche (String marca, String modelo, int aniofabricacion, double precioVenta, int unidadesDisponibles){
        this.marca=marca;
        this.modelo=modelo;
        this.aniofabricacion=aniofabricacion;
        this.precioVenta=precioVenta;
        this.unidadesDisponibles=unidadesDisponibles;
    }
    public int getAniofabricacion() {
        return aniofabricacion;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Boolean comparaCoche(Coche c2){
        return c2.getAniofabricacion()==getAniofabricacion()&&c2.getMarca()==getMarca()&&c2.getModelo()==getModelo();
            
    }

    public void ventaCoche(){
        if(unidadesDisponibles>0){
        System.out.println("Se ha vendido un modelo por "+getPrecioVenta());
        setUnidadesDisponibles(unidadesDisponibles-1);
        }else{
            System.out.println("No se posible vender ya que no hay unidades suficientes");
        }

    }

    public void añadirCoche(int unidades){
        System.out.println("Se han añadido"+unidades+" del modelo "+getModelo());
        setUnidadesDisponibles(getUnidadesDisponibles()+unidades);
    }

    public Coche buscarCoche(Coche[] coches,String mar,String mod,int año){
        for(int i =0;i<coches.length;i++){
            if(coches[i].getAniofabricacion()==año&&mar.equals(coches[i].getMarca())&&mod.equals(coches[i].getModelo()))
            return coches[i];
        }
        return null;
    }

    public String toString(){
        return "El coche modelo"+ getModelo()+" de la marca "+getMarca();
    }

}
