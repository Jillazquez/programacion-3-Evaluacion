package PracticaExamen_2;

public class Estudiante extends Persona{

    String numeroMatricula;
    String carrera;
    int promedio;

    public Estudiante(String nombre, int edad,int promedio, String carrera, String numeroMatricula) {
        super(nombre, edad);
        this.promedio=promedio;
        this.carrera=carrera;
        this.numeroMatricula=numeroMatricula;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("Promedio: "+promedio);
        System.out.println("Carrera: "+carrera);
        System.out.println("Su numero de matricula es: "+numeroMatricula);
    }
    
}
