package edu.masanz.da.lmgi;

public class Jugadas {

    private int contador;
    private Ataque ataque1;
    private Ataque ataque2;
    private Ataque ataque3;
    private Ataque ataque4;
    private Ataque ataque5;
    private Ataque ataque6;
    private Ataque ataque7;
    private Ataque ataque8;
    private Ataque ataque9;
    private Ataque ataque10;


    /**
     * Método que añade un ataque a la lista de ataques.
     * Dependiendo del valor del contador, se añade a una variable u otra.
     * El contador se incrementa en 1 cada vez que se añade un ataque.
     * Sólo puede haber hasta 10 ataques.
     * @param ataque Ataque a añadir
     */
    public void addAtaque(Ataque ataque) {
        // TODO: addAtaque
    }

    /**
     * Devuelve el número de ataques realizados
     * @return Número de ataques realizados
     */
    public int cuantosAtaques() {
        // TODO: cuantosAtaques
        return 0;
    }

    /**
     * Devuelve la representación en XML de las jugadas
     * @return String con el XML de las jugadas
     */
    public String toXml() {
        String s = "";
        // TODO: toXml
        return s;
    }

    public static void main(String[] args) {
        Territorio t1 = new Territorio("Buztintxuri", 1, 4);
        Territorio t2 = new Territorio("Arrosadia", 2, 3);
        Jugadas jugadas = new Jugadas();
        Ataque a1 = new Ataque(t1, t2);
        Tirada tirada = a1.ataca();
        jugadas.addAtaque(a1);

        System.out.println(jugadas.toXml());

        System.out.println(tirada);
    }
}
