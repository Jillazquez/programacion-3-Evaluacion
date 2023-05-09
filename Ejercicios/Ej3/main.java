package Ej3;

public class main {
    public static void main(String[] args) {
        int nombre,apellido,uno,dos,tres;
        Alumno[] clase = new Alumno[50];
        for(int i = 0; i< clase.length;i++){
            nombre = (int)(Math.random()*10);
            apellido = (int)(Math.random()*10);
            uno = (int)(Math.random()*100);
            dos = (int)(Math.random()*100);
            tres = (int)(Math.random()*100);
            clase[i] = new Alumno(nombre, apellido, uno, dos, tres,i);
        }
        /*
         * Ordenamos los alumnos por la media con el metodo de la burbuja
         */
        for(int i =0;i<clase.length-1;i++){
            for(int j = 0 ;j<clase.length-1;j++){
                if(clase[j].getMedia()>clase[j+1].getMedia()){
                    Alumno temp = clase[j];
                    clase[j] = clase[j+1];
                    clase[j+1] = temp;
                }
            }
        }
        /*
         * Ordenamos los alumnos por apellido y nombre con el metodo de la burbuja
         * He necesitado ayuda para el compareTo!!
         */
        for(int i =0;i<clase.length-1;i++){
            for(int j = 0 ;j<clase.length-1;j++){
                if(clase[j].compareTo(clase[j+1])>0){
                    Alumno temp = clase[j];
                    clase[j] = clase[j+1];
                    clase[j+1] = temp;
                }
            }
        }


        for(Alumno o : clase){
            System.out.println(o);
        }
    }
}
