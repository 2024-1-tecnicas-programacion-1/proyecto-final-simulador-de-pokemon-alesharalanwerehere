package simulador;

import simulador.pokemones.Ponyta; 
import simulador.pokemones.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;

public class Principal {
    
    private static List<Entrenador> entrenadores = new ArrayList<>();
    private static List<Pokemon> pokemones = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        int opcion;
        do {
            menuPrincipal();
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("Adiós");
                    System.out.println(".....");
                    System.out.println("...");
                    System.out.println(".");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void menuPrincipal(){
        System.out.println("\n╔═══════════════════════════════════════════════╗");
        System.out.println("║        Simulador de Batallas Pokémon     ║");
        System.out.println("╠═══════════════════════════════════════════════╣");
        System.out.println("║ 1. Gestionar Entrenadores                ║");
        System.out.println("║ 2. Gestionar Pokémones                   ║");
        System.out.println("║ 3. Iniciar Batalla                       ║");
        System.out.println("║ 4. Salir                                 ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.print("Elige una opción: ");
    } //🆗

    private static void gestionarEntrenadores(){
        int opcion;
        do {
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("║        Gestionar Entrenadores       ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Registrar nuevo entrenador       ║");
            System.out.println("║ 2. Ver lista de entrenadores        ║");
            System.out.println("║ 3. Seleccionar un entrenador        ║");
            System.out.println("║ 4. Volver al menú principal         ║");
            System.out.println("╚═════════════════════════════════════════╝");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    registrarNuevoEntrenador();
                    break;
                case 2:
                    verListaDeEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    menuPrincipal();
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    } //🆗

    private static void registrarNuevoEntrenador(){
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║       Registrar Nuevo Entrenador     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.print("Introduce el nombre del nuevo entrenador: ");
        String nombre = sc.next();
        System.out.println("\nHas registrado al entrenador: " + nombre);
        entrenadores.add(new Entrenador(nombre));
    } //🆗

    private static void verListaDeEntrenadores(){
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║          Lista de Entrenadores       ║");
        System.out.println("╠══════════════════════════════════════════╣");

        if (entrenadores.isEmpty()) {
            System.out.println("║    No hay entrenadores registrados   ║");
        } else {
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.printf("  %2d. %s \n", (i + 1), entrenadores.get(i).getNombre());
            }
        }
        System.out.println("╚══════════════════════════════════════════╝");
    } //🆗

    private static void seleccionarEntrenador(){
        int opcionEntrenador;
        do {
            verListaDeEntrenadores();
            System.out.print("\nSelecciona el número del entrenador que deseas: ");
            opcionEntrenador = sc.nextInt();

            if (opcionEntrenador < 1 || opcionEntrenador > entrenadores.size()) {
                System.out.println("¡Opción inválida! Por favor, selecciona un número válido.");
                continue; // Continuar al inicio del bucle phasta que el usuario ingrese una opción válida
            }

            Entrenador entrenadorSeleccionado = entrenadores.get(opcionEntrenador - 1);
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("   ¡Bienvenid@ " + entrenadorSeleccionado.getNombre() + "!");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Ver equipo de Pokemones          ║");
            System.out.println("║ 2. Agregar Pokemon al equipo        ║");
            System.out.println("║ 3. Entrenar Pokemon                 ║");
            System.out.println("║ 4. Volver a Gestionar Entrenadores  ║");
            System.out.println("╚═════════════════════════════════════════╝");
            int opcionSubMenu = sc.nextInt();
            sc.nextLine(); 

            switch (opcionSubMenu) {
                case 1:
                    entrenadorSeleccionado.mostrarPokemones();
                    break;
                case 2:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║       Registrar Nuevo Pokémon        ║");
                    System.out.println("╠══════════════════════════════════════════╣");
                    System.out.print("Introduce el nombre del Pokémon: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce los puntos de salud del Pokémon: ");
                    int salud = sc.nextInt();
                    System.out.print("Introduce los puntos de ataque del Pokémon: ");
                    int ataque = sc.nextInt();
                    System.out.println("\nSelecciona el tipo de Pokémon:");
                    System.out.println("1. Ponyta");
                    System.out.println("2. Goldeen");
                    System.out.println("3. Paras");
                    System.out.println("4. Electrode");
                    System.out.println("5. Staryu");
                    System.out.println("6. Cubone");
                    System.out.println("7. Doduo");
                    System.out.println("8. Lickitung");
                    System.out.println("9. Hitmonchan");
                    System.out.println("10. Ekans");
                    System.out.println("Introduce el número del tipo: ");
                    int tipoOpcion = sc.nextInt();
                    sc.nextLine();

                    switch (tipoOpcion) {
                        case 1:
                            Pokemon Ponyta = new Ponyta(nombre, salud, ataque, TipoPokemon.FUEGO);
                            pokemones.add(Ponyta);
                            entrenadorSeleccionado.agregarPokemon(Ponyta);
                            System.out.println("Pokémon registrado: " + Ponyta.getNombre());
                            break;
                        case 2:
                            Pokemon Goldeen = new Goldeen(nombre, salud, ataque, TipoPokemon.AGUA);
                            pokemones.add(Goldeen);
                            entrenadorSeleccionado.agregarPokemon(Goldeen);
                            System.out.println("Pokémon registrado: " + Goldeen.getNombre());
                            break;
                        case 3:
                            Pokemon Paras = new Paras(nombre, salud, ataque, TipoPokemon.BICHO.PLANTA);
                            pokemones.add(Paras);
                            entrenadorSeleccionado.agregarPokemon(Paras);
                            System.out.println("Pokémon registrado: " + Paras.getNombre());
                            break;
                        case 4:
                            Pokemon Electrode = new Electrode(nombre, salud, ataque, TipoPokemon.ELECTRICO);
                            pokemones.add(Electrode);
                            entrenadorSeleccionado.agregarPokemon(Electrode);
                            System.out.println("Pokémon registrado: " + Electrode.getNombre());
                            break;
                        case 5:
                            Pokemon Staryu = new Staryu(nombre, salud, ataque, TipoPokemon.AGUA);
                            pokemones.add(Staryu);
                            entrenadorSeleccionado.agregarPokemon(Staryu);
                            System.out.println("Pokémon registrado: " + Staryu.getNombre());
                            break;
                        case 6:
                            Pokemon Cubone = new Cubone(nombre, salud, ataque, TipoPokemon.TIERRA);
                            pokemones.add(Cubone);
                            entrenadorSeleccionado.agregarPokemon(Cubone);
                            System.out.println("Pokémon registrado: " + Cubone.getNombre());
                            break;
                        case 7:
                            Pokemon Doduo = new Doduo(nombre, salud, ataque, TipoPokemon.NORMAL.VOLADOR);
                            pokemones.add(Doduo);
                            entrenadorSeleccionado.agregarPokemon(Doduo);
                            System.out.println("Pokémon registrado: " + Doduo.getNombre());
                            break;
                        case 8:
                            Pokemon Lickitung = new Lickitung(nombre, salud, ataque, TipoPokemon.NORMAL);
                            pokemones.add(Lickitung);
                            entrenadorSeleccionado.agregarPokemon(Lickitung);
                            System.out.println("Pokémon registrado: " + Lickitung.getNombre());
                        case 9:
                            Pokemon Hitmonchan = new Hitmonchan(nombre, salud, ataque, TipoPokemon.LUCHA);
                            pokemones.add(Hitmonchan);
                            entrenadorSeleccionado.agregarPokemon(Hitmonchan);
                            System.out.println("Pokémon registrado: " + Hitmonchan.getNombre());
                            break;
                        case 10:
                            Pokemon Ekans = new Ekans(nombre, salud, ataque, TipoPokemon.VENENO);
                            pokemones.add(Ekans);
                            entrenadorSeleccionado.agregarPokemon(Ekans);
                            System.out.println("Pokémon registrado: " + Ekans.getNombre());
                            break;
                        default:
                            System.out.println("Opción no válida.");
                        }
                    break;
                case 3:
                    System.out.println("Seleccione un Pokémon para entrenar:");
                    entrenadorSeleccionado.mostrarPokemones();
                    int pokemonIndex = sc.nextInt() - 1;
                    Pokemon pokemonParaEntrenar = entrenadorSeleccionado.seleccionarPokemon(pokemonIndex);
                    if (pokemonParaEntrenar != null) {
                        pokemonParaEntrenar.entrenar();
                        System.out.println(pokemonParaEntrenar.getNombre() + " ha sido entrenado.");
                    }
                    break;
                case 4:
                    gestionarEntrenadores();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionEntrenador != 4);
    } //🆗
    
    private static void gestionarPokemones(){
        int opcion;
        do {
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("║         Gestionar Pokémones         ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Ver * los Pokémones registrados  ║");
            System.out.println("║ 2. Registrar nuevo Pokémon          ║");
            System.out.println("║ 3. Volver al menú principal         ║");
            System.out.println("╚═════════════════════════════════════════╝");
            opcion = sc.nextInt();
            sc.nextLine(); 
                  
            switch (opcion) {
                case 1:
                    verPokemones(); 
                    break;
                case 2:
                    registrarPokemon();
                    break;
                case 3:
                    menuPrincipal();
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }        
        } while (opcion != 3);
    } //🆗
    
    private static void verPokemones() {
    System.out.println("\n╔═════════════════════════════════════════╗");
    System.out.println("║       Lista de Pokémones Registrados    ║");
    System.out.println("╠═════════════════════════════════════════╣");
    if (pokemones.isEmpty()) {
        System.out.println("║    No hay Pokémones registrados         ║");
    } else {
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.printf("  %2d. %s (Salud: %d, Ataque: %d, Tipo: %s)\n", (i + 1), pokemones.get(i).getNombre(), pokemones.get(i).getSalud(), pokemones.get(i).getPuntosDeAtaque(), pokemones.get(i).getTipo());
        }
    }
    System.out.println("╚═════════════════════════════════════════╝");
} //🆗

    private static void registrarPokemon() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║       Registrar Nuevo Pokémon            ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.print("Introduce el nombre del Pokémon: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce los puntos de salud del Pokémon: ");
        int salud = sc.nextInt();
        System.out.print("Introduce los puntos de ataque del Pokémon: ");
        int ataque = sc.nextInt();
        System.out.println("\nSelecciona el tipo de Pokémon:");
        System.out.println("1. Ponyta");
        System.out.println("2. Goldeen");
        System.out.println("3. Paras");
        System.out.println("4. Electrode");
        System.out.println("5. Staryu");
        System.out.println("6. Cubone");
        System.out.println("7. Doduo");
        System.out.println("8. Lickitung");
        System.out.println("9. Hitmonchan");
        System.out.println("10. Ekans");
        System.out.println("Introduce el número del tipo: ");
        int tipoOpcion = sc.nextInt();
        sc.nextLine();
    
        switch (tipoOpcion) {
            case 1:
                Pokemon Ponyta = new Ponyta(nombre, salud, ataque, TipoPokemon.FUEGO);
                pokemones.add(Ponyta);
                System.out.println("Pokémon registrado: " + Ponyta.getNombre());
                break;
            case 2:
                Pokemon Goldeen = new Goldeen(nombre, salud, ataque, TipoPokemon.AGUA);
                pokemones.add(Goldeen);
                System.out.println("Pokémon registrado: " + Goldeen.getNombre());
                break;
            case 3:
                Pokemon Paras = new Paras(nombre, salud, ataque, TipoPokemon.BICHO.PLANTA);
                pokemones.add(Paras);
                System.out.println("Pokémon registrado: " + Paras.getNombre());
                break;
            case 4:
                Pokemon Electrode = new Electrode(nombre, salud, ataque, TipoPokemon.ELECTRICO);
                pokemones.add(Electrode);
                System.out.println("Pokémon registrado: " + Electrode.getNombre());
                break;
            case 5:
                Pokemon Staryu = new Staryu(nombre, salud, ataque, TipoPokemon.AGUA);
                pokemones.add(Staryu);
                System.out.println("Pokémon registrado: " + Staryu.getNombre());
                break;
            case 6:
                Pokemon Cubone = new Cubone(nombre, salud, ataque, TipoPokemon.TIERRA);
                pokemones.add(Cubone);
                System.out.println("Pokémon registrado: " + Cubone.getNombre());
                break;
            case 7:
                Pokemon Doduo = new Doduo(nombre, salud, ataque, TipoPokemon.NORMAL.VOLADOR);
                pokemones.add(Doduo);
                System.out.println("Pokémon registrado: " + Doduo.getNombre());
                break;
            case 8:
                Pokemon Lickitung = new Lickitung(nombre, salud, ataque, TipoPokemon.NORMAL);
                pokemones.add(Lickitung);
                System.out.println("Pokémon registrado: " + Lickitung.getNombre());
                break;
            case 9:
                Pokemon Hitmonchan = new Hitmonchan(nombre, salud, ataque,TipoPokemon.LUCHA);
                pokemones.add(Hitmonchan);
                System.out.println("Pokémon registrado: " + Hitmonchan.getNombre());
                break;
            case 10:
                Pokemon Ekans = new Ekans(nombre, salud, ataque, TipoPokemon.VENENO);
                pokemones.add(Ekans);
                System.out.println("Pokémon registrado: " + Ekans.getNombre());
                break;
            default:
                System.out.println("Opción no válida.");
            }
    }

    private static void iniciarBatalla(){
        int opcion;
        
        if (entrenadores.size() < 2) {
            System.out.println("No hay suficientes entrenadores para iniciar una batalla.");
            return;
        }
    
        int seleccion1 = -1;
        int seleccion2 = -1;
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("║           Iniciar Batalla           ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Elegir entrenador 1              ║");
            System.out.println("║ 2. Seleccionar Pokemon Entrenador 1 ║");
            System.out.println("║ 3. Elegir entrenador 2              ║");
            System.out.println("║ 4. Seleccionar Pokemon Entrenador 2 ║");
            System.out.println("║ 5. Comenzar batalla                 ║");
            System.out.println("║ 6. Volver al menú principal         ║");
            System.out.println("╚═════════════════════════════════════════╝");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.println("Selecciona el entrenador 1:");
                    for (int i = 0; i < entrenadores.size(); i++) {
                        System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
                    }
                    seleccion1 = sc.nextInt() - 1;
                    break;
                case 2:
                    Entrenador entrenador1 = entrenadores.get(seleccion1);
                    System.out.println("Selecciona el Pokémon de " + entrenador1.getNombre() + ":");
                    entrenador1.mostrarPokemones();
                    int pokemonIndex1 = sc.nextInt() - 1;
                    pokemon1 = entrenador1.seleccionarPokemon(pokemonIndex1);
                    break;
                case 3:
                    System.out.println("Selecciona el entrenador 2:");
                    for (int i = 0; i < entrenadores.size(); i++) {
                        if (i != seleccion1) {
                            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
                        }
                    }
                    seleccion2 = sc.nextInt() - 1;
                    if (seleccion1 == seleccion2) {
                        seleccion2 = (seleccion2 + 1) % entrenadores.size();
                    }
                    break;
                case 4:
                    Entrenador entrenador2 = entrenadores.get(seleccion2);
                    System.out.println("Selecciona el Pokémon de " + entrenador2.getNombre() + ":");
                    entrenador2.mostrarPokemones();
                    int pokemonIndex2 = sc.nextInt() - 1;
                    pokemon2 = entrenador2.seleccionarPokemon(pokemonIndex2);
                    break;
                case 5:
                    Batalla batalla = new Batalla(pokemon1, pokemon2);
                    batalla.iniciarBatalla();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);      
   }
    //FALTA ANALISIS COMPLEJIDAD 
    //FALTA PERSISTENCIA
    //FALTA PRUEBAS UNITARIAS
}