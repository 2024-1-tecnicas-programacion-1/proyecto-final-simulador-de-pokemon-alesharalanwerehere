package simulador.pokemon;

public class Ponyta extends Pokemon {

    public Ponyta(String nombre, int salud, int puntosAtaque, String tipo, String estado) {
        super(nombre, salud, puntosAtaque, tipo, estado);
        this.nombre = "Ponyta";
        this.salud = 50;
        this.puntosAtaque = 85;
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
