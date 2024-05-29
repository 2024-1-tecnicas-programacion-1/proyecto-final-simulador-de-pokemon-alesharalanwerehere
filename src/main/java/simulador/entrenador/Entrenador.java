package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.*;

public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon);
    }

    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    public void mostrarPokemones() {
        System.out.println("Pokemones de " + nombre + ":");
        int iteracion = 1;
        for (Pokemon pokemon : pokemones) {
            System.out.println(iteracion + ". " + pokemon.getNombre() + ", Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosDeAtaque());
            iteracion++;
        }
    }

    
    public Pokemon seleccionarPokemon(int indice) {
        if (indice >= 0 && indice < pokemones.size()) {
            return pokemones.get(indice);
        } else {
            System.out.println("Índice inválido. Por favor elija un índice correcto.");
            return null;
        }
    }

    public Pokemon prepararBatalla(int indicePokemon){
        if (pokemones.isEmpty()) {
            System.out.println("El entrenador " + nombre + " no tiene Pokémon para la batalla.");
            return null;
        }

        if (indicePokemon < 1 || indicePokemon > pokemones.size()) {
            System.out.println("¡Índice de Pokémon inválido! Debes seleccionar un número de Pokémon válido.");
            return null;
        }

        return pokemones.get(indicePokemon - 1);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }
}
