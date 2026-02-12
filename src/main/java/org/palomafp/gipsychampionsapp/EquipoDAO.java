package org.palomafp.gipsychampionsapp;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.gipsychampionsapp.modelo.Entrenador;
import org.palomafp.gipsychampionsapp.modelo.Equipo;
import org.palomafp.gipsychampionsapp.modelo.Estadio;
import org.palomafp.gipsychampionsapp.modelo.Jugador;

public class EquipoDAO {

    private ArrayList<Equipo> listaEquipo = new ArrayList<Equipo>();

    public EquipoDAO() {
        listaEquipo.add(new Equipo(0, "Real Vardrid", "Madrid"));
        Entrenador entrenador1 = new Entrenador(0, "Chavi", "San Ildefonso", "papoi");
        Estadio estadio1 = new Estadio(0, "Anchoneu", "Chamartín");
        List<Jugador> listaJugadores1 = new ArrayList<Jugador>();
        listaJugadores1.add(new Jugador(0, "La Falete", "Prime", "No lo ha renovado"));
        listaJugadores1.add(new Jugador(1, "El Fary", "Peak", "Tampoco lo ha renovado"));
        listaEquipo.get(0).setEntrenador(entrenador1);
        listaEquipo.get(0).setEstadio(estadio1);
        listaEquipo.get(0).setJugadores(listaJugadores1);
        listaEquipo.add(new Equipo(1, "Varcelona", "Barcelona"));
        listaEquipo.add(new Equipo(2, "Patético de Madrid", "Madrid"));
        listaEquipo.add(new Equipo(3, "Los Morrocotudos", "Distrito San Blas-Canillejas-Ciudad Lineal"));
    }

    public Equipo getEquipoPorIndice(int indice) {
        return listaEquipo.get(indice);
    }

    public ArrayList<Equipo> getArrayList() {
        return listaEquipo;
    }

    public Equipo getEquipoAleatorio() {
        return listaEquipo.get((int) Math.random() * (listaEquipo.size() - 1) + 0);
    }

    public void addEquipo(int idEquipo, String nombreEquipo, String ciudadEquipo) {
        boolean estaDisponible = true;
        for (int i = 0; i < listaEquipo.size(); i++) {
            if (listaEquipo.get(i).getIdEquipo() == idEquipo) {
                estaDisponible = false;
            }
        }
        if (estaDisponible == true) {
            listaEquipo.add(new Equipo(idEquipo, nombreEquipo, ciudadEquipo));
        }
    }
}