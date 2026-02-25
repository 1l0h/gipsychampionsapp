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
        // Creación Real Vardrid
        listaEquipo.add(new Equipo(0, "Real Vardrid", "Madrid"));
        Entrenador entrenador1 = new Entrenador(0, "Chavi", "San Ildefonso", "papoi");
        Estadio estadio1 = new Estadio(0, "Anchoneu", "Chamartín");
        List<Jugador> listaJugadores1 = new ArrayList<Jugador>();
        listaJugadores1.add(new Jugador(0, "La Falete", "Prime", "No lo ha renovado"));
        listaJugadores1.add(new Jugador(1, "El Fary", "Peak", "Tampoco lo ha renovado"));
        listaEquipo.get(0).setEntrenador(entrenador1);
        listaEquipo.get(0).setEstadio(estadio1);
        listaEquipo.get(0).setJugadores(listaJugadores1);

        // Creación Varcelona
        listaEquipo.add(new Equipo(1, "Varcelona", "Barcelona"));
        Entrenador entrenador2 = new Entrenador(1, "Jansi", "Musty Flick", "Alemán");
        Estadio estadio2 = new Estadio(1, "Campo nuevo", "Rocafonda 304");
        List<Jugador> listaJugadores2 = new ArrayList<Jugador>();
        listaJugadores2.add(new Jugador(2, "LewanWisky", "El Polaco", "Retenido en la aduana"));
        listaJugadores2.add(new Jugador(3, "Garrapiña", "El Brazuca", "No lo tiene todavia"));
        listaEquipo.get(1).setEntrenador(entrenador2);
        listaEquipo.get(1).setEstadio(estadio2);
        listaEquipo.get(1).setJugadores(listaJugadores2);

        // Creación Patético de Madrid
        listaEquipo.add(new Equipo(2, "Patético de Madrid", "Madrid"));
        Entrenador entrenador3 = new Entrenador(2, "Chulo", "Sin peones", "Mate");
        Estadio estadio3 = new Estadio(2, "Estadio Napolitano", "Canillejas Mierda");
        List<Jugador> listaJugadores3 = new ArrayList<Jugador>();
        listaJugadores3.add(new Jugador(4, "Jr", "Sin peones", "Nacido en España"));
        listaJugadores3.add(new Jugador(5, "Slakoth", "alto", "Del mismo país que el rubius"));
        listaEquipo.get(2).setEntrenador(entrenador3);
        listaEquipo.get(2).setEstadio(estadio3);
        listaEquipo.get(2).setJugadores(listaJugadores3);

        // Creación Los Morrocotudos
        listaEquipo.add(new Equipo(3, "Los Morrocotudos", "Distrito San Blas-Canillejas-Ciudad Lineal"));
        Entrenador entrenador4 = new Entrenador(3, "MariCarmen", "No me acuerdo", "72839163A");
        Estadio estadio4 = new Estadio(3, "Patio La Paloma", "IES Virgen de la Paloma");
        List<Jugador> listaJugadores4 = new ArrayList<Jugador>();
        listaJugadores4.add(new Jugador(6, "Sandofoca", "Adrián", "Lo ha perdido"));
        listaJugadores4.add(new Jugador(7, "Iñaki", "Papá", "También lo ha perdido"));
        listaJugadores4.add(new Jugador(8, "Hanser", "nose", "Todavía no lo tiene"));
        listaJugadores4.add(new Jugador(9, "Samuel", "Del Monte", "Se le ha perdido en la nieve"));
        listaEquipo.get(3).setEntrenador(entrenador4);
        listaEquipo.get(3).setEstadio(estadio4);
        listaEquipo.get(3).setJugadores(listaJugadores4);
    }

    public Equipo getEquipoPorIndice(int indice) {
        return listaEquipo.get(indice);
    }

    public ArrayList<Equipo> getAllEquipos() {
        return listaEquipo;
    }

    public Equipo getEquipoAleatorio() {
        return listaEquipo.get((int) Math.random() * (listaEquipo.size() - 1) + 0);
    }

    public boolean addEquipo(int idEquipo, String nombreEquipo, String ciudadEquipo) {
        boolean estaDisponible = true;
        for (int i = 0; i < listaEquipo.size(); i++) {
            if (listaEquipo.get(i).getIdEquipo() == idEquipo) {
                estaDisponible = false;
            }
        }
        if (estaDisponible == true) {
            listaEquipo.add(new Equipo(idEquipo, nombreEquipo, ciudadEquipo));
        }
        return estaDisponible;
    }
}