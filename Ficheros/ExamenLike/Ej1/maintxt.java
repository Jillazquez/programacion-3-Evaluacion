package Ficheros.ExamenLike.Ej1;

import java.io.*;
import java.util.*;

public class maintxt {

    static ArrayList<vehiculo> coches = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner teclado = new Scanner(System.in);
        
        boolean menu = true;
        int opcion;
        String matricula,propietario,marca,modelo,fecha,motivo;
        int anio,importe,sancion;

        FileInputStream archivoEntrada = null;
        ObjectInputStream objetoEntrada = null;

        try{
            archivoEntrada = new FileInputStream("datos_vehiculos.txt");
            objetoEntrada = new ObjectInputStream(archivoEntrada);

            coches = (ArrayList<vehiculo>) objetoEntrada.readObject();
            System.out.println("Se han leido los datos de los vehiculos");
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado se creara al terminar la ejecucion de este programa");
        }finally{
            if(archivoEntrada != null){
                archivoEntrada.close();
            }
            if(objetoEntrada != null){
                objetoEntrada.close();
            }
        }
        while(menu){
            System.out.println("///Menu de vehiculos///");
            System.out.println("1 Para añadir un coche");
            System.out.println("2 Eliminar un coche");
            System.out.println("3 Añadir una sancion a un vehiculo");
            System.out.println("4 Consultar sanciones de un vehiculo");
            System.out.println("5 Mostrar listado de vehiculos con mas de X sanciones");
            System.out.println("6 Eliminar sancion de un vehiculo");
            System.out.println("7 Terminar el programa");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                try{
                System.out.println("Matricula del vehiculo");
                matricula = teclado.nextLine();
                System.out.println("Nombre del propietario");
                propietario = teclado.nextLine();
                System.out.println("Marca del vehiculo");
                marca = teclado.nextLine();
                System.out.println("Modelo del vehiculo");
                modelo = teclado.nextLine();
                System.out.println("Año de matriculacion");
                anio = teclado.nextInt();
                vehiculo añado = new vehiculo(matricula,marca,modelo,propietario,anio);
                añadirCoche(añado);
                }catch(IllegalArgumentException e){
                }
                break;
                case 2:
                System.out.println("Matricula del vehiculo");
                matricula = teclado.nextLine();
                System.out.println("Nombre del propietario");
                propietario = teclado.nextLine();
                System.out.println("Marca del vehiculo");
                marca = teclado.nextLine();
                System.out.println("Modelo del vehiculo");
                modelo = teclado.nextLine();
                System.out.println("Año de matriculacion");
                anio = teclado.nextInt();
                vehiculo elimino = new vehiculo(matricula,marca,modelo,propietario,anio);
                eliminarCoche(elimino);
                break;
                case 3:
                System.out.println("Que vehiculo quieres consultar modelo");
                modelo = teclado.nextLine();
                for(vehiculo v : coches){
                    if(v.getModelo().equals(modelo)){
                        System.out.println("Fecha de la sancion");
                        fecha = teclado.nextLine();
                        System.out.println("Motivo de la sancion");
                        motivo = teclado.nextLine();
                        System.out.println("Cantidad de la sancion");
                        importe = teclado.nextInt();
                        sancion san = new sancion(fecha, motivo, importe);
                        v.añadoSancion(san);
                        break;
                    }
                }
                break;
                case 4:
                System.out.println("De que vehiculo quieres consultar las sanciones");
                modelo = teclado.nextLine();
                for(vehiculo v : coches){
                    if(v.getModelo().equals(modelo)){
                        for(sancion s : v.getSanciones()){
                            System.out.println(s);
                        }
                    }
                }
                break;
                case 5:
                System.out.println("A partir de cuantas sanciones quieres buscar?");
                sancion = teclado.nextInt();
                for(vehiculo v : coches){
                    if(v.getSanciones().size()>sancion){
                        System.out.println("El coche "+v.getModelo()+" tiene estas sanciones");
                        for(sancion s : v.getSanciones()){
                            System.out.println(s);
                        }
                    }
                }
                break;
                case 6:
                break;
                case 7:
                menu = false;
                break;
            }

           

        }
        FileReader archivoSalida = null;
        FileWriter objetoSalida = null;

        try{
            archivoSalida = new FileReader("datos_vehiculos.txt");
            objetoSalida = new FileWriter();
            for(vehiculo v : coches){
                objetoSalida.write(v.getMatriculacion()+", ");
                objetoSalida.write(v.getMarca()+", ");
                objetoSalida.write(v.getMatriculacion());
                objetoSalida.write(v.getMatriculacion());
            }
            objetoSalida.writeObject(coches);
            System.out.println("Los datos de los vehiculos ha sido almacenado");
        }finally{
            if(archivoSalida != null){
                archivoSalida.close();
            }
            if(objetoSalida != null){
                objetoSalida.close();
            }
        }
    }
    public static void añadirCoche(vehiculo coche){
        coches.add(coche);
    }
    public static void eliminarCoche(vehiculo coche){
        if(coches.contains(coche)){
            if(coche.getSanciones().isEmpty()){
                System.out.println("No se puede eliminar el coche ya que tiene sanciones");
            }else{
                System.out.println("Coche eliminado");
                coches.remove(coche);
            }
            
        }
    }
}
