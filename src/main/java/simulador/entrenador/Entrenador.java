class Entrenador {
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

    public Pokemon prepararBatalla() {
        if (pokemones.isEmpty()) {
            System.out.println(nombre + " no tiene pokemones para luchar.");
            return null;
        }
        mostrarPokemones();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige el índice del Pokémon para la batalla: ");
        int indice = scanner.nextInt();
        if (indice < 0 || indice >= pokemones.size()) {
            System.out.println("Índice no is válido.");
            return null;
        }
        return pokemones.get(indice);
    }
}

// Clase Batalla
class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Comienza la batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre());
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            pokemon1.atacar(pokemon2);
            if (pokemon2.getSalud() > 0) {
                pokemon2.atacar(pokemon1);
            }
        }
        if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon1.getNombre() + " ha sido debilitado. " + pokemon2.getNombre() + " gano");
        } else {
            System.out.println(pokemon2.getNombre() + " ha sido debilitado. " + pokemon1.getNombre() + " gano");
        }
    }
}
