package edu.masanz.da.lmgi;

public class Juego {

    private final int MAX = 10;

    private Terminal t;

    private Partida partida;

    public Juego() {
        t = new Terminal();
    }

    public void empezar() {

        t.escribeTitulo("Risk_2x2_xml");

        String nombreJugador1 = t.leeTexto("Nombre del jugador 1");
        Jugador jugador1 = new Jugador(1, nombreJugador1);
        String nombreJugador2 = t.leeTexto("Nombre del jugador 2");
        Jugador jugador2 = new Jugador(2, nombreJugador2);
        Jugadores jugadores = new Jugadores(jugador1, jugador2);
        t.escribeLinea();
        t.escribeLinea("Cuando se te pida un barrio escribe su nombre, ej:" );
        t.escribeLinea("Buztintxuri, Arrosadia, Txantrea, Iturrama, ..." );
        t.escribeLinea();
        t.escribeLinea("Se deben distribuir hasta 7 ejercitos en 2 barrios");
        t.escribeLinea();
        Mapa mapa = new Mapa();
        String nombreTerritorio1 = t.leeTexto(nombreJugador1 + ", elige barrio");
        int ejercitosTerritorio1 = t.leeNumero("Ejércitos en " + nombreTerritorio1);
        mapa.add(new Territorio(nombreTerritorio1, 1, ejercitosTerritorio1));
        String nombreTerritorio2 = t.leeTexto(nombreJugador2 + ", elige barrio");
        int ejercitosTerritorio2 = t.leeNumero("Ejércitos en " + nombreTerritorio2);
        mapa.add(new Territorio(nombreTerritorio2, 2, ejercitosTerritorio2));
        String nombreTerritorio3 = t.leeTexto(nombreJugador1 + ", elige barrio");
        int ejercitosTerritorio3 = t.leeNumero("Ejércitos en " + nombreTerritorio3);
        mapa.add(new Territorio(nombreTerritorio3, 1, ejercitosTerritorio3));
        String nombreTerritorio4 = t.leeTexto(nombreJugador2 + ", elige barrio");
        int ejercitosTerritorio4 = t.leeNumero("Ejércitos en " + nombreTerritorio4);
        mapa.add(new Territorio(nombreTerritorio4, 2, ejercitosTerritorio4));
        t.escribeLinea();
        t.pintaMapa(mapa, jugadores);

        partida = new Partida(jugadores, mapa);

    }

    public void jugar(int numJugada) {

        if (numJugada > MAX || partida.estaTerminada()) {
            return;
        }

        String nombreTerritorioAtacante, nombreTerritorioDefensor;
        Tirada tirada;
        int idJugador = numJugada % 2 == 1 ? 1 : 2;
        String nombreJugador = partida.getJugador(idJugador).getNombre();

        Mapa mapa = partida.getMapa();
        Jugadores jugadores = partida.getJugadores();

        nombreTerritorioAtacante = t.leeTexto(nombreJugador + ", elige barrio atacante");
        nombreTerritorioDefensor = t.leeTexto(nombreJugador + ", elige barrio que atacar");
        tirada = partida.ataca(nombreTerritorioAtacante, nombreTerritorioDefensor);
        t.escribeLinea(tirada.toString());
        t.pintaMapa(mapa, jugadores);

        jugar(numJugada + 1);
    }

    public void terminar() {
        t.escribeLinea();
        t.escribeLinea("El juego ha terminado");
        int n = partida.cuantosAtaques();
        t.escribeLinea();
        t.escribeLinea("Se han jugado " + n + " jugadas");
        t.escribeLinea();
        String nombreJugador1 = partida.getJugador(1).getNombre();
        String nombreJugador2 = partida.getJugador(2).getNombre();
        int n1 = partida.cuantosTerritoriosSonDe(1);
        int n2 = partida.cuantosTerritoriosSonDe(2);
        t.escribeLinea(nombreJugador1 + " tiene " + n1 + " territorios.");
        t.escribeLinea(nombreJugador2 + " tiene " + n2 + " territorios.");
        t.escribeLinea();
        t.escribeTitulo("PEACE");

        t.escribeLinea();
        t.escribeLinea(partida.toXml());
    }

}