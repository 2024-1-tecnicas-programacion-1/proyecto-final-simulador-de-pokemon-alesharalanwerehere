package simulador.batalla;

import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

public class Batalla {
    
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }
     
    // QUITE LOS PARAMETROS Pokemon pokemon1, Pokemon pokemon2
    
    public void iniciarBatalla() {

        System.out.println(pokemon1.getNombre()+" vs. "+pokemon2.getNombre());
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre());
            int daño = calcularDaño(pokemon1, pokemon2);
            
            pokemon2.recibirDaño(daño);
            System.out.println(pokemon2.getNombre() + " recibe " + daño + " puntos de daño, salud restante: " + pokemon2.getSalud());

            if (pokemon2.getSalud() > 0) {
                System.out.println(pokemon2.getNombre() + " ataca a " + pokemon1.getNombre());
                daño = calcularDaño(pokemon2, pokemon1);
                pokemon1.recibirDaño(daño);
                System.out.println(pokemon1.getNombre() + " recibe " + daño + " puntos de daño, salud restante: " + pokemon1.getSalud());
            }
        }
        
        if (pokemon1.getSalud() > 0) {
            System.out.println(pokemon1.getNombre() + " gana la batalla!");
        } else if (pokemon2.getSalud() > 0) {
            System.out.println(pokemon2.getNombre() + " gana la batalla!");
        } else {
            System.out.println("La batalla termina en empate!");
        }
    }
     
    private int calcularDaño(Pokemon atacante, Pokemon defensor) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(atacante.getTipo(), defensor.getTipo());
        int dañoBase = atacante.getPuntosDeAtaque();
        return (int) (dañoBase * multiplicador);
    }
    //AGREGAR CALCULAR DAÑO AL UML
}