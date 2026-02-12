package org.palomafp.gipsychampionsapp.modelo;

import java.util.List;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private String ciudad;
    private Entrenador entrenador;
    private Estadio estadio;
    private List<Jugador> jugadores;

    public Equipo(int idEquipo, String nombre, String ciudad) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {

        String entrenadorInfo = (entrenador != null)
                ? entrenador.getNombre() + " (ID: " + entrenador.getIdEntrenador() + ")"
                : "Sin entrenador";

        String estadioInfo = (estadio != null)
                ? estadio.getNombre() + " (ID: " + estadio.getIdEstadio() + ")"
                : "Sin estadio";

        int jugadoresCount = (jugadores != null) ? jugadores.size() : 0;

        StringBuilder listaJugadores = new StringBuilder();

        if (jugadores != null && !jugadores.isEmpty()) {
            for (Jugador j : jugadores) {
                listaJugadores.append("\n║   - ")
                        .append(j.toString());
            }
        } else {
            listaJugadores.append("\n║   Sin jugadores");
        }

        return "\n╔══════════════════════════════╗" +
                "\n║          " + nombre.toUpperCase() +
                "\n╠══════════════════════════════╣" +
                "\n║ ID: " + idEquipo +
                "\n║ Ciudad: " + ciudad +
                "\n║ Entrenador: " + entrenadorInfo +
                "\n║ Estadio: " + estadioInfo +
                "\n║ Nº Jugadores: " + jugadoresCount +
                "\n║ Jugadores:" +
                listaJugadores +
                "\n╚══════════════════════════════╝";
    }

}