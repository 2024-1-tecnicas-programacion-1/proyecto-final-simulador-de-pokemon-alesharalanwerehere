package simulador.pokemon;


public class Bellsprout extends Pokemon{

    public Bellsprout(String nombre, int salud, int puntosAtaque, String tipo, String estado) {
        super(nombre, salud, puntosAtaque, tipo, estado);
        this.nombre="Bellsprout";
        this.salud=50;
        this.puntosAtaque=75;
    }

    @Override
    public Pokemon atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int recibirDaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pokemon entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}