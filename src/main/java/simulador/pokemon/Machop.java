
package principal;


public class Machop extends Pokemon{

    public Machop(String nombre, int salud, int puntosAtaque, String tipo, String estado) {
        super(nombre, salud, puntosAtaque, tipo, estado);
        this.nombre="Machop";
        this.salud=70;
        this.puntosAtaque=80;
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
