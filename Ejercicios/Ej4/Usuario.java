package Ej4;

public class Usuario {
    private int maxUsuarios = 100;
    Usuario[] usuarios = new Usuario[maxUsuarios];
    private String nombre;
    private String contraseña;
    private int cantidadUsuarios;

    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        String cesareada="";
        char caracter;
        for(int i = 0; i <contraseña.length();i++){
            caracter = contraseña.charAt(i);
            caracter += 2;
            cesareada += caracter;
        }
        this.contraseña = cesareada;
        cantidadUsuarios = 0;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    /*
     * Metodo que comprueba que la contraseña solo tiene numeros y caracteres en mayuscula y minuscula
     */
    public boolean validaContraseña(String contraseña){
        Boolean buena=true;
        char caracter;
        for(int i =0;i<contraseña.length();i++){
            caracter = contraseña.charAt(i);
            if(!Character.isLetter(caracter)||!Character.isDigit(caracter))
                buena = false;
        }
        return buena;
    }
    /*
     * Metodo que cambia la contraseña
     */
    public void cambiaConstraseña(String nueva){
        String cesareada="";
        char caracter;
        for(int i = 0; i <nueva.length();i++){
            caracter = nueva.charAt(i);
            caracter += 2;
            cesareada += caracter;
        }
        setContraseña(cesareada);
    }

    /*
     * Metodo que comprueba si un usuario existe
     * true si exite false si no
     */
    public boolean existeUsuario(String usu){
        boolean existe= false;
        for(int i = 0;i<cantidadUsuarios; i++){
            if(usuarios[i].getNombre().equals(usu))
                existe = true;
        }
        return existe;

    }
    /*
     * Metodo que añade un usuario
     */
    public void añadeUsuario(String nom, String contr){
        if(cantidadUsuarios==maxUsuarios)
            throw new IndexOutOfBoundsException();
        if(!existeUsuario(nom)&&validaContraseña(contr)){
            usuarios[cantidadUsuarios] = new Usuario(nom,contr);
            cantidadUsuarios++;
        }
    }

    /*
     * Metodo que elimina un usuario
     */
    public void eliminaUsuario(Usuario usu){
        int dondeesta=0;
        if(existeUsuario(usu.getNombre())){
            for(int i = 0; i < cantidadUsuarios;i++){
                if(usuarios[i].equals(usu)){
                    dondeesta=i;
                    for(int j = dondeesta;i<cantidadUsuarios-1;j++){
                        usuarios[j]=usuarios[j+1];
                    }
                }
                cantidadUsuarios--;
            }
        }else{
            throw new IllegalArgumentException();
        }
    }



}
