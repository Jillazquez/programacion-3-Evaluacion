# Apuntes Ordenacion Programacion
## Metodo burbuja
Consta de ir cambiando los numeros y bloqueando el ultimo asegurandote que se ponen en orden Ejemplo:
[Ejercicio burbuja](burbuja.java)
```java
// Tengo este array
Integer[] e ={45,67,3,10,7,28};

// Usando estos bucles
    for(int i =0;i<e.length-1;i++){
        for(int j = 1;j<e.length-i;j++){
            if(e[j-1]>e[j]){
                ayuda=e[j-1];
                e[j-1]=e[j];
                e[j]=ayuda;
            }
        }
        for(int k =0;k<e.length;k++){
            System.out.print(e[k]+" ");
        }
        System.out.println();
    }
//Seguira este orden
3 67 45 10 7 28 
3 7 67 45 10 28 
3 7 10 67 45 28 
3 7 10 28 67 45 
3 7 10 28 45 67 
3 7 10 28 45 67 
```
## Metodo burbuja bidireccional o Cocktail Sort
Consta de lo mismo que el burbuja pero en ambas direcciones Ejemplo:
[Ejercicio burbuja](burbuja.java)
```java
//Añadimos la implementacion de que si no hay cambios el bucle se detenga
// Tengo este array
Integer[] e ={45,67,3,10,7,28};

// Usando estos bucles
    for(int i =0;i<e.length-1;i++){
        for(int j = 1;j<e.length-i;j++){
            if(e[j-1]>e[j]){
                ayuda=e[j-1];
                e[j-1]=e[j];
                e[j]=ayuda;
            }
        }
        for(int k =0;k<e.length;k++){
            System.out.print(e[k]+" ");
        }
        System.out.println();
    }
//Seguira este orden
3 67 45 10 7 28 
3 7 67 45 10 28 
3 7 10 67 45 28 
3 7 10 28 67 45 
3 7 10 28 45 67 
3 7 10 28 45 67 
```
# Metodo Inserción directa
Este metodo se compara con los adyacentes.
3 27 16 48 50 <br>
Cambio el 16 <-> 50 y el 48 <-> 50 <br>
en la primera pasada dejo fijo el 50 el ultimo <br>
3 27 16 48 50 <br>
En la segunda parada dejo fijo tambien el antepenultimo y asi hasta llegar al primero hasta lenght-1

# Metodo Selección directa
Este metodo consigue el numero menor del vector hace que todos los numeros a su izquierda corran una posicion para dejar en primera posicion al menor dejandolo fijado y empezando la proxima vez desde el numero siguiente [Ejercicio Seleccion Directa](seleccion.java)
```java
//Ejemplo de una de las implementaciones
Integer[] e = {16,24,15,5,6,72};
        int posicion=0;
        int menor=0;
        int aux=0;
        for(int i =0;i<e.length;i++){
            menor=e[i];
            posicion=i;
            for(int j=i;j<e.length;j++){
                if(menor>e[j]){
                    posicion=j;
                    menor=e[j];
                }
            }
           aux = e[i];
            e[i]=e[posicion];
            e[posicion]=aux;
        }
Seguiria este orden
16 24 15 5 6 72
5 16 24 15 6 72 
5 6 16 24 15 72 
5 6 15 16 24 72 
5 6 15 16 24 72 
5 6 15 16 24 72 
5 6 15 16 24 72 
```

# Metodo Shell
Shell: 6 10 3 54 1 27
N/2=3 a: 6 54 b: 10 1 c: 3 27
<br>
Los ordenas a: 6 54 b: 1 10 c: 3 27 Ahora ponemos en una lista primero los pequeños y despues los grandes<br>
Shell: 6 1 3 54 10 27
N/4 = 1 

[Ejercicio Shell](Shell.java)
