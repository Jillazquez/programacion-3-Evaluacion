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
  0  1  2  3
  16 24 73 8
  8 24 73 16
  
  8 3