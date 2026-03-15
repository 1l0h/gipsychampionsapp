package org.palomafp.gipsychampionsapp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.palomafp.gipsychampionsapp.modelo.Equipo;

/**
 * Clase de ejecución del programa de equipos
 *
 * @author Sandoval y Lobato
 * @version 1.0
 */
public class App {

    /**
     * Constructor por defecto
     */
    public App() {
    }

    /**
     * Función principal para la ejecución del programa
     * 
     * @param args posibles argumentos introducidos
     */
    public static void main(String[] args) {

        // atributo escáner
        Scanner sc = new Scanner(System.in);
        // instancia del objeto EquipoDAO
        EquipoDAO equipoDAO = new EquipoDAO();
        // List en el que almacenaremos la colección de equipos
        List<Equipo> listaEquipo = equipoDAO.getAllEquipos();

        // atributos que se usarán para responder el menú
        int respuesta = 0;
        int respuesta2 = 0;

        // Bucle que se repetirá hasta que la opción introducida sea la de salir
        do {
            // impresión del menú
            System.out.println("\nLIGA MORROCOTUDA");
            System.out.println("----------------");
            System.out.println("1. Equipo Random");
            System.out.println("2. Equipo por Id");
            System.out.println("3. Todos los equipos");
            System.out.println("4. Salir");

            // almacena la respuesta introducida por teclado y controla que no sea
            // incorrecta, en caso de que sí lo fuese, mostraría un error.
            try {
                respuesta = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Eso no es un número, compañerete");
                sc.nextLine();
                respuesta = 0;
            }

            // Switch que comprobará la entrada introducida anteriormente
            switch (respuesta) {

                // Llama al método "getEquipoAleatorio"
                case 1:
                    System.out.println(equipoDAO.getEquipoAleatorio());
                    break;
                // Imprime un pequeño menú con el id de los equipos y permite introducir un
                // nombre para ver los datos de este
                case 2:
                    for (int i = 0; i < listaEquipo.size(); i++) {
                        System.out.println((i + 1) + ". " + listaEquipo.get(i).getNombre());
                    }

                    try {
                        respuesta2 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Eso no es un número, compañerete");
                        sc.nextLine();
                        respuesta2 = 0;
                    }

                    if (respuesta2 > 0 && respuesta2 <= listaEquipo.size()) {
                        System.out.println(listaEquipo.get(respuesta2 - 1));
                    } else {
                        System.out.println("Ese número no está en el índice, compañerete");
                    }
                    break;
                // Muestra todos los equipos con un for each.
                case 3:
                    for (Equipo e : listaEquipo) {
                        System.out.println(e);
                    }
                    break;
                // Imprime un mensaje para salir del programa
                case 4:
                    System.out.println("Saliendo...");
                    break;
                // Default que se imprimirá en caso de que el valor introducido sea incorrecto.
                default:
                    System.out.println("Ese número no es válido compañerete");
                    break;
            }

        } while (respuesta != 4);
        // cerramos el scanner
        sc.close();
    }
}
