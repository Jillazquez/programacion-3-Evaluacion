package PracticaExamen_8;

public class Gato extends Animal implements Mascota{

    public Gato(String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void jugar() {
        System.out.println(getNombre()+" muestra indiferencia");
    }

    @Override
    public void alimentar() {
        System.out.println(getNombre()+" esta feliz");
    }

    @Override
    public void sonido() {
        System.out.println("Miau");
    }
    
}
