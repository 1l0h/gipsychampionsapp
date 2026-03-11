package org.palomafp.gipsychampionsapp.modelo;

/**
 * Clase que representa el estadio de un equipo
 * @author Sandoval y Lobato
 */
public class Estadio {

    // Atributos
    // Entero que representa su id
    private int idEstadio;

    // String que representa su nombre
    private String nombre;

    // String que representa su dirección
    private String direccion;

    // Equipo al que pertenece
    private Equipo equipo;

    /**
     * Constructor para instanciar un estadio con todos sus atributos
     * 
     * @param idEstadio entero con su id
     * @param nombre    string con su nombre
     * @param direccion string con su dirección
     */
    public Estadio(int idEstadio, String nombre, String direccion) {
        this.idEstadio = idEstadio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters & Setters
    // Getters

    /**
     * Getter del id
     * 
     * @return id del estadio
     */
    public int getIdEstadio() {
        return idEstadio;
    }

    /**
     * Getter del nombre
     * 
     * @return nombre del estadio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la dirección
     * 
     * @return dirección del estadio
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Getter del equipo
     * 
     * @return equipo al que pertenece el estadio
     */
    public Equipo getEquipo() {
        return equipo;
    }

    // Setters

    /**
     * Setter del id
     * 
     * @param idEstadio nuevo id del estadio
     */
    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    /**
     * Setter del nombre
     * 
     * @param nombre nuevo nombre del estadio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de la dirección
     * 
     * @param direccion nueva dirección del estadio
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Setter del equipo
     * 
     * @param equipo nuevo equipo al que pertenece el estadio
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * to String sobreescrito para mostrar la información del estadio de forma clara
     * y estructurada
     * incluyendo la información del equipo al que pertenece
     */
    @Override
    public String toString() {
        String equipoInfo = (equipo != null) ? ("id=" + equipo.getIdEquipo() + ", nombre=" + equipo.getNombre())
                : "null";
        return "Estadio{id=" + idEstadio + ", nombre=" + nombre + ", direccion=" + direccion + ", equipo=[" + equipoInfo
                + "]}";
    }
}