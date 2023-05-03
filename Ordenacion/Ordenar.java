package Ordenacion;

public abstract class Ordenar implements Ordenable{
	protected Integer[] v = {43,1,42,56,10,6,23,76,3,5};

	public  void ordenar(Comparable[] c){
		v =c.clone();
	}

	public void copiar(){
		
	}

}
