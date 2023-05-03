# Iteradores
+ hasNext
+ next
+ reset

```java
Añadir atributo:
private int iterador;

public void reset(){
    iterador = 0;
}

public boolean hasNext(){
    return iterador < tamaño;
}

public Punto next(){
    if(iterador==tam)
        throw new IndexOutofBound;
    return lista[iterador++];
}

Lista lista;
.
.
lista.reset();
while (lista.hasNext()){
    Punto p = lista.next();
}

```
1º Añadir y eliminar son incompatibles 
    => reset()
2º Añadir y eliminar dependen del iterador
    => solo puedo añadir y eliminar en la posición actual del iterador

LIFO PILA
vacia empty
itera full
insertar push
eliminar pop
FIFO COLA
```java
public class Cola{
    Punto[] cola;
    //En java no almacenamos la capacidad del vector
    //Pero queremos saber cuantos elementos tiene la lista
    int tamaño; //Cantidad de elementos en la lista
    public Cola(int capacidad){
        if(capacidad<=0)
            throw new IllegalArgumentException();
        cola = new Punto[Capacidad];
        tamaño = 0;

    }
    public void vacia(){
        tamaño = 0;
    }

    public void insertar(Punto punto){
        if(tamaño==cola.lenght)
            throw new IndexOutofBound();
        cola[tamaño++] = punto;
        tamaño++;
    }

    public void eliminar(){
        if(tamaño == 0)
            throw new IllegalArgumentException();
        
    }
}

[8][9][3][4][5][6][7]


```