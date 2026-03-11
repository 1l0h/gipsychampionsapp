package org.palomafp.gipsychampionsapp.modelo;

/**
 * Clase que representa un jugador de un equipo
 * @author Sandoval y Lobato
 */
public class Jugador {

    // Atributos
    // Entero que representa su id
    private int idJugador;

    // String que representa su nombre
    private String nombre;

    // String que representa su primer y único apellido
    private String primerApellido;

    // String con su dni/nif
    private String dniNif;

    // Equipo al que pertenece
    private Equipo equipo;

    /**
     * Constructor para instanciar un jugador con todos sus atributos
     * 
     * @param idJugador      entero con su id
     * @param nombre         string con su nombre
     * @param primerApellido string con su primer apellido
     * @param dniNif         string con su dni/nif
     */
    public Jugador(int idJugador, String nombre, String primerApellido, String dniNif) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.dniNif = dniNif;
    }

    // Getters & Setters
    // Getters

    /**
     * Getter del id
     * 
     * @return id del jugador
     */
    public int getIdJugador() {
        return idJugador;
    }

    /**
     * Getter del nombre
     * 
     * @return nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del primer apellido
     * 
     * @return primer apellido del jugador
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Getter del dni/nif
     * 
     * @return dni/nif del jugador
     */
    public String getDniNif() {
        return dniNif;
    }

    /**
     * Getter del equipo
     * 
     * @return equipo al que pertenece el jugador
     */
    public Equipo getEquipo() {
        return equipo;
    }

    // Setters

    /**
     * Setter del id
     * 
     * @param idJugador nuevo id del jugador
     */
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    /**
     * Setter del nombre
     * 
     * @param nombre nuevo nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del primer apellido
     * 
     * @param primerApellido nuevo primer apellido del jugador
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Setter del dni/nif
     * 
     * @param dniNif nuevo dni/nif del jugador
     */
    public void setDniNif(String dniNif) {
        this.dniNif = dniNif;
    }

    /**
     * Setter del equipo
     * 
     * @param equipo nuevo equipo del jugador
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * toString para mostrar la información del jugador
     */
    @Override
    public String toString() {
        return String.format("Jugador %d - %s %s (DNI: %s)",
                idJugador, nombre, primerApellido, dniNif);
    }
}