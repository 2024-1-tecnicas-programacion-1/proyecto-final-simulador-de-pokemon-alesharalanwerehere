package simulador.pokemon;

public class Doduo extends Pokemon{

    public Doduo(String nombre, int salud, int puntosAtaque, String tipo, String estado) {
        super(nombre, salud, puntosAtaque, tipo, estado);
        this.nombre="Doduo";
        this.salud=35;
        this.puntosAtaque=85;
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
