package PracticaExamen_6;

public class Main {
    public static void main(String[] args) {
        Persona[] a = new Persona[2];
        a[0] = new Alumno("Juanma", "2380428347", 22, "23084", 10);
        a[1] = new Profesor("Juanma", "2380428347", 22, "23084", 10);
      
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
