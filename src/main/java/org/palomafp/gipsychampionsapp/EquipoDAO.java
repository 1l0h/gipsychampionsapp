package org.palomafp.gipsychampionsapp;

import java.util.ArrayList;
import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class EquipoDAO {

    private ArrayList<Equipo> listaEquipo = new ArrayList<Equipo>();

    public EquipoDAO() {
        listaEquipo.add(new Equipo(0, "Real Vardrid", "Madrid"));
        listaEquipo.add(new Equipo(1, "Varcelona", "Barcelona"));
        listaEquipo.add(new Equipo(3, "Patético de Madrid", "Madrid"));
        listaEquipo.add(new Equipo(4, "Los Morrocotunos", "Distrito San Blas-Canillejas-Ciudad Lineal"));
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