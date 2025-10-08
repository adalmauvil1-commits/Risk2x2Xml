package edu.masanz.da.lmgi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partida {

    private String fecha;
    private String horaIni;
    private String horaFin;

    private Jugadores jugadores;
    private Mapa mapa;
    private Jugadas jugadas;
    private String mapaIniXml;


    /**
     * Constructor que crea una partida que inicializa los atributos.
     * @param players
     * @param map
     */
    public Partida(Jugadores players, Mapa map) {
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        // TODO: Partida
    }

    // region getters y setters
    public Jugador getJugador(int id) {
        // TODO: getJugador
        return null;
    }

    public Mapa getMapa() {
        // TODO: getMapa
        return null;
    }

    public Jugadores getJugadores() {
        // TODO: getJugadores
        return null;
    }
    // endregion

    /**
     * Realiza un ataque entre dos territorios y devuelve la tirada resultante.
     * Añade el ataque a las jugadas de la partida.
     * @param nombreTerritorioAtacante Nombre del territorio atacante
     * @param nombreTerritorioDefensor Nombre del territorio defensor
     * @return Tirada resultante del ataque. Ej. <br/>
     * [5] [4] [3] <br/>
     * [6] [2] <br/>
     */
    public Tirada ataca(String nombreTerritorioAtacante, String nombreTerritorioDefensor) {
        // TODO: ataca
        return null;
    }

    /**
     * Indica si la partida ha terminado.
     * Si un jugador tiene todos los territorios, la partida ha terminado.
     * @return true si la partida ha terminado, false en caso contrario.
     */
    public boolean estaTerminada() {
        // TODO: estaTerminada
        return false;
    }

    /**
     * Cuenta cuántos territorios son de un jugador.
     * @param idJugador Id del jugador
     * @return
     */
    public int cuantosTerritoriosSonDe(int idJugador) {
        int n = 0;
        // TODO: cuantosTerritoriosSonDe
        return n;
    }

    /**
     * Devuelve el número de ataques realizados en la partida.
     * @return Número de ataques realizados en la partida.
     */
    public int cuantosAtaques() {
        // TODO: cuantosAtaques
        return 0;
    }

    /**
     * Devuelve la representación en XML de la partida.
     * @return String con la representación en XML de la partida.
     */
    public String toXml() {
        LocalTime ahora = LocalTime.now();
        horaFin = ahora.toString();
        String s = "<?xml version='1.0' encoding='UTF-8' ?>";
        // TODO: toXml
        return s;
    }

}
