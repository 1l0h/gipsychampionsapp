package org.palomafp.gipsychampionsapp;

import java.util.List;

import org.palomafp.gipsychampionsapp.modelo.Entrenador;
import org.palomafp.gipsychampionsapp.modelo.Equipo;
import org.palomafp.gipsychampionsapp.modelo.Estadio;
import org.palomafp.gipsychampionsapp.modelo.Jugador;
import org.palomafp.gipsychampionsapp.modelo.StatsTempJugador;

public class App {

	public static void main(String[] args) {
		Equipo equipo = new Equipo(1, "Rayo Paloma", "Ciudad Paloma");

		Entrenador entrenador = new Entrenador(10, "Laura", "García", "12345678A");
		entrenador.setEquipo(equipo);
		equipo.setEntrenador(entrenador);

		Estadio estadio = new Estadio(5, "Estadio de la Paloma", "Calle Pico 7");
		estadio.setEquipo(equipo);
		equipo.setEstadio(estadio);

		Jugador j1 = new Jugador(7, "Lhanz", "Ochagavia", "87654321B");
		Jugador j2 = new Jugador(8, "Isidoro", "Palacios", "23456789C");
		j1.setEquipo(equipo);
		j2.setEquipo(equipo);

		List<Jugador> jugadores = List.of(j1, j2);
		equipo.setJugadores(jugadores);

		StatsTempJugador s1 = new StatsTempJugador(5, 2, 900, 1, 0, 0, j1);
		StatsTempJugador s2 = new StatsTempJugador(3, 4, 820, 2, 0, 0, j2);

		System.out.println("--- Ejemplo de objetos del modelo ---");
		System.out.println("Equipo: " + equipo.getNombre() + " (" + equipo.getCiudad() + ")");
		System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getPrimerApellido() + " - DNI: " + entrenador.getDniNif());
		System.out.println("Estadio: " + estadio.getNombre() + " - " + estadio.getDireccion());

		System.out.println("Jugadores:");
		for (Jugador j : equipo.getJugadores()) {
			System.out.println("  - " + j.getIdJugador() + ": " + j.getNombre() + " " + j.getPrimerApellido() + " (DNI: " + j.getDniNif() + ")");
		}

		System.out.println("\nStats temporales:");
		System.out.println("  " + s1.getJugador().getNombre() + ": goles=" + s1.getGoles() + ", asistencias=" + s1.getAsistencias() + ", minutos=" + s1.getMinJugados());
		System.out.println("  " + s2.getJugador().getNombre() + ": goles=" + s2.getGoles() + ", asistencias=" + s2.getAsistencias() + ", minutos=" + s2.getMinJugados());
	}

}