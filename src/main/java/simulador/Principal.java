package simulador.pokemon;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Principal {
    private static List<Entrenador> entrenadores = new ArrayList<>();
    private static List<Pokemon> pokemones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
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
                    System.out.println("Saliendo del simulador...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\nSimulador de Batallas Pokémon");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void gestionarEntrenadores() {
        int opcion;
        do {
            System.out.println("\nGestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
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
    }

    private static void registrarNuevoEntrenador() {
        System.out.print("Introduce el nombre del nuevo entrenador: ");
        String nombre = scanner.nextLine();
        entrenadores.add(new Entrenador(nombre));
        System.out.println("Entrenador " + nombre + " registrado exitosamente.");
    }

    private static void verListaDeEntrenadores() {
        System.out.println("Lista de entrenadores:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
        }
    }

    private static void seleccionarEntrenador() {
        verListaDeEntrenadores();
        System.out.print("Elige el índice del entrenador: ");
        int indice = scanner.nextInt();
    }
}