package org.palomafp.gipsychampionsapp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Equipo> listaEquipo = new EquipoDAO().getArrayList();
		EquipoDAO equipo = new EquipoDAO();
		int respuesta = 0, respuesta2 = 0;

		do {
			System.out.println("LIGA MORROCOTUDA");
			System.out.println("----------------");
			System.out.println("1. Equipo Random");
			System.out.println("2. Equipo por Id");
			System.out.println("3. Todos los equipos");
			System.out.println("4. Salir");
			try {
				respuesta = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Eso no es un número, compañerete");
			}

			switch (respuesta) {
				case 1:
				System.out.println("Equipo Random: " + equipo.getEquipoAleatorio().getNombre());
					break;

				case 2:
					for (int i = 0; i < listaEquipo.size(); i++){
						System.out.println((i + 1) + ". " + listaEquipo.get(i).getNombre());
					}
				try {
					respuesta2 = sc.nextInt();	
				} catch (IndexOutOfBoundsException e) {
					System.err.println("Ese número no está en el índice,  compañerete");
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un número, compañerete");
				}
					System.out.println("Equipo elegido: " + listaEquipo.get(respuesta2 - 1).getNombre());
					break;

				case 3:
					for (int i = 0; i < listaEquipo.size(); i++){
						System.out.println((i + 1) + ". " + listaEquipo.get(i).getNombre());
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