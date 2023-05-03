package PracticaExamen_6;

public class Alumno extends Persona{

    private String matricula;
    private double promedio;

    public Alumno(String nombre,String dni,int edad,String matricula, double promedio){
        super(nombre,edad,dni);
        this.matricula = matricula;
        this.promedio = promedio;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getPromedio() {
        return promedio;
    }
    public void estudiando(){
        System.out.println("El alumno "+getNombre()+" esta estudiando");
    }
    public String toString(){
        return "El alumno "+getNombre()+" con matricula "+matricula+" tiene un promedio de "+promedio;
    }
}
