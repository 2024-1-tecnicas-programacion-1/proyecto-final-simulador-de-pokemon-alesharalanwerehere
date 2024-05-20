package simulador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true; 

        while (continuar) {
            System.out.println("\n-- Simulador de batallas de Pokémon --\n");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir\n");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n-- Gestionar Entrenadores --\n");
                    System.out.println("1. Registrar nuevo entrenador");
                    System.out.println("2. Ver lista de entrenadores");
                    System.out.println("3. Seleccionar un entrenador");
                    System.out.println("4. Volver al menú principal\n");
                    System.out.print("Elige una opción: ");

                    int opcionMenuEntrenadores = sc.nextInt();

                    if (opcionMenuEntrenadores == 1) {
                        //Registar un entrenador
                    } else if (opcionMenuEntrenadores == 2) {
                        //lista entrenadores
                    } else if (opcionMenuEntrenadores == 3) {
                        //seleccionar un entrenador
                    }   else if (opcionMenuEntrenadores == 4) {
                        //volver
                    }
                    break;

                case 2:
                    System.out.println("\n-- Gestionar Pokémones --\n");
                    System.out.println("1. Ver todos los Pokémones registrados");
                    System.out.println("2. Registrar nuevo Pokémon");
                    System.out.println("3. Volver al menú principal\n");
                    System.out.print("Elige una opción: ");

                    int opcionMenuPokemones = sc.nextInt();

                    if (opcionMenuPokemones == 1) {
                        //Ver los pokemones
                    } else if (opcionMenuPokemones == 2) {
                        //registrar pokemon
                    }   else if (opcionMenuPokemones == 3) {
                        //volver
                    }
                    break;

                case 3:                    
                    System.out.println("\n-- Iniciar Batalla --\n");
                    System.out.println("1. Elegir entrenador 1");
                    System.out.println("2. Elegir entrenador 2");
                    System.out.println("3. Seleccionar Pokémon de entrenador 1");
                    System.out.println("4. Seleccionar Pokémon de entrenador 2");
                    System.out.println("5. Comenzar batalla");
                    System.out.println("6. Volver al menú principal\n");
                    System.out.print("Elige una opción: ");

                    int opcionMenuBatalla = sc.nextInt();

                    if (opcionMenuBatalla == 1) {
                        //entrenador 1
                    } else if (opcionMenuBatalla == 2) {
                        //entrenador 2
                    } else if (opcionMenuBatalla == 3) {
                        //pokemon 1
                    } else if (opcionMenuBatalla == 4) {
                        //pokemon 2
                    } else if (opcionMenuBatalla == 5) {
                        //comenzar batalla
                    } else if (opcionMenuBatalla == 6) {
                        //volver
                    }
                    break;
                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
}

