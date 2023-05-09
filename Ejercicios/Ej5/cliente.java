package Ej5;

public class cliente {
    private int id;
    private int tiempo;

    public cliente(){
        int nodo = (int)(Math.random()*100);
        if(nodo<=60)
            tiempo = 15;
        if(nodo>60&&nodo<=85)
            tiempo = 20;
        if(nodo>85)
            tiempo = 30;
    }

    public int getId() {
        return id;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String toString(){
        return "cliente "+tiempo;
    }

}
