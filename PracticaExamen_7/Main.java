package PracticaExamen_7;

public class Main{
    public static void main(String[] args) {
        Coche coche= new Coche("Citroen", "Saxo", 2005, "Azul", "Diesel", 70);
        Moto moto = new Moto("Yamaha", "Vespa", 2005, "Verde", 100, "Combustion");
        coche.arrancar();
        moto.arrancar();
        coche.detener();
        moto.detener();
        coche.cargarCombustible(2);
        coche.conducir(500);
        coche.conducir(1000);
        moto.cambiarAceite();
        moto.hacerCaballito();
    }
    
}
