package PracticaExamen_6;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String toString(){
        return "La persona "+nombre+" con edad de "+edad+" años y dni "+dni;
    }
}
