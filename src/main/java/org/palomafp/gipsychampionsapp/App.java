package org.palomafp.gipsychampionsapp;

import java.util.List;
import java.util.Scanner;

import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Equipo> listaEquipo = new EquipoDAO().getArrayList();
		EquipoDAO equipo = new EquipoDAO();
		int respuesta, respuesta2;

		do {
			System.out.println("LIGA MORROCOTUDA");
			System.out.println("----------------");
			System.out.println("1. Equipo Random");
			System.out.println("2. Equipo por Id");
			System.out.println("3. Todos los equipos");
			System.out.println("4. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
				case 1:
				System.out.println("Equipo Random: " + equipo.getEquipoAleatorio().getNombre());
					break;

				case 2:
					for (int i = 0; i < listaEquipo.size(); i++){
						System.out.println((i + 1) + ". " + listaEquipo.get(i).getNombre());
					}
					respuesta2 = sc.nextInt();
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
		} while (respuesta != 3);

		sc.close();
	}

}