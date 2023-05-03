package PracticaExamen_8;

public class Dueño {
    private String nombre;
    private int edad;
    Animal[] animales;

    public Dueño(String nombre, int edad, Animal[] animales){
        this.nombre = nombre;
        this.edad = edad;
        this.animales = animales;
    }

    public void jugarMascotas(){
        for(int i = 0; i< animales.length;i++){
            animales[i].jugar();
        }
    }
}
