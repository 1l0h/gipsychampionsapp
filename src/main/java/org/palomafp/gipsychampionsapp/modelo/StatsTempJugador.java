package org.palomafp.gipsychampionsapp.modelo;

/**
 * Clase que representa las estadísticas de un jugador en una temporada
 * @author Sandoval y Lobato
 */
public class StatsTempJugador {

    // Atributos
    // Entero que representa el número de goles
    private int goles;

    // Entero que representa el número de asistencias
    private int asistencias;

    // Entero que representa el número de minutos jugados
    private int minJugados;

    // Entero que representa el número de tarjetas amarillas
    private int tarjetasAmarillas;

    // Entero que representa el número de tarjetas rojas
    private int tarjetasRojas;

    // Entero que representa el número de porterías a cero (para porteros)
    private int porteriasACero;

    // Jugador al que pertenecen estas estadísticas
    private Jugador jugador;

    /**
     * Constructor para instanciar las estadísticas de un jugador con todos sus
     * atributos
     * 
     * @param goles             goles marcados por el jugador
     * @param asistencias       asistencias realizadas por el jugador
     * @param minJugados        minutos jugados por el jugador
     * @param tarjetasAmarillas tarjetas amarillas recibidas por el jugador
     * @param tarjetasRojas     tarjetas rojas recibidas por el jugador
     * @param porteriasACero    porterías a cero conseguidas por el jugador (si es
     *                          portero si no, se puede dejar a 0)
     * @param jugador           jugador al que pertenecen estas estadísticas
     */
    public StatsTempJugador(int goles, int asistencias, int minJugados, int tarjetasAmarillas, int tarjetasRojas,
            int porteriasACero, Jugador jugador) {
        this.goles = goles;
        this.asistencias = asistencias;
        this.minJugados = minJugados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.porteriasACero = porteriasACero;
        this.jugador = jugador;
    }

    // Getters & Setters
    // Getters

    /**
     * Getter de los goles
     * 
     * @return número de goles marcados por el jugador
     */
    public int getGoles() {
        return goles;
    }

    /**
     * Getter de las asistencias
     * 
     * @return número de asistencias realizadas por el jugador
     */
    public int getAsistencias() {
        return asistencias;
    }

    /**
     * Getter de los minutos jugados
     * 
     * @return número de minutos jugados por el jugador
     */
    public int getMinJugados() {
        return minJugados;
    }

    /**
     * Getter de las tarjetas rojas
     * 
     * @return número de tarjetas rojas recibidas por el jugador
     */
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    /**
     * Getter de las tarjetas amarillas
     * 
     * @return número de tarjetas amarillas recibidas por el jugador
     */
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    /**
     * Getter de las porterías a cero
     * 
     * @return número de porterías a cero conseguidas por el jugador (si es portero
     *         si no, se puede dejar a 0)
     */
    public int getPorteriasACero() {
        return porteriasACero;
    }

    /**
     * Getter del jugador
     * 
     * @return jugador al que pertenecen estas estadísticas
     */
    public Jugador getJugador() {
        return jugador;
    }

    // Setters

    /**
     * Setter de los goles
     * 
     * @param goles nuevo número de goles marcados por el jugador
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * Setter de las asistencias
     * 
     * @param asistencias nuevo número de asistencias realizadas por el jugador
     */
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    /**
     * Setter de los minutos jugados
     * 
     * @param minJugados nuevo número de minutos jugados por el jugador
     */
    public void setMinJugados(int minJugados) {
        this.minJugados = minJugados;
    }

    /**
     * Setter de las tarjetas amarillas
     * 
     * @param tarjetasAmarillas nuevo número de tarjetas amarillas recibidas por el
     *                          jugador
     */
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    // Setters

    /**
     * Setter de las tarjetas rojas
     * 
     * @param tarjetasRojas nuevo número de tarjetas rojas recibidas por el jugador
     */
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    /**
     * Setter de las porterías a cero
     * 
     * @param porteriasACero nuevo número de porterías a cero conseguidas por el
     *                       jugador (si es portero si no, se puede dejar a 0)
     */
    public void setPorteriasACero(int porteriasACero) {
        this.porteriasACero = porteriasACero;
    }

    /**
     * Setter del jugador
     * 
     * @param jugador nuevo jugador al que pertenecen estas estadísticas
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * toString para mostrar la información de las estadísticas del jugador de forma
     * clara y estructurada
     * incluyendo la información del jugador al que pertenecen estas estadísticas
     */
    @Override
    public String toString() {
        String jugadorInfo = (jugador != null) ? jugador.toString() : "null";
        return "StatsTempJugador{goles=" + goles + ", asistencias=" + asistencias + ", minJugados=" + minJugados
                + ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + ", porteriasACero="
                + porteriasACero + ", jugador=[" + jugadorInfo + "]}";
    }
}