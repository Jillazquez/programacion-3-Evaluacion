package PracticaExamen_1;

public class main {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoTemporal("Juan", 1000.0, 2, "1-1-2020", "1-1-2022");
        Empleado e2 = new EmpleadoPermanente("Jose", 1000.0, 3, "Senior");
        e2.calculaSalario();
        e1.calculaSalario();
        System.out.println(e1.getSalario());
        System.out.println(e2.getSalario());
    }
}
