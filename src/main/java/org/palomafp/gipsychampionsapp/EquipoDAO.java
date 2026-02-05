package org.palomafp.gipsychampionsapp;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.gipsychampionsapp.modelo.Entrenador;
import org.palomafp.gipsychampionsapp.modelo.Equipo;
import org.palomafp.gipsychampionsapp.modelo.Estadio;
import org.palomafp.gipsychampionsapp.modelo.Jugador;

public class EquipoDAO {

    public Equipo getEquipoDemo() {
        Equipo equipo = new Equipo(1, "Rayo Paloma", "Ciudad Paloma");

        Entrenador entrenador = new Entrenador(10, "Luis Enrique", "MArtínez", "12345678A");
        entrenador.setEquipo(equipo);
        equipo.setEntrenador(entrenador);

        Estadio estadio = new Estadio(5, "Estadio de la Paloma", "Calle Pico 7");
        estadio.setEquipo(equipo);
        equipo.setEstadio(estadio);

        Jugador j1 = new Jugador(7, "Lhanz", "Ochagavia", "87654321B");
        Jugador j2 = new Jugador(8, "Isidoro", "Palacios", "23456789C");
        j1.setEquipo(equipo);
        j2.setEquipo(equipo);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);
        equipo.setJugadores(jugadores);

        return equipo;
    }

    public static Equipo getDemo() {
        return new EquipoDAO().getEquipoDemo();
    }

}