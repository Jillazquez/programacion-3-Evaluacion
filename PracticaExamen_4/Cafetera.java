package PracticaExamen_4;

public class Cafetera extends Electrodomestico{

    int serviciosHechos;

    public Cafetera(int peso) {
        super(peso);
        int color = 0xFFFFFF;
        this.serviciosHechos=1;
    }
    @Override
    public int diasTranscurridos(int dias) {
        return super.diasTranscurridos(dias);
    }
        public int serviciosHechos(int servicios){
            return servicios;
        }

        @Override
        public boolean debeRevisarse() {
            return serviciosHechos>200; 
        }


        @Override
        public void pasarRevision() {
            serviciosHechos=serviciosHechos-200;
        }
    }
