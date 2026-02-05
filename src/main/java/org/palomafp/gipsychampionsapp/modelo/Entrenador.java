package org.palomafp.gipsychampionsapp.modelo;

public class Entrenador {
    private int idEntrenador;
    private String nombre;
    private String primerApellido;
    private String dniNif;
    private Equipo equipo;

    public Entrenador(int idEntrenador, String nombre, String primerApellido, String dniNif) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.dniNif = dniNif;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
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
        String equipoInfo = (equipo != null) ? ("id=" + equipo.getIdEquipo() + ", nombre=" + equipo.getNombre()) : "null";
        return "Entrenador{id=" + idEntrenador + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", dniNif=" + dniNif + ", equipo=[" + equipoInfo + "]}";
    }
}