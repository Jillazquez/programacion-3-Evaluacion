package Ordenacion;
public class insercion {

    public static void insercion(Integer[] e){
        int i =0;
        int aux=0;
    for(int j =1;j<e.length;j++){
        i=j;
        aux=e[i];
        while(i>0&&aux<e[i-1]){
            e[i]=e[i-1];
            i--;
        }
        e[i]=aux;
}
}
    public static void main(String[] args) {
        //Metodo de insercion directa
        Integer[] e = {16,24,73,5,8};
        insercion(e);
        /*
        for(int i =0;i<e.length;i++){
            for(int j=0;j<e.length-1;j++){
                if(e[j]>e[j+1]){
                    aux=e[j];
                    e[j]=e[j+1];
                    e[j+1]=aux;
                }
            }
        }
        */
        /*
        for(int i =1;i<e.length;i++){
            for(int j=i;j>0;j--){
                if(e[j]<e[j-1]){
                    aux=e[j];
                    e[j]=e[j-1];
                    e[j-1]=aux;
                }
            }
        }
        */
        /*
        int i =0;
        for(int j =1;j<e.length;j++){
            i=j;
            aux=e[i];
            while(i>0&&e[i]<e[i-1]){
                e[i]=e[i-1];
                e[i-1]=aux;
                i--;
            }
    }Integer[] e = {16,24,73,5,8};
    Integer[] e = {5,16,24,73,8};
        */

        for(int h =0;h<e.length;h++){
            System.out.print(e[h]+" ");
        }



    }
}
