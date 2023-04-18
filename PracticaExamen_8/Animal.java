package PracticaExamen_8;

public abstract class Animal {

    private String genero;
    private int edad;
    private String nombre;

    public Animal(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void sonido();
}