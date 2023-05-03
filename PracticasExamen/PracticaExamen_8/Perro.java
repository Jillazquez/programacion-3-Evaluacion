package PracticaExamen_8;

public class Perro extends Animal implements Mascota{

    public Perro(String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void jugar() {
        System.out.println(getNombre()+" esta feliz");
    }

    @Override
    public void alimentar() {
        System.out.println(getNombre()+" te agradece");
    }

    @Override
    public void sonido() {
        System.out.println("Guau");
    }
    
}
