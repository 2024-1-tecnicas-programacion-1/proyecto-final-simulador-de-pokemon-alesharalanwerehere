package simulador.pokemon;

public class Meowth extends Pokemon{

    public Meowth(String nombre, int salud, int puntosAtaque, String tipo, String estado) {
        super(nombre, salud, puntosAtaque, tipo, estado);
        this.nombre="Meowth";
        this.salud=40;
        this.puntosAtaque=45;
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