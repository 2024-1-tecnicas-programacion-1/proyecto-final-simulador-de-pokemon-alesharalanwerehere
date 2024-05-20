package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosAtaque;
    private String tipo;
    private String estado;
    
    public Pokemon(String nombre,int salud, int puntosAtaque,String tipo, String estado){
        this.nombre=nombre;
        this.salud=salud;
        this.puntosAtaque=puntosAtaque;
        this.tipo=tipo;
        this.estado=estado;
        
    }
    
    public abstract Pokemon atacar();
    //no estoy segura del tipo de dato que esta recibiendo
    
    public abstract int recibirDaño();
    
    public abstract Pokemon entrenar();
    //no estoy segura del tipo de dato que esta recibiendo

}
