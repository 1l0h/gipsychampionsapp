package org.palomafp.gipsychampionsapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class EquipoDAOTest {

    @Test
    public void testGetEquipoAleatorio() {
        EquipoDAO equipoDAO = new EquipoDAO();
        Equipo equipoAleatorio = equipoDAO.getEquipoAleatorio();
        assertTrue(equipoDAO.getArrayList().contains(equipoAleatorio));
    }

    @Test
    public void addEquipo(){
        EquipoDAO equipoDAO = new EquipoDAO();
        ArrayList<Equipo> listaEquipo = new ArrayList<>();
        boolean estaDisponible = true;

        for (int i = 0; i < listaEquipo.size(); i++) {
            if (listaEquipo.get(i).getIdEquipo() == idEquipo.) {
                estaDisponible = false;
            }
    }

    
}

