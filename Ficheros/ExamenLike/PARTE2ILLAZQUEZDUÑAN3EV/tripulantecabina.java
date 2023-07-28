package Ficheros.ExamenLike.PARTE2ILLAZQUEZDUÑAN3EV;

import java.io.Serializable;

public class tripulantecabina extends tripulante implements Serializable{
    private boolean esSobrecargo;

    public tripulantecabina(String nombre, String dni) {
        super(nombre, dni);
    }

    public boolean getEsSobrecargo(){
        return esSobrecargo;
    }
    public void setEsSobrecargo(boolean esSobrecargo) {
        this.esSobrecargo = esSobrecargo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tripulante Cabina" + getNombre() + " con DNI " + getDNI()+", es sobrecargo "+esSobrecargo;
    }
}
