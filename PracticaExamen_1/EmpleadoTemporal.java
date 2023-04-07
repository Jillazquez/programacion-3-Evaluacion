package PracticaExamen_1;

public class EmpleadoTemporal extends Empleado{

    String fechaini;
    String fechafin;

    public double getSalario(){
        return salario;
    }
    
    public EmpleadoTemporal(String nombre, Double salario, int antiguedad, String fechaini, String fechafin) {
        super(nombre, salario, antiguedad);
        this.fechaini=fechaini;
        this.fechafin=fechafin;
    }

    @Override
    public void calculaSalario(){
        salario=salario;
    }

}