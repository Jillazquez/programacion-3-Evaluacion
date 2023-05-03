package Ejercicios;

public class ej1{
    
    Punto[] pila;

    private int tamaño;

    public ej1(){
        pila = new Punto[100];
        tamaño = 0;
    }
    /*
     * Metodo que muestra el tamaño de la pila
     * 
     * @returns tamaño de la pila
     */
    public int size(){
        return tamaño;
    }
    /*
     * Metodo que añade un punto dado a la pila
     */
    public void push(Punto punto){
        if(tamaño == pila.lenght)
            throw new IndexOutOfBoundsException();
        pila[tamaño++]=punto;
        tamaño++;
    }
    public void pop(){
        if(tamaño == 0)
            throw new IndexOutOfBoundsException();
        tamaño--;
        /**
         * De esta manera lo hacemos null de la otra simplemente esperamos a que se sobreescriba
         * pila[tamaño--] = null;
         */
    }

    public void verPila(){
        for(int i = tamaño-1; i >= 0; i++){
            System.out.println(pila[i]);
            tamaño--;
        }
    }

}