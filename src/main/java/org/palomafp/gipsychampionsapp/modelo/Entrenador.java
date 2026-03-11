package org.palomafp.gipsychampionsapp.modelo;

/**
 * Clase que representa el entrenador de un equipo
 * @author Sandoval y Lobato
 */
public class Entrenador {

    // Atributos
    // Entero que representa su id
    private int idEntrenador;

    // String que representa su nombre
    private String nombre;

    // String que representa su primer y único apellido
    private String primerApellido;

    // String con su dni/nif
    private String dniNif;

    // Equipo al que pertenece
    private Equipo equipo;

    /**
     * Constructor para instanciar un entrenador con todos sus atributos
     * 
     * @param idEntrenador   entero con su id
     * @param nombre         string con su nombre
     * @param primerApellido string con su primer apellido
     * @param dniNif         string con su dni/nif
     */
    public Entrenador(int idEntrenador, String nombre, String primerApellido, String dniNif) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.dniNif = dniNif;
    }

    // Getters & Setters
    // Getters

    /**
     * Getter del id
     * 
     * @return id del entrenador
     */
    public int getIdEntrenador() {
        return idEntrenador;
    }

    /**
     * Getter del nombre
     * 
     * @return nombre del entrenador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del apellido
     * 
     * @return apellido del entrenador
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Getter del dni/nif
     * 
     * @return dni/nif del entrenador
     */
    public String getDniNif() {
        return dniNif;
    }

    /**
     * Getter del equipo al que entrena
     * 
     * @return equipo del entrenador
     */
    public Equipo getEquipo() {
        return equipo;
    }

    // Setters
    /**
     * Setter del id
     * 
     * @param idEntrenador a atribuir para el entrenador
     */
    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    /**
     * Setter del nombre
     * 
     * @param nombre para atribuirle al entrenador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del apellido
     * 
     * @param primerApellido para atribuirle al entrenador
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Setter del dni
     * 
     * @param dniNif para atribuirle al entrenador
     */
    public void setDniNif(String dniNif) {
        this.dniNif = dniNif;
    }

    /**
     * Setter del equipo
     * 
     * @param equipo para atribuirle al entrenador
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * to String sobreescrito para mostrar la información del entrenador
     */
    @Override
    public String toString() {
        String equipoInfo = (equipo != null) ? ("id=" + equipo.getIdEquipo() + ", nombre=" + equipo.getNombre())
                : "null";
        return "Entrenador{id=" + idEntrenador + ", nombre=" + nombre + ", primerApellido=" + primerApellido
                + ", dniNif=" + dniNif + ", equipo=[" + equipoInfo + "]}";
    }
}