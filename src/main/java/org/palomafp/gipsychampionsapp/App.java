package org.palomafp.gipsychampionsapp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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

					break;
				case 2:
					for (int i = 0; i < 10; i++){
						System.out.println((i + 1) + ". ");
					}
					break;
				case 3:

					break;
				case 4:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Ese número no es válido compañerete");
					break;
			}
		} while (respuesta != 3);
	}

}