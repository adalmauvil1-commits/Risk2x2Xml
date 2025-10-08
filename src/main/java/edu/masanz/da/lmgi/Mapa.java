package edu.masanz.da.lmgi;

public class Mapa {
    private Territorio t1;
    private Territorio t2;
    private Territorio t3;
    private Territorio t4;

    /**
     * Devuelve el número de territorios que contiene el mapa.
     * Inicialmente es 0 y puede llegar a 4.
     * @return Número de territorios (0 a 4)
     */
    public int getNumeroTerritorios() {
        int n = 0;
        // TODO: getNumeroTerritorios
        return n;
    }

    /**
     * Añade un territorio al mapa. Si ya hay 4 territorios, no hace nada.
     * @param t Territorio a añadir
     */
    public void add(Territorio t) {
        // TODO: add
    }

    /**
     * Devuelve el territorio indicado por su número (1 a 4).
     * Si el número no es válido, devuelve null.<br/>
     * Utiliza un switch.
     * @param num Número del territorio (1 a 4)
     * @return Territorio o null si no existe
     */
    public Territorio getTerritorio(int num) {
        // TODO: getTerritorio(num)
        return null;
    }

    /**
     * Devuelve el territorio indicado por su nombre (ignora mayúsculas/minúsculas).<br/>
     * Si no existe, devuelve null.<br/>
     * @param nombre Nombre del territorio
     * @return Territorio o null si no existe
     */
    public Territorio getTerritorio(String nombre) {
        // TODO: getTerritorio(nombre)
        return null;
    }

    /**
     * Devuelve la representación en XML del mapa y sus territorios.
     * @return String con el XML del mapa
     */
    public String toXml() {
        String s = "";
        // TODO: toXml
        s += "";
        return s;
    }

    public static void main(String[] args) {
        Mapa m = new Mapa();
        m.add(new Territorio("Buztintxuri", 1, 4));
        m.add(new Territorio("Arrosadia", 2, 3));
        m.add(new Territorio("Txantrea", 1, 3));
        m.add(new Territorio("Iturrama", 2, 4));
        String xml = m.toXml();
        System.out.println(xml);
    }

}
