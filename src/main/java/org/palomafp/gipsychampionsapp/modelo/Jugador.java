package org.palomafp.gipsychampionsapp.modelo;

public class Jugador {
    private int idJugador;
    private String nombre;
    private String primerApellido;
    private String dniNif;
    private Equipo equipo;

    public Jugador(int idJugador, String nombre, String primerApellido, String dniNif) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.dniNif = dniNif;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getDniNif() {
        return dniNif;
    }

    public void setDniNif(String dniNif) {
        this.dniNif = dniNif;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return String.format("Jugador %d - %s %s (DNI: %s)",
            idJugador, nombre, primerApellido, dniNif);
    }
}