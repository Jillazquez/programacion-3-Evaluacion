package PracticaExamen_8;

public class Main {
        public static void main(String[] args) {
            Animal[] animales = new Animal[3];
            animales[0] = new Perro("Fido", "Macho", 3);
            animales[1] = new Gato("Garfield", "Macho", 3);
            animales[2] = new Pajaro("Piolín","Hembra", 2);
    
            Dueño dueño = new Dueño("Juan", 30, animales);
    }
}
