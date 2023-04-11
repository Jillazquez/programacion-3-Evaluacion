package PracticaExamen_8;

public class Pajaro extends Animal implements Mascota{

    public Pajaro(String nombre, String genero, int edad) {
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
        System.out.println("Pio");
    }
    
}
