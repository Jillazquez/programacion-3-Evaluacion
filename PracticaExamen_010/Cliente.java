package PracticaExamen_010;

public class Cliente {
    
    private String nombre;
    private int numeroIdentificacion;
    private Producto[] compras;
    private int num;
    private Boolean fidelidad;

    public Cliente(String nombre, int numeroIdentificacion,Producto[] compras){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.compras =  compras;
        fidelidad = false;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    
    public void compras(Producto objeto){
        getDescuento(objeto);
        compras[num] = objeto;
        num++;
    }

    public void clienteFiable(){
        System.out.println("El cliente "+getNombre()+" ahora es un cliente fiable");
        fidelidad = true;
    }

    public void getDescuento(Producto compras){
        if(fidelidad){
            compras.setPrecio((int) (compras.getPrecio()*0.9));
        }
    }
    
}
