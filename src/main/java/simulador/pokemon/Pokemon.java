package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosAtaque;
    private String tipo;
    private String estado;
    
    public Pokemon(String nombre,int salud, int puntosAtaque,String tipo, String estado){
        this.nombre=nombre;
    }
}
