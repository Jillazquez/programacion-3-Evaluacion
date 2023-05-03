TIMSORT

Arrays.sort(T[] t)
interface Comparable extends java.lang.Comparable <- int compareTo(Te)

Elemento{

int compareTo(   o){
    return clave - o.clave;
}       ((Elemento)O).clave

}
public class Lechuga implements Comparable <Lechuga>
int compareTo (Lechuga otro)




TAD: Lista (de elementos)
Cosas que puedo hacer Busqueda
- busqueda (elemento)
- ordenacion
- insertar (elemento), (elemento en una posicion)
- eliminar (elemento)
- llena boolean
- vacia boolean
- clona
todo esto sobre un elemento concreto
Sí, el método eliminar(Punto punto) que has compartido parece hacer lo que deseas: busca el objeto punto en una lista de puntos y lo elimina, desplazando todos los elementos de la derecha un índice a la izquierda para llenar el espacio vacío.

En concreto, el método recorre la lista de puntos usando un bucle for, buscando si el objeto punto pasado como parámetro está en la lista. Si lo encuentra, comienza otro bucle for que se ejecuta desde la posición del punto encontrado hasta el final de la lista, y desplaza cada elemento una posición a la izquierda para llenar el espacio vacío.

Hay un pequeño error en el segundo bucle for, en la línea lista[i]=lista[i+1]; debería ser lista[k]=lista[k+1];, ya que k es la variable que se utiliza como índice en ese bucle.

En general, ten en cuenta que este método eliminará solo la primera aparición del objeto punto en la lista, si hay más de una. Si deseas eliminar todas las ocurrencias de punto en la lista, deberás ajustar el método para hacerlo.
Constructor (capacidad)

Ejemplo creando

Creo un vector de un objeto
antes creo el objeto
```java
public class Punto{
    float x,y;

}

public class ListaPuntos{
    Punto[] lista;
    //En java no almacenamos la capacidad del vector
    //Pero queremos saber cuantos elementos tiene la lista
    int tamaño; //Cantidad de elementos en la lista
    public ListaPuntos(int capacidad){
        if(capacidad<=0)
            throw new IllegalArgumentException();
        lista = new Punto[Capacidad];
        tamaño = 0;

    }

     public boolean llena(){
        return tamaño=lista.length;
    }
    public boolean vacia(){
        return tamaño=0;
    }
    
    public void insertar(Punto punto){
        if(tamaño == lista.lenght)
            throw new IndexOutofBoundsException();
        lista[tamaño ++] = punto;
    }
        public void insertar(Punto punto, int posicion){
        //con machaque
        if(posicion>tamaño || posicion <0)
            throw new IllegalArgumentException();
        lista[posicion] = punto;
        //sin machaque
        if(posicion>lista.lenght || posicion >= tamaño || posicion < 0)
            throw new IllegalArgumentException();
        for(int k = tamaño; k>posicion;k--){
            lista[k] = lista[k-1];
        lista[posicion] = punto;
        tamaño++;
            }
        }

        public void eliminar(Punto punto){
            //Elimino un punto si se encuentra en la lista
            boolean eliminado=false;
            for(int i =0;i<tamaño;i++){
                if(lista[i].equals(punto)){
                    
                    for(int k = i; k<tamaño;k++){
                        lista[i]=lista[i+1];
                    } 
                    tamaño--;
                    eliminado = true;
                }   
            }
            if(!eliminado)
                throw new IllegalArgumentException();
        }

        public void eliminar(Punto punto, int posicion){
            //Elimino un punto en una posicion determinada
            boolean eliminado = false;
            if(lista[posicion].equals(punto)){
                for(int k = 0; k<tamaño;k++){
                    lista[k]=lista[k+1];
                }
                    tamaño--;
                    eliminado = true;
            }
            if(!eliminado)
                throw new IllegalArgumentException();
        }
        
        public int posicion(Punto punto){
            int contador = 0;
            while(contador<lista.lenght){
                if(lista[contador].equals(punto)){
                    return contador;
                else
                    contador++;
                }
            }
            throw new IllegalArgumentException();
        }

    public boolean contiene(Punto punto){
        try{
            return posicion(punto) < tamaño;
        }catch(Exception e){
            return false;
        }
    }
}
```
tamaño = 0
[][][][]...
lista[tamaño++] = punto;

tamaño != 0
[][][]...
lista[tam++] = punto

tamaño == lista.lenght;
    throw new OE();


