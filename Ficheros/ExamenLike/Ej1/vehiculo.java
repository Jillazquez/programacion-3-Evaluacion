package Ficheros.ExamenLike.Ej1;

import java.io.Serializable;
import java.util.*;

public class vehiculo implements Serializable{
    private String matricula;
    private String marca;
    private String modelo;
    private String propietario;
    private int matriculacion;
    private ArrayList<sancion> sanciones = new ArrayList<>();

    public vehiculo(String matricula,String marca,String modelo,String propietario,int matriculacion){
        boolean num=false;
        boolean car = false;
        if(matricula.length()!= 7){
            throw new IllegalArgumentException("La matricula tener una longitud de 7");
        }else{
            matricula.toLowerCase();
            for(int i = 0;i<4;i++){
                if(!Character.isDigit(matricula.charAt(i))){
                    num = true;
                }
            }
            if(num){
                throw new IllegalArgumentException("Los cuatro primeros caracteres tienen que ser numeros");
            }else{
                for(int i = 4;i < 7; i++){
                    if(!Character.isAlphabetic(matricula.charAt(i))){
                        car = true;
                    }
                    if(matricula.charAt(i)=='a'||matricula.charAt(i)=='e'||matricula.charAt(i)=='i'||matricula.charAt(i)=='o'||matricula.charAt(i)=='u'||matricula.charAt(i)=='q'||matricula.charAt(i)=='ñ'){
                        car = true;
                    }
                }
                if(car){
                    throw new IllegalArgumentException("Los ultimos tres caracteres tienen que ser letras consonantes sin q o ñ");
                }else{
                    this.matricula = matricula;
                }

            }
        }
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.matriculacion = matriculacion;
    }
    public String getMarca() {
        return marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getMatriculacion() {
        return matriculacion;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPropietario() {
        return propietario;
    }
    public ArrayList<sancion> getSanciones() {
        return sanciones;
    }
    public void añadoSancion(sancion multa){
        sanciones.add(multa);
    }

}
