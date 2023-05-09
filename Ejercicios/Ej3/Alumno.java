package Ej3;

public class Alumno implements Comparable<Alumno>{
    String[] nombres = { "Juan", "Jose", "Pedro", "Fernando", "Ana", "Maria", "Gerard", "Pablo", "Rosa", "Marcos" };
    String[] apellidos = { "Illazquez", "Garcia", "Marquez", "Izquierdo", "Mesa", "Pique", "Fernandez", "Dunian", "Blasco", "Messi" };

    private String nombre;
    private String apellido;
    private int media;
    private int id;

    public Alumno(int numnom, int numape, int uno, int dos, int tres,int id) {
        if (numnom < 0 || numnom > 9 || numape < 0 || numape > 9)
            throw new IllegalArgumentException();
        nombre = nombres[numnom];
        apellido = apellidos[numape];
        media = (uno+dos+tres)/3;
        this.id = id;
    }
    public int getMedia() {
        return media;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }

    public String toString() {
        return getNombre() + " " + getApellido()+" Media: "+getMedia()+" Id: "+getId();
    }
    @Override
    public int compareTo(Alumno alumno) {
        int comparacion = apellido.compareTo(alumno.getApellido());
        if (comparacion == 0) {
            comparacion = nombre.compareTo(alumno.getNombre());
        }
        return comparacion;
    }

}