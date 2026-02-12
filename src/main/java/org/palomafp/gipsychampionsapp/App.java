package org.palomafp.gipsychampionsapp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EquipoDAO equipoDAO = new EquipoDAO();
        List<Equipo> listaEquipo = equipoDAO.getArrayList();

        int respuesta = 0;
        int respuesta2 = 0;

        do {
            System.out.println("\nLIGA MORROCOTUDA");
            System.out.println("----------------");
            System.out.println("1. Equipo Random");
            System.out.println("2. Equipo por Id");
            System.out.println("3. Todos los equipos");
            System.out.println("4. Salir");

            try {
                respuesta = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Eso no es un número, compañerete");
                sc.nextLine();
                respuesta = 0;
            }

            switch (respuesta) {

                case 1:
                    System.out.println(equipoDAO.getEquipoAleatorio());
                    break;

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

                case 3:
                    for (Equipo e : listaEquipo) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Ese número no es válido compañerete");
                    break;
            }

        } while (respuesta != 4);

        sc.close();
    }
}
