package Ordenacion;

public class seleccion {
    public static void main(String[] args) {
       
        /*
         *Hay dos maneras implementadas para realizarlo la que esta sin comentar cambia la posicion del numero menor con el primer numero que comprobamos 
         *@jillazquez
         */
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
        /*
        La segunda manera consigue el numero menor y corre una posiciona a derecha a todos los numeros para dejar al menor en la primera posicion
        for(int i =0;i<e.length;i++){
            menor=e[i];
            posicion=i;
            for(int j=i;j<e.length;j++){
                if(menor>e[j]){
                    posicion=j;
                    menor=e[j];
                }
            }
                int num=0;
                System.out.println(menor+" "+posicion);

                while(posicion-num>0&&posicion-num>i){
                    e[posicion-num]=e[posicion-num-1];
                    num++;
                }
                e[i]=menor;
                for(int p =0;p<e.length;p++){
                    System.out.print(e[p]+" ");
                }
                System.out.println();
        }
        */
        for(int i =0;i<e.length;i++){
            System.out.print(e[i]+" ");
        }
    }
}
