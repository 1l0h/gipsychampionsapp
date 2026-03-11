package org.palomafp.gipsychampionsapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class EquipoDAOTest {

    @Test
    public void testGetEquipoAleatorio() {
        EquipoDAO equipoDAO = new EquipoDAO();
        Equipo equipoAleatorio = equipoDAO.getEquipoAleatorio();
        assertTrue(equipoDAO.getAllEquipos().contains(equipoAleatorio),
                "El equipo no forma parte de la lista de equipos");
        assertNotNull(equipoAleatorio, "El equipo no debería ser una posición vacía");
        assertNotNull(equipoAleatorio.getIdEquipo(), "El equipo debe tener un id");
        assertTrue(equipoAleatorio.getEntrenador() != null, "El equipo debe tener un entrenador");
    }

    @Test
    public void testGetEquipoPorIndiceCero() {
        EquipoDAO equipoDao = new EquipoDAO();
        Equipo equipoCero = equipoDao.getEquipoPorIndice(0);

        assertNotNull(equipoCero);
        assertEquals("Real Vardrid", equipoCero.getNombre());
        assertNotNull(equipoCero.getEntrenador(), "El entrenador no es correcto");
    }

    @Test
    public void testGetEquipoPorIndiceFinal() {
        EquipoDAO equipoDao = new EquipoDAO();
        Equipo equipoFinal = equipoDao.getEquipoPorIndice(3);

        assertNotNull(equipoFinal);
        assertEquals("Los Morrocotudos", equipoFinal.getNombre());
        assertNotNull(equipoFinal.getEntrenador(), "El entrenador no es correcto");
    }

    @Test
    public void testGetArrayList() {
        EquipoDAO equipoDao = new EquipoDAO();
        ArrayList<Equipo> equipos = equipoDao.getAllEquipos();
        assertEquals(4, equipos.size());
    }

    @Test
    public void testAddEquipoEquipoExistente() {
        EquipoDAO equipoDao = new EquipoDAO();
        assertFalse(equipoDao.addEquipo(0, null, null));
    }

    @Test
    public void testAddEquipoEquipoNoExistente() {
        EquipoDAO equipoDao = new EquipoDAO();
        assertTrue(equipoDao.addEquipo(8, "FCBarcelona", "Barcelona"));
    }
}
