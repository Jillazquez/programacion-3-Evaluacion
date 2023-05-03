package PracticaExamen_010;

public class Pelicula extends Producto {

    private String director;
    private String genero;

    public Pelicula(int precio, String titulo, String director, String genero) {
        super(precio, titulo);
        this.genero = genero;
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
