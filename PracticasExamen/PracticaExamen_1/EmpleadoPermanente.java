package PracticaExamen_1;

public class EmpleadoPermanente extends Empleado{

    String categoria;

    public double getSalario(){
        return salario;
    }

    public EmpleadoPermanente(String nombre, Double salario, int antiguedad, String categoria) {
        super(nombre, salario, antiguedad);
        this.categoria=categoria;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculaSalario(){
        if(categoria.equals("junior")){
            salario=salario*0.95;
        }else if(antiguedad<1){
            salario=salario;
        }else if(1<antiguedad&&antiguedad<3){
            salario = salario*(1+(0.05*antiguedad));
        }else{
            salario = salario*(1+(0.1*antiguedad));
        }
    }
    
}
