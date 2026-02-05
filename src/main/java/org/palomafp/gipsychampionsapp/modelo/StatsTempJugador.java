package org.palomafp.gipsychampionsapp.modelo;

public class StatsTempJugador {
    private int goles;
    private int asistencias;
    private int minJugados;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int porteriasACero;
    private Jugador jugador;

    public StatsTempJugador(int goles, int asistencias, int minJugados, int tarjetasAmarillas, int tarjetasRojas, int porteriasACero, Jugador jugador) {
        this.goles = goles;
        this.asistencias = asistencias;
        this.minJugados = minJugados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.porteriasACero = porteriasACero;
        this.jugador = jugador;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getMinJugados() {
        return minJugados;
    }

    public void setMinJugados(int minJugados) {
        this.minJugados = minJugados;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getPorteriasACero() {
        return porteriasACero;
    }

    public void setPorteriasACero(int porteriasACero) {
        this.porteriasACero = porteriasACero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}