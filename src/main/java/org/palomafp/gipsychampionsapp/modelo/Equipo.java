package org.palomafp.gipsychampionsapp.modelo;

import java.util.List;

/**
 * Clase que representa un equipo de fútbol
 * @author Sandoval y Lobato
 */
public class Equipo {

    // Atributos
    // Entero que representa su id
    private int idEquipo;

    // String que representa su nombre
    private String nombre;

    // String que representa su ciudad
    private String ciudad;

    // Entrenador del equipo
    private Entrenador entrenador;

    // Estadio del equipo
    private Estadio estadio;

    // Lista de jugadores del equipo
    private List<Jugador> jugadores;

    /**
     * Constructor para instanciar un equipo con sus atributos básicos
     * 
     * @param idEquipo entero con su id
     * @param nombre   string con su nombre
     * @param ciudad   string con su ciudad
     */
    public Equipo(int idEquipo, String nombre, String ciudad) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Getters & Setters
    // Getters

    /**
     * Getter del id
     * 
     * @return id del equipo
     */
    public int getIdEquipo() {
        return idEquipo;
    }

    /**
     * Getter del nombre
     * 
     * @return nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la ciudad
     * 
     * @return ciudad del equipo
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Getter del entrenador
     * 
     * @return entrenador del equipo
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Getter del estadio
     * 
     * @return estadio del equipo
     */
    public Estadio getEstadio() {
        return estadio;
    }

    /**
     * Getter de la lista de jugadores
     * 
     * @return lista de jugadores del equipo
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    // Setters

    /**
     * Setter del id
     * 
     * @param idEquipo a atribuir para el equipo
     */
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * Setter del nombre
     * 
     * @param nombre a atribuir para el equipo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de la ciudad
     * 
     * @param ciudad a atribuir para el equipo
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Setter del entrenador
     * 
     * @param entrenador a atribuir para el equipo
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Setter del estadio
     * 
     * @param estadio a atribuir para el equipo
     */
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    /**
     * Setter de la lista de jugadores
     * 
     * @param jugadores a atribuir para el equipo
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Método toString para mostrar la información del equipo de forma clara y
     * estructurada
     */
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