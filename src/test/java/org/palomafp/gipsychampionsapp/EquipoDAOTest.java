package org.palomafp.gipsychampionsapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.palomafp.gipsychampionsapp.modelo.Equipo;

/**
 * Clase que hará las pruebas de la clase EquipoDAO
 */
public class EquipoDAOTest {

    /**
     * Caso de prueba que se encargará de comprobar que el método getEquipoAleatorio
     * funciona correctamente, realizando comprobaciones con el array que forma
     * parte de la instancia EquipoDAO,
     * comprueba que el equipo forme parte del array, que el id del equipo no sea
     * null y que el entrenador del equipo tampoco sea null.
     */
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

    /**
     * Caso de prueba que prueba el indice 0 de la instancia de EquipoDAO,
     * comprueba que no sea nulo, que el nombre concuerde con el establecido en la
     * clase y que el entrenador sea el mismo que el establecido en la clase.
     */
    @Test
    public void testGetEquipoPorIndiceCero() {
        EquipoDAO equipoDao = new EquipoDAO();
        Equipo equipoCero = equipoDao.getEquipoPorIndice(0);

        assertNotNull(equipoCero);
        assertEquals("Real Vardrid", equipoCero.getNombre());
        assertNotNull(equipoCero.getEntrenador(), "El entrenador no es correcto");
    }

    /**
     * Caso de prueba que prueba el indice final de la instancia de EquipoDAO,
     * comprueba que no sea nulo, que el nombre concuerde con el establecido en la
     * clase y que el entrenador sea el mismo que el establecido en la clase.
     */
    @Test
    public void testGetEquipoPorIndiceFinal() {
        EquipoDAO equipoDao = new EquipoDAO();
        Equipo equipoFinal = equipoDao.getEquipoPorIndice(3);
        assertNotNull(equipoFinal);
        assertEquals("Los Morrocotudos", equipoFinal.getNombre());
        assertNotNull(equipoFinal.getEntrenador(), "El entrenador no es correcto");
    }

    /**
     * Caso de prueba que prueba el arraylist de la instancia de EquipoDAO,
     * prueba que el tamaño del array después de hacer la instancia de la clase sea
     * de 4, que el nombre del entrenador del equipo en la posición 0 concuerde con
     * el que debería, y que el nombre del jugador del equipo con posición 0 en el
     * array concuerde con el que debería.
     */
    @Test
    public void testGetArrayList() {
        EquipoDAO equipoDao = new EquipoDAO();
        ArrayList<Equipo> equipos = equipoDao.getAllEquipos();
        assertEquals(4, equipos.size());
        assertTrue(equipos.get(0).getEntrenador().getNombre().equals("Chavi"),
                "El entrenador del equipo 0 no se ha determinado correctamente");
        assertTrue(equipos.get(3).getJugadores().get(6).getNombre().equals("Sandofoca"),
                "El jugador con id 6 del equipo con id 3 no es Sandofoca, por lo que es incorrecto.");
    }

    /**
     * Caso de prueba que prueba la adición de equipos
     * prueba a añadir un equipo cuando el id de este ya está siendo usado y prueba
     * añadir un equipo cuando el id de este está libre.
     */
    @Test
    public void testAddEquipoEquipo() {
        EquipoDAO equipoDao = new EquipoDAO();
        assertFalse(equipoDao.addEquipo(0, null, null), "El equipo con id 0 no debería ser nulo.");
        assertTrue(equipoDao.addEquipo(8, "FCBarcelona", "Barcelona"));
    }
}
