package simulador;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;

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
                    gestionarEntrenadores(); //? FALTA SUBMENU AL seleccionarEntrenador()
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("Saliendo del simulador...");
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

    }

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
            sc.nextLine(); // Consumir el salto de línea
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
            sc.nextLine(); // Consumir el salto de línea

            switch (opcionSubMenu) {
                case 1:
                    verEquipoDePokemones();
                    break;
                case 2:
                    agregarPokemonAlEquipo();
                    break;
                case 3:
                    entrenarPokemon();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcionEntrenador != 4);

    } //🆗
    
    private static void verEquipoDePokemones(){
       System.out.println("NO SE ayuda");
   } //?
      
    private static void agregarPokemonAlEquipo(){
       System.out.println("NO SE ayuda");
   } //?
   
    private static void entrenarPokemon(){
        
        System.out.println("NO SE ayuda");
    } //?

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
            sc.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    verPokemones();
                    break;
                case 2:
                    registrarPokemones();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    } //🆗

    private static void verPokemones(){
       System.out.println("no estoy segura");
   } //?
   
    private static void registrarPokemones(){
       System.out.println("no estoy segura");
   } //?
    
    private static void iniciarBatalla(){
        int opcion;
        do {
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("║           Iniciar Batalla           ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Elegir entrenador 1              ║");
            System.out.println("║ 2. Elegir entrenador 2              ║");
            System.out.println("║ 3. Seleccionar Pokemon Entrenador 1 ║");
            System.out.println("║ 4. Seleccionar Pokemon Entrenador 2 ║");
            System.out.println("║ 5. Comenzar batalla                 ║");
            System.out.println("║ 6. Volver al menú principal         ║");
            System.out.println("╚═════════════════════════════════════════╝");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    eleccionEntrenador1();
                    break;
                case 2:
                    eleccionEntrenador2();
                    break;
                case 3:
                    eleccionPokemonEntrenador1();
                    break;
                case 4:
                    eleccionPokemonEntrenador2();
                    break;
                case 5:
                    comenzarBatalla();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
        
   } //🆗
   
    private static void eleccionEntrenador1(){
       System.out.println("not yet");
    } //?

    private static void eleccionEntrenador2(){
       System.out.println("not yet");
    } //?
    
    private static void eleccionPokemonEntrenador1(){
       System.out.println("not yet");
    } //?
    
    private static void eleccionPokemonEntrenador2(){
       System.out.println("not yet");
    } //?
    
    private static void comenzarBatalla(){
       System.out.println("FALTAN ACCIONES DURANTE LA BATALLA");
       /*Durante la Batalla
[       
       Nombre del Pokémon 1] vs. [Nombre del Pokémon 2]
        1. [Pokémon 1] Atacar
        2. [Pokémon 2] Atacar
        3. Finalizar la batalla
        */
       
    } //?
}