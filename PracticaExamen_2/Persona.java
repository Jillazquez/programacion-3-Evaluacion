package PracticaExamen_2;

public abstract class Persona {
    
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInformacion(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

}
