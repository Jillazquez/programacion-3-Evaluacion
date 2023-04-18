package PracticaExamen_010;

public class Libro extends Producto{

    private int numeroPaginas;
    private String autor;

    public Libro(int precio, String titulo, int numeroPaginas, String autor) {
        super(precio, titulo);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }    
}
