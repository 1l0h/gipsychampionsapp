package org.palomafp.gipsychampionsapp;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.gipsychampionsapp.modelo.Entrenador;
import org.palomafp.gipsychampionsapp.modelo.Equipo;
import org.palomafp.gipsychampionsapp.modelo.Estadio;
import org.palomafp.gipsychampionsapp.modelo.Jugador;

/**
 * Creación de la clase del objeto de acceso a datos
 * 
 * @author Sandoval y Lobato
 */
public class EquipoDAO {
    // Arraylist privado que almacenará los equipos.
    private ArrayList<Equipo> listaEquipo = new ArrayList<Equipo>();

    /**
     * Constructor por defecto sin parámetros para la instancia creada de la clase.
     */
    public EquipoDAO() {
        // Creación Real Vardrid
        // creamos el equipo instanciando todas las clases necesarias para este y para
        // rellenarlo.
        // creamos un arraylist para almacenar a los jugadores del equipo.
        // añadimos el equipo al arraylist de la clase
        listaEquipo.add(new Equipo(0, "Real Vardrid", "Madrid"));
        Entrenador entrenador1 = new Entrenador(0, "Chavi", "San Ildefonso", "papoi");
        Estadio estadio1 = new Estadio(0, "Anchoneu", "Chamartín");
        List<Jugador> listaJugadores1 = new ArrayList<Jugador>();
        listaJugadores1.add(new Jugador(0, "La Falete", "Prime", "No lo ha renovado"));
        listaJugadores1.add(new Jugador(1, "El Fary", "Peak", "Tampoco lo ha renovado"));
        listaEquipo.get(0).setEntrenador(entrenador1);
        listaEquipo.get(0).setEstadio(estadio1);
        listaEquipo.get(0).setJugadores(listaJugadores1);

        // Creación Varcelona
        // creamos el equipo instanciando todas las clases necesarias para este y para
        // rellenarlo.
        // creamos un arraylist para almacenar a los jugadores del equipo.
        // añadimos el equipo al arraylist de la clase
        listaEquipo.add(new Equipo(1, "Varcelona", "Barcelona"));
        Entrenador entrenador2 = new Entrenador(1, "Jansi", "Musty Flick", "Alemán");
        Estadio estadio2 = new Estadio(1, "Campo nuevo", "Rocafonda 304");
        List<Jugador> listaJugadores2 = new ArrayList<Jugador>();
        listaJugadores2.add(new Jugador(2, "LewanWisky", "El Polaco", "Retenido en la aduana"));
        listaJugadores2.add(new Jugador(3, "Garrapiña", "El Brazuca", "No lo tiene todavia"));
        listaEquipo.get(1).setEntrenador(entrenador2);
        listaEquipo.get(1).setEstadio(estadio2);
        listaEquipo.get(1).setJugadores(listaJugadores2);

        // Creación Patético de Madrid
        // creamos el equipo instanciando todas las clases necesarias para este y para
        // rellenarlo.
        // creamos un arraylist para almacenar a los jugadores del equipo.
        // añadimos el equipo al arraylist de la clase
        listaEquipo.add(new Equipo(2, "Patético de Madrid", "Madrid"));
        Entrenador entrenador3 = new Entrenador(2, "Chulo", "Sin peones", "Mate");
        Estadio estadio3 = new Estadio(2, "Estadio Napolitano", "Canillejas Mierda");
        List<Jugador> listaJugadores3 = new ArrayList<Jugador>();
        listaJugadores3.add(new Jugador(4, "Jr", "Sin peones", "Nacido en España"));
        listaJugadores3.add(new Jugador(5, "Slakoth", "alto", "Del mismo país que el rubius"));
        listaEquipo.get(2).setEntrenador(entrenador3);
        listaEquipo.get(2).setEstadio(estadio3);
        listaEquipo.get(2).setJugadores(listaJugadores3);

        // Creación Los Morrocotudos
        // creamos el equipo instanciando todas las clases necesarias para este y para
        // rellenarlo.
        // creamos un arraylist para almacenar a los jugadores del equipo.
        // añadimos el equipo al arraylist de la clase
        listaEquipo.add(new Equipo(3, "Los Morrocotudos", "Distrito San Blas-Canillejas-Ciudad Lineal"));
        Entrenador entrenador4 = new Entrenador(3, "MariCarmen", "No me acuerdo", "72839163A");
        Estadio estadio4 = new Estadio(3, "Patio La Paloma", "IES Virgen de la Paloma");
        List<Jugador> listaJugadores4 = new ArrayList<Jugador>();
        listaJugadores4.add(new Jugador(6, "Sandofoca", "Adrián", "Lo ha perdido"));
        listaJugadores4.add(new Jugador(7, "Iñaki", "Papá", "También lo ha perdido"));
        listaJugadores4.add(new Jugador(8, "Hanser", "nose", "Todavía no lo tiene"));
        listaJugadores4.add(new Jugador(9, "Samuel", "Del Monte", "Se le ha perdido en la nieve"));
        listaEquipo.get(3).setEntrenador(entrenador4);
        listaEquipo.get(3).setEstadio(estadio4);
        listaEquipo.get(3).setJugadores(listaJugadores4);
    }

    /**
     * Método que devolverá el equipo ubicado en el índice especificado del
     * arraylist
     * 
     * @param indice Posición del arraylist sobre el que queremos el equipo
     * @return Objeto de la clase Equipo posicionado en el indice introducido
     */
    public Equipo getEquipoPorIndice(int indice) {
        return listaEquipo.get(indice);
    }

    /**
     * Método para obtener la lista de los equipos del objeto
     * 
     * @return Arraylist con los objetos creados anteriormente con el constructor
     */
    public ArrayList<Equipo> getAllEquipos() {
        return listaEquipo;
    }

    /**
     * Método para obtener un objeto de la clase Equipo aleatorio
     * 
     * @return Objeto de la clase Equipo obtenido aleatoriamente desde el arraylist
     *         de la clase
     */
    public Equipo getEquipoAleatorio() {
        return listaEquipo.get((int) Math.random() * (listaEquipo.size() - 1) + 0);
    }

    /**
     * Método para añadir un nuevo equipo al objeto. Comprueba que el id del equipo
     * esté disponible antes de añadirlo. En caso de que este no lo estuviese, no lo
     * añadirá.
     * 
     * @param idEquipo     Id del equipo a añadir
     * @param nombreEquipo Nombre del equipo a añadir
     * @param ciudadEquipo Ciudad del equipo a añadir
     * @return boolean que indicará true en caso de haber podido añadir el equipo o
     *         false en caso de que no.
     */
    public boolean addEquipo(int idEquipo, String nombreEquipo, String ciudadEquipo) {
        // Boolean para indicar si el id está disponible
        boolean estaDisponible = true;
        // bucle que recorre el array de los equipos buscando un equipo con el mismo id
        // que el que se quiere añadir
        for (int i = 0; i < listaEquipo.size(); i++) {
            if (listaEquipo.get(i).getIdEquipo() == idEquipo) {
                // Si hay un equipo con el mismo id, establece el estado de la variable boolean
                // como false.
                estaDisponible = false;
            }
        }
        // condicional que comprueba si el id está disponible.
        if (estaDisponible == true) {
            // añade el equipo al array en caso de estar disponible el id
            listaEquipo.add(new Equipo(idEquipo, nombreEquipo, ciudadEquipo));
        }
        return estaDisponible;
    }
}