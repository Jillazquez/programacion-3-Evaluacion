package PracticaExamen_010;

public abstract class Producto {
    private int precio;
    private String titulo;

    public Producto(int precio, String titulo){
        this.precio = precio;
        this.titulo = titulo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
