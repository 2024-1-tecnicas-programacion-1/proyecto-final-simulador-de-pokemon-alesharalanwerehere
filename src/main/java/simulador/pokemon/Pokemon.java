import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Pokemon
abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected int puntosDeAtaque;
    protected TipoPokemon tipo;
    protected String estado = "Normal";

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipo, oponente.getTipo());
        int daño = (int) (this.puntosDeAtaque * multiplicador);
        oponente.recibirDaño(daño);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            this.estado = "Debilitado";
        }
    }

    public void entrenar() {
        this.puntosDeAtaque += 5;
        this.salud += 5;
        System.out.println(this.nombre + " ha sido entrenado. Ahora tu Salud: " + this.salud + ", Ataque: " + this.puntosDeAtaque);
    }

    @Override
    public String toString() {
        return nombre + " [Salud: " + salud + ", Ataque: " + puntosDeAtaque + ", Tipo: " + tipo + ", Estado: " + estado + "]";
    }
}
