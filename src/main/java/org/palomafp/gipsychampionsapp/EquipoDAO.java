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
        listaEquipo.add(new Equipo(1, "Varcelona", "Barcelona"));
    }

    public Equipo getEquipoPorIndice(int indice){
        return listaEquipo.get(indice);
    }

    public ArrayList<Equipo> getArrayList() {
        return listaEquipo;
    }

    public Equipo getEquipoAleatorio() {
        return listaEquipo.get(Math.random() * (listaEquipo.size - 1) + 0);
    }
}