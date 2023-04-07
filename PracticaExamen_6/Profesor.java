package PracticaExamen_6;
public class Profesor extends Persona{
    private String especialidad;
    private int salario;

    public Profesor(String nombre, String dni, int edad, String especialidad, int salario){
        super(nombre, edad, dni);
        this.especialidad = especialidad;
        this.salario = salario;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public int getSalario() {
        return salario;
    }
    public void darClase(){
        System.out.println("El profesor "+getNombre()+" esta dando clase");
    }
    public String toString(){
        return "El profesor "+getNombre()+" con salario "+salario+" trabaja en la especialidad "+especialidad;
    }

}
