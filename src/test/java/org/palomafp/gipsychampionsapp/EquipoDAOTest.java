package org.palomafp.gipsychampionsapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.palomafp.gipsychampionsapp.modelo.Equipo;

public class EquipoDAOTest {
    
    @Test
    public void testGetEquipoDemo() {
        EquipoDAO dao = new EquipoDAO();
        Equipo equipo = dao.getEquipoDemo();
        assertTrue(equipo != null);
    }
}
