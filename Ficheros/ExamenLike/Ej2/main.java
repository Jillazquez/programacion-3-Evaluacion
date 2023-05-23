package Ficheros.ExamenLike.Ej2;

import java.util.*;
import java.io.*;

public class main {
    static ArrayList<viajante> viajantes = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream archivoEntrada = null;
        ObjectInputStream objetoEntrada = null;
        try{
            archivoEntrada = new FileInputStream("datos_viajantes.dat");
            objetoEntrada = new ObjectInputStream(archivoEntrada);

            viajantes = (ArrayList<viajante>) objetoEntrada.readObject();
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

        int numero;
        boolean menu = true;
        Scanner teclado = new Scanner(System.in);

        while(menu){
            System.out.println("MENU DE VIAJE");
            System.out.println("1. Añadir un viajante");
            System.out.println("2. Eliminar un viajante");
            System.out.println("3. Mostrar un listado de todos los viajantes, indicando la distancia recorrida y el importe acumulado de las ventas cobradas");
            System.out.println("4. Inicializar ventas: la distancia recorrida de todos los viajantes pasará a ser cero y las ventas cobradas de todos ellos se almacenarán en el histórico, eliminándolas (del programa)");
            System.out.println("5. Incrementar la distancia recorrida por un viajante");
            System.out.println("6. Añadir una venta de un viajante");
            System.out.println("7. Cobrar una venta de un viajante");
            System.out.println("8. Mostrar un listado de todas las ventas no cobradas de un viajante");
            System.out.println("9. Terminar el programa");
            numero = teclado.nextInt();
            teclado.nextLine();
            switch(numero){
                case 1:
                añadoViajante(teclado);
                break;
                case 2:
                eliminoViajante(teclado);
                break;
                case 3:
                mostrarViajantes(teclado);
                break;
                case 4:
                iniciarVentas(teclado);
                break;
                case 5:
                sumarKilometros(teclado);
                break;
                case 6:
                añadirVenta(teclado);
                break;
                case 7:
                
                break;
                case 8:
                mostrarViajantes(teclado);
                break;
                case 9:
                menu = false;
                break;
            }
        }
        FileOutputStream archivoSalida = null;
        ObjectOutputStream objetoSalida = null;

        try{
            archivoSalida = new FileOutputStream("datos_viajantes.dat");
            objetoSalida = new ObjectOutputStream(archivoSalida);
            
            objetoSalida.writeObject(viajantes);
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
    

    public static void iniciarVentas(Scanner teclado) throws IOException{
        FileWriter archivosalida = null;
        try{
            archivosalida = new FileWriter("historial_ventas.txt");
            for(viajante v : viajantes){
                v.setDistanciaRecorrida(0);
                for(venta f : v.getVentas()){
                    if(f.getCobrada()){
                        archivosalida.write(f.toString());
                        archivosalida.write("\n");
                    }
                }
                for(int i = 0;i < v.getVentas().size();i++){
                    if(v.getVentas().get(i).getCobrada()){
                        v.getVentas().remove(i);
                        i--;
                    }
                }
            }
        }finally{
            if(archivosalida!=null){
                archivosalida.close();
            }
        }
    }
    public static void añadirVenta(Scanner teclado){
        System.out.println("Fecha de la venta");
        String fecha = teclado.nextLine();
        System.out.println("Importe de la venta");
        int importe = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Cliente de la venta");
        String cliente = teclado.nextLine();
        System.out.println("Esta pagada? TRUE o FALSE");
        boolean pagada = teclado.nextBoolean();
        teclado.nextLine();
        System.out.println("DNI del viajante al que quieres añadir la venta");
        String dni = teclado.nextLine();
        venta v = new venta(fecha, importe, cliente, pagada);
        for(viajante f : viajantes){
            if(f.getDNI().equals(dni)){
                f.getVentas().add(v);
                return;
            }
        }
        throw new IllegalArgumentException("El DNI no coincide con ningun viajante");
    }
    public static void mostratVentasNoPagadas(Scanner teclado){
        System.out.println("DNI del viajante");
        String dni = teclado.nextLine();
        System.out.println("Nombre del viajante");
        String nombre = teclado.nextLine();
        System.out.println("Antiguedad del viajante");
        int antiguedad = teclado.nextInt();
        System.out.println("Distancia recorrida");
        int distancia = teclado.nextInt();
        viajante v = new viajante(dni, nombre, antiguedad, distancia);
        for(viajante f : viajantes){
            if(viajantes.contains(v)){
                for(venta g : v.getVentas()){
                    if(!g.getCobrada()){
                        System.out.println(g);
                    }
                }
            }
        }
    }
    public static void añadoViajante(Scanner teclado){
        System.out.println("DNI del viajante");
        String dni = teclado.nextLine();
        System.out.println("Nombre del viajante");
        String nombre = teclado.nextLine();
        System.out.println("Antiguedad del viajante");
        int antiguedad = teclado.nextInt();
        System.out.println("Distancia recorrida");
        int distancia = teclado.nextInt();
        viajante v = new viajante(dni, nombre, antiguedad, distancia);
        viajantes.add(v);
    }
    public static void eliminoViajante(Scanner teclado){
        System.out.println("DNI del viajante");
        String dni = teclado.nextLine();
        System.out.println("Nombre del viajante");
        String nombre = teclado.nextLine();
        System.out.println("Antiguedad del viajante");
        int antiguedad = teclado.nextInt();
        System.out.println("Distancia recorrida");
        int distancia = teclado.nextInt();
        viajante v = new viajante(dni, nombre, antiguedad, distancia);
        for(viajante f : viajantes){
            if(viajantes.contains(v)){
                viajantes.remove(v);
                return;
            }
        }
    }
    public static void mostrarViajantes(Scanner teclado){
        int dinero=0;
        for(viajante v : viajantes){
            System.out.println("Distancia recorrida total "+v.getDistanciaRecorrida());
            for(venta f : v.getVentas()){
                dinero+=f.getImporte();
            }
            System.out.println("Importe total de las ventas "+dinero);
            dinero = 0;
        }
    }
    public static void sumarKilometros(Scanner teclado){
        System.out.println("Cuantos kilometros quieres añadir");
        int km = teclado.nextInt();
        System.out.println("DNI del viajante");
        String dni = teclado.nextLine();
        System.out.println("Nombre del viajante");
        String nombre = teclado.nextLine();
        System.out.println("Antiguedad del viajante");
        int antiguedad = teclado.nextInt();
        System.out.println("Distancia recorrida");
        int distancia = teclado.nextInt();
        viajante v = new viajante(dni, nombre, antiguedad, distancia);
        for(viajante f : viajantes){
            if(f.getDNI()==v.getDNI()){
                f.setDistanciaRecorrida(distancia+f.getDistanciaRecorrida());
            }
        }
    }
}
