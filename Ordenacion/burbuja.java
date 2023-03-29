package Ordenacion;
public class burbuja {

    public void ordenar(Integer[] e){
        int ayuda=0;
        for(int i =0;i<e.length;i++){
            for(int j = i+1;j<e.length;j++){
                if(e[i]>e[j]){
                    ayuda=e[i];
                    e[i]=e[j];
                    e[j]=ayuda;
                }
            }
            for(int k =0;k<e.length;k++){
                System.out.print(e[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ayuda=0;
        Integer[] e ={45,67,3,10,7,28};
        for(int i =0;i<e.length-1;i++){
            for(int j = i+1;j<e.length;j++){
                if(e[i]>e[j]){
                    ayuda=e[i];
                    e[i]=e[j];
                    e[j]=ayuda;
                }
            }
            for(int k =0;k<e.length;k++){
                System.out.print(e[k]+" ");
            }
            System.out.println();
        }

        
    }
}
