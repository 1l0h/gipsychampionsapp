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
        String entrenadorInfo = (entrenador != null) ? ("id=" + entrenador.getIdEntrenador() + ", nombre=" + entrenador.getNombre()) : "null";
        String estadioInfo = (estadio != null) ? ("id=" + estadio.getIdEstadio() + ", nombre=" + estadio.getNombre()) : "null";
        int jugadoresCount = (jugadores != null) ? jugadores.size() : 0;
        return "Equipo{id=" + idEquipo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", entrenador=[" + entrenadorInfo + "], estadio=[" + estadioInfo + "], jugadoresCount=" + jugadoresCount + "}";
    }
}