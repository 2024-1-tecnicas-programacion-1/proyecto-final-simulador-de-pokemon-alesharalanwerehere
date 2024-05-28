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

    public String getNombre() {
        return nombre;
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon);
    }

    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    public void mostrarPokemones() {
        System.out.println("Pokemones de " + nombre + ":");
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon);
        }
    }

    public Pokemon prepararBatalla(int indicePokemon) {
        if (pokemones.isEmpty()) {
            System.out.println("El entrenador " +nombre + " no tiene pokemones para luchar.");
            return null;
        }
        
        if (indicePokemon < 1 || indicePokemon > pokemones.size()) {
            System.out.println("¡Índice de Pokémon inválido! Debes seleccionar un número de Pokémon válido.");
            return null;
        }

        return pokemones.get(indicePokemon - 1);
    }
}