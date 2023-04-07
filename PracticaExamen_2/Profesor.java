package PracticaExamen_2;

public class Profesor extends Persona{

    private int numeroTrabajador;
    private String especialidad;
    private int sueldo;
    public Profesor(String nombre, int edad, int sueldo, int numeroTrabajador, String especialidad) {
        super(nombre, edad);
        this.sueldo=sueldo;
        this.numeroTrabajador=numeroTrabajador;
        this.especialidad=especialidad;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Numero de trabajador: "+numeroTrabajador);
        System.out.println("Especialidad: "+especialidad);
    }
    
}
