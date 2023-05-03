package PracticaExamen_3;

public class main {
    public static void main(String[] args) {
        Vehiculo[] v = new Vehiculo[2];
        v[1] = new Coche("Citroen", "Saxo", 2001, 3, "gasolina");
        v[1].mostrarInformacion();
    }
}
