package PracticaExamen_1;

public abstract class Empleado{

    String nombre;
    double salario;
    int antiguedad;

    public double getSalario(){
        return salario;
    }

    public Empleado(String nombre, Double salario, int antiguedad){
        this.nombre=nombre;
        this.salario=salario;
        this.antiguedad=antiguedad;
    }

    public void calculaSalario(){
        if(antiguedad<1){
            salario=salario;
        }else if(1<antiguedad&&antiguedad<3){
            salario = salario*(1+(0.05*antiguedad));
        }else{
            salario = salario*(1+(0.1*antiguedad));
        }
    }

}