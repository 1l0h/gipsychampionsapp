package org.palomafp.gipsychampionsapp;

import java.util.List;

import org.palomafp.gipsychampionsapp.modelo.Equipo;
import org.palomafp.gipsychampionsapp.modelo.Jugador;
import org.palomafp.gipsychampionsapp.modelo.StatsTempJugador;

public class App {

	public static void main(String[] args) {
		Equipo equipo = EquipoDAO.getDemo();
		List<Jugador> jugadores = equipo.getJugadores();

		Jugador j1 = null;
		Jugador j2 = null;
		
		if (jugadores != null && !jugadores.isEmpty()) {
			j1 = jugadores.get(0);
			if (jugadores.size() > 1) {
				j2 = jugadores.get(1);
			}
		}

		StatsTempJugador s1 = new StatsTempJugador(5, 2, 900, 1, 0, 0, j1);
		StatsTempJugador s2 = new StatsTempJugador(3, 4, 820, 2, 0, 0, j2);

		System.out.println("--- Ejemplo de objetos del modelo ---");
		System.out.println(equipo);
		System.out.println(equipo.getJugadores());
		System.out.println(equipo.getEstadio());

		System.out.println("Jugadores:");
		if (jugadores != null) {
			for (Jugador j : jugadores) {
				System.out.println("  - " + j);
			}
		}

		System.out.println("\nStats temporales:");
		System.out.println("  " + s1);
		System.out.println("  " + s2);
	}

}