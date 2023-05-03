package PracticaExamen_010;

public class Musica extends Producto{

    private String artista;
    private String genero;

    public Musica(int precio, String titulo, String artista, String genero) {
        super(precio, titulo);
        this.artista = artista;
        this.genero = genero;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
