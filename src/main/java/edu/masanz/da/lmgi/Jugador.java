package edu.masanz.da.lmgi;

public class Jugador {

    private int id;
    private String nombre;

    /**
     * Constructor que crea un jugador con un id y un nombre
     * @param id Identificador del jugador
     * @param nombre Nombre del jugador
     */
    public Jugador(int id, String nombre) {
        // TODO: Jugador
        this.id = id;
        this.nombre = nombre;
    }

    // region getters y setters
    public int getId(){
        // TODO: getId
        return 0;
    }

    public String getNombre() {
        // TODO: getNombre
        return nombre;
    }
    // endregion

    /**
     * Devuelve la representación en XML del jugador
     * @return String con el XML del jugador
     */
    public String toXml() {
        // TODO: toXml
        return "";
    }

    public static void main(String[] args) {
        Jugador j = new Jugador(1, "Mikel");
        System.out.println(j.toXml());
    }

}
