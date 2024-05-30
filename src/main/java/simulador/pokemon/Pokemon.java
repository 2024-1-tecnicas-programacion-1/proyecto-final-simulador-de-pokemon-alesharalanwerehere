package simulador.pokemon;

public abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected int puntosDeAtaque;
    protected TipoPokemon tipo;
    protected String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipo, oponente.getTipo());
        int daño = (int) (this.puntosDeAtaque * multiplicador);
        oponente.recibirDaño(daño);
    }
    
    // Complejidad temporal: O(1) Tiempo constante.
    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            this.estado = "Debilitado";
        }
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void entrenar() {
        this.puntosDeAtaque += 20;
        this.salud += 5;
    }
    
    // Complejidad temporal: O(1) Tiempo constante.
    public String getNombre() {
        return nombre;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public int getSalud() {
        return salud;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public TipoPokemon getTipo() {
        return tipo;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public String getEstado() {
        return estado;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
