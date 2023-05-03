package Ejercicios;

public class aplicacionej1 {
    public static void main(String[] args) {

        ej1 pila = new ej1();
        int x, y;
        //Bucle que añade 100 puntos a la pila
        for (int i = 0; i < 100; i++) {
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            Punto punto = new punto(x, y);
            pila.push(punto);
        }

        int borramos = (int) (Math.random() * 20);

        for (int i = 0; i < borramos; i++) {
            pila.pop();
        }
        pila.size();
    }
}
