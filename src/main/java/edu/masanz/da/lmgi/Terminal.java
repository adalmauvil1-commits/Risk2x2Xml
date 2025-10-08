package edu.masanz.da.lmgi;

import java.util.Scanner;

public class Terminal {

    private Scanner scanner;

    public Terminal() {
        scanner = new Scanner(System.in);
    }

    public void escribeTitulo(String titulo) {
        System.out.println();
        System.out.println("#".repeat(33));
        System.out.println("#" + centrado(titulo,31) + "#");
        System.out.println("#".repeat(33));
        System.out.println();
    }

    public void escribeLinea() {
        System.out.println();
    }

    public void escribeLinea(String txt) {
        System.out.println(txt);
    }

    public String leeTexto(String mensaje) {
        System.out.print(mensaje + ": ");
        String s = scanner.nextLine();
        return s;
    }

    public int leeNumero(String mensaje) {
        System.out.print(mensaje + ": ");
        int n = Integer.parseInt(scanner.nextLine());
        return n;
    }

    public void pintaMapa(String s11, String s12, String s21, String s22) {
        System.out.printf("%c%s%c\n", '\u23A1' ,"\u2015".repeat(31),'\u23A4');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(s11,15),'\u23A2',centrado(s12,15),'\u23A2');
        System.out.printf("%c%s%c\n", '\u23A2' ,"\u2015".repeat(31),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(s21,15),'\u23A2',centrado(s22,15),'\u23A2');
        System.out.printf("%c%s%c\n", '\u23A3' ,"\u2015".repeat(31),'\u23A6');
        System.out.println();
    }

    public void pintaMapa(Mapa mapa, Jugadores jugadores) {
        String nombreTerritorio1 = mapa.getTerritorio(1).getNombre();
        String nombreTerritorio2 = mapa.getTerritorio(2).getNombre();
        String nombreTerritorio3 = mapa.getTerritorio(3).getNombre();
        String nombreTerritorio4 = mapa.getTerritorio(4).getNombre();
        int idJugadorTerritorio1 = mapa.getTerritorio(1).getPropietario();
        int idJugadorTerritorio2 = mapa.getTerritorio(2).getPropietario();
        int idJugadorTerritorio3 = mapa.getTerritorio(3).getPropietario();
        int idJugadorTerritorio4 = mapa.getTerritorio(4).getPropietario();
        String nombreJugador1 = jugadores.getJugador(idJugadorTerritorio1).getNombre();
        String nombreJugador2 = jugadores.getJugador(idJugadorTerritorio2).getNombre();
        String nombreJugador3 = jugadores.getJugador(idJugadorTerritorio3).getNombre();
        String nombreJugador4 = jugadores.getJugador(idJugadorTerritorio4).getNombre();
        int ejercitosTerritorio1 = mapa.getTerritorio(1).getEjercitos();
        int ejercitosTerritorio2 = mapa.getTerritorio(2).getEjercitos();
        int ejercitosTerritorio3 = mapa.getTerritorio(3).getEjercitos();
        int ejercitosTerritorio4 = mapa.getTerritorio(4).getEjercitos();

        System.out.printf("%c%s%c\n", '\u23A1' ,"\u2015".repeat(31),'\u23A4');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(nombreTerritorio1,15),'\u23A2',centrado(nombreTerritorio2,15),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(nombreJugador1,15),'\u23A2',centrado(nombreJugador2,15),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(ejercitosTerritorio1,15),'\u23A2',centrado(ejercitosTerritorio2,15),'\u23A2');

        System.out.printf("%c%s%c\n", '\u23A2' ,"\u2015".repeat(31),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(nombreTerritorio3,15),'\u23A2',centrado(nombreTerritorio4,15),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(nombreJugador3,15),'\u23A2',centrado(nombreJugador4,15),'\u23A2');
        System.out.printf("%c%s%c%s%c\n", '\u23A2',centrado(ejercitosTerritorio3,15),'\u23A2',centrado(ejercitosTerritorio4,15),'\u23A2');

        System.out.printf("%c%s%c\n", '\u23A3' ,"\u2015".repeat(31),'\u23A6');
        System.out.println();
    }

    private String centrado(String txt, int n) {
        String s = "";
        int t = txt.length();
        if (t > n - 2) {
            s += " " + txt.substring(0, n-2) + " ";
        }else {
            int t1 = (n - t) / 2;
            int t2 = n - t - t1;
            s += " ".repeat(t1) + txt + " ".repeat(t2);
        }
        return s;
    }

    private String centrado(int num, int n) {
        return centrado(num + "", n);
    }

    public static void main(String[] args) {
        Terminal terminal = new Terminal();

        terminal.escribeTitulo("Risk_2x2_xml");

        terminal.pintaMapa("Buztintxuri","Arrosadia","Txantrea","Iturrama");

        Jugador j1 = new Jugador(1, "Mikel");
        Jugador j2 = new Jugador(2, "Laura");
        Jugadores jugadores = new Jugadores(j1, j2);
        Mapa mapa = new Mapa();
        mapa.add(new Territorio("Buztintxuri", 1, 4));
        mapa.add(new Territorio("Arrosadia", 2, 3));
        mapa.add(new Territorio("Txantrea", 1, 3));
        mapa.add(new Territorio("Iturrama", 2, 4));
        terminal.pintaMapa(mapa, jugadores);
    }

}
