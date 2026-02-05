package org.palomafp.gipsychampionsapp.modelo;

public class Estadio {
    private int idEstadio;
    private String nombre;
    private String direccion;
    private Equipo equipo;

    public Estadio(int idEstadio, String nombre, String direccion) {
        this.idEstadio = idEstadio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        return "Estadio{id=" + idEstadio + ", nombre=" + nombre + ", direccion=" + direccion + ", equipo=[" + equipoInfo + "]}";
    }
}