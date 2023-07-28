package Ficheros.ExamenLike.PARTE2ILLAZQUEZDUÑAN3EV;

import java.util.*;
import java.io.*;
/*
 * @author Juan Manuel Illazquez Duñan
 * @Fecha 24-5-2023
 */

public class main {
    static final String NOMBREFICHERO = "datos.dat";
    static ArrayList<avion> portaviones = new ArrayList<>();
    static ArrayList<tripulante> tripulan = new ArrayList<>();

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        cargarDatos();
        Scanner teclado = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        while (menu) {
            menu();
            opcion = teclado.nextInt();
            teclado.nextLine();// Para que no de problemas con los demas scanner
            switch (opcion) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    añadirAvion(teclado);
                    guardarDatos();
                    break;
                case 2:
                    eliminarAvion(teclado);
                    guardarDatos();
                    break;
                case 3:
                    listarAvionesOrdenAlfabetico();
                    break;
                case 4:
                    listarAvionesPorCapacidad();
                    break;
                case 5:
                    añadirTripulante(teclado);
                    guardarDatos();
                    break;
                case 6:
                    listarTripulantesOrdenAlfabetico();
                    break;
                case 7:
                    asignarTripulante(teclado);
                    guardarDatos();
                    break;
                case 8:
                    mostrarAvion(teclado);
                    break;
                case 9:
                    asignarEmpleo();
                    guardarDatos();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
    }

    private static void asignarEmpleo() {
        for (tripulante t : tripulan) {
            if (!t.getEmpleado()) {
                t.setEmpleado(true);
                if (t instanceof tripulantetecnico) {
                    int num = (int) (Math.random() * 1000);
                    ((tripulantetecnico) t).setHorasVuelo(num);
                }
                if (t instanceof tripulantecabina) {
                    boolean sobrecargo;
                    int num = (int) (Math.random());
                    if (num == 0)
                        sobrecargo = true;
                    else
                        sobrecargo = false;
                    ((tripulantecabina) t).setEsSobrecargo(sobrecargo);
                }
            }
        }
    }

    private static void guardarDatos() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(NOMBREFICHERO))) {
            outputStream.writeObject(portaviones);
            outputStream.writeObject(tripulan); // Agrega esta línea para guardar los tripulantes
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo.");
        }
    }

    public static void cargarDatos() throws IOException, ClassNotFoundException {
        FileInputStream archivoEntrada = null;
        ObjectInputStream objetoEntrada = null;

        try {
            archivoEntrada = new FileInputStream(NOMBREFICHERO);
            objetoEntrada = new ObjectInputStream(archivoEntrada);

            portaviones = (ArrayList<avion>) objetoEntrada.readObject();
            tripulan = (ArrayList<tripulante>) objetoEntrada.readObject();
            System.out.println("Se han leido los datos de los aviones y tripulantes");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado se creara al terminar la ejecucion de este programa");
        } finally {
            if (archivoEntrada != null) {
                archivoEntrada.close();
            }
            if (objetoEntrada != null) {
                objetoEntrada.close();
            }
        }
    }

    public static void añadirTripulante(Scanner teclado) {
        int num;
        boolean repetido = false;
        tripulante t = null;
        System.out.println("Nombre del tripulante");
        String nombreTripulante = teclado.nextLine();
        System.out.println("Numero del dni sin letra");
        String dniTripulante = teclado.nextLine();
        num = (int) (Math.random());
        try {
            if (num == 0) {
                t = new tripulantecabina(nombreTripulante, dniTripulante);
            } else {
                t = new tripulantetecnico(nombreTripulante, dniTripulante);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("El DNI introducido no es valido");
        }
        for (tripulante te : tripulan) {
            if (te.getDNI().equals(t.getDNI())) {
                repetido = true;
            }
        }
        if (repetido) {
            System.out.println("Error DNI repetido verifica los datos que has introducido");
        } else {
            tripulan.add(t);
        }
    }

    /*
     * Metodo que asigna un tripulante a un avion
     */
    public static void asignarTripulante(Scanner teclado) {
        tripulante aux = null;
        System.out.println("DNI del tripulante que quieres implementar");
        String DNItripulante = teclado.nextLine();
        System.out.println("Nombre del avion donde quieres asignarlo");
        String nombreAvion = teclado.nextLine();
        for (tripulante t : tripulan) {
            if (t.getDNI().equals(DNItripulante)) {
                aux = t;
            }
        }
        for (avion a : portaviones) {
            if (a.getNombre().equals(nombreAvion)) {
                a.getTripulantes().add(aux);
                System.out.println("Tripulante añadido");
            }
        }
    }

    /*
     * Metodo que con el nombre del avion muestra toda la informacion del avion y de
     * su tripulacion
     */
    public static void mostrarAvion(Scanner teclado) {
        avion aux = null;
        System.out.println("Nombre del avion a mostrar");
        String nombreavion = teclado.nextLine();
        for (avion a : portaviones) {
            if (a.getNombre().equals(nombreavion)) {
                aux = a;
            }
        }
        if (aux == null) {
            System.out.println("Ese nombre de avion no consta en los archivos");
        } else {
            System.out.println("Nombre del avion " + aux.getNombre() + " capacidad del avion " + aux.getCapacidad());
            for (tripulante t : aux.getTripulantes()) {
                System.out.println(t);
            }
        }
    }

    /*
     * Metodo que muestra los aviones ordenados por la capacidad de cada uno
     */
    public static void listarAvionesPorCapacidad() {
        Collections.sort(portaviones, Comparator.comparingInt(avion::getCapacidad));

        System.out.println("Aviones por número de plazas:");
        for (avion avion : portaviones) {
            System.out.println(avion.getNombre() + " - " + avion.getCapacidad() + " pasajeros");
        }
    }

    /*
     * Metodo que muestra los tripulantes ordenados por orden alfabetico
     */
    public static void listarTripulantesOrdenAlfabetico() {
        if (tripulan.isEmpty()) {
            System.out.println("No hay tripulantes.");
        } else {
            Collections.sort(tripulan, Comparator.comparing(tripulante::getNombre));
            System.out.println("Triuplantes en orden alfabético:");
            for (tripulante t : tripulan) {
                System.out.print(t.getNombre() + "," + t.getDNI());

                if (t instanceof tripulantecabina) {
                    tripulantecabina tripulanteCabina = (tripulantecabina) t;
                    System.out.print(" Tipo: Tripulante de Cabina");
                    System.out.println(" Sobrecargo: " + (tripulanteCabina.getEsSobrecargo() ? "Sí" : "No"));
                } else if (t instanceof tripulantetecnico) {
                    tripulantetecnico tripulanteTecnico = (tripulantetecnico) t;
                    System.out.print(" Tipo : Tripulante Tecnico");
                    System.out.println("Horas de vuelo " + tripulanteTecnico.getHorasVuelo());
                }
            }
        }
    }

    /*
     * Metodo que muestra los aviones ordenados por orden alfabetico
     */
    public static void listarAvionesOrdenAlfabetico() {
        if (portaviones.isEmpty()) {
            System.out.println("No hay aviones registrados.");
        } else {
            Collections.sort(portaviones, Comparator.comparing(avion::getNombre));
            System.out.println("Aviones en orden alfabético:");
            for (avion avion : portaviones) {
                System.out.println(avion.getNombre());
            }
        }
    }

    /*
     * Metodo que elimina el avion especificado si se encuentra
     * throw IllealArgumentException si el nombre no se encuentra
     */
    public static void eliminarAvion(Scanner teclado) {
        avion aux = null;
        System.out.println("Introduce el nombre del avion a borrar");
        String nombre = teclado.nextLine();
        for (avion a : portaviones) {
            if (a.getNombre().equals(nombre)) {
                aux = a;
            }
        }
        if (aux != null) {
            portaviones.remove(aux);
        } else {
            throw new IllegalArgumentException("Nombre no encontrado");
        }
    }

    /*
     * Metodo que añade un avion indicando su nombre y numero de pasajeros
     * throw IlleaglArgumentException si el nombre no esta repetido o si los datos
     * de
     * capacidad no son correctos
     */
    public static void añadirAvion(Scanner teclado) {
        boolean repetido = false;
        System.out.println("Introduce el nombre del avion");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el numero de pasajeros");
        int numpasajeros = teclado.nextInt();// El numero de tripulantes se verifica en la clase tripulante
        teclado.nextLine();
        for (avion a : portaviones) {
            if (a.getNombre().equals(nombre)) {
                repetido = true;
            }
        }
        if (repetido) {
            throw new IllegalArgumentException("Nombre Repetido");
        } else {
            avion av = new avion(nombre, numpasajeros);
            portaviones.add(av);
        }
    }

    /*
     * Metodo para mostrar todas las opciones del menu
     */
    public static void menu() {
        System.out.println("Seleccion de opcion");
        System.out.println("1. Para añadir avion");
        System.out.println("2. Para borrar avion");
        System.out.println("3. Para listar en orden alfabetico los aviones");
        System.out.println("4. Listar por numero de plazas");
        System.out.println("5. Añadir un tripulante");
        System.out.println("6. Listar en orden alfabetico los tripulantes ");
        System.out.println("7. Asignar un tripulante");
        System.out.println("8. Mostrar avion");
        System.out.println("9. Asignar empleo");
        System.out.println("0. Salir");

    }
}
