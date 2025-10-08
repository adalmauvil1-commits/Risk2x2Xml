package edu.masanz.da.lmgi;

public class Jugadores {

    private Jugador jugador1;

    private Jugador jugador2;

    /**
     * Crea un objeto Jugadores con dos jugadores
     * @param player1 Jugador 1
     * @param player2 Jugador 2
     */
    public Jugadores(Jugador player1, Jugador player2) {
        // TODO: Jugadores
    }

    /**
     * Asigna un jugador a la posición indicada (jugador1 o jugador2)
     * @param pos Posición del jugador (1 o 2)
     * @param jugador Jugador a asignar
     */
    public void setJugador(int pos, Jugador jugador) {
        // TODO: setJugador
    }

    /**
     * Devuelve el jugador indicado por su id
     * @param id Id del jugador a buscar
     * @return Jugador o null si no existe
     */
    public Jugador getJugador(int id) {
        // TODO: getJugador
        return null;
    }

    /**
     * Devuelve la representación en XML de los jugadores
     * @return String con el XML de los jugadores
     */
    public String toXml() {
        String s = "";
        // TODO: toXml
        return s;
    }

    public static void main(String[] args) {
        Jugador j1 = new Jugador(1, "Mikel");
        Jugador j2 = new Jugador(2, "Laura");
        Jugadores js = new Jugadores(j1, j2);
        System.out.println(js.toXml());
    }

}
