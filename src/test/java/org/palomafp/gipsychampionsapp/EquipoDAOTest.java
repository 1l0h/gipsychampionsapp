package org.palomafp.gipsychampionsapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void testGetEquipoPorIndice() {
        EquipoDAO equipoDao = new EquipoDAO();
        assertEquals(equipoDao.getEquipoPorIndice(0), equipoDao.getEquipoPorIndice(0));
    }

    @Test
    public void testGetArrayList() {
        EquipoDAO equipoDao = new EquipoDAO();
        assertTrue(equipoDao.getArrayList().size() > 1);
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
