package edu.masanz.da.lmgi;

public class Territorio {

    private String nombre;
    private int propietario;
    private int ejercitos;

    /**
     * Constructor que crea un territorio con un nombre, sin propietario y sin ejércitos
     * @param nombre Del territorio
     */
    public Territorio(String nombre) {
        // TODO: Territorio(nombre)
    }

    /**
     * Constructor que crea un territorio con un nombre, un propietario y un número de ejércitos
     * @param nombre Del territorio
     * @param propietario Id del jugador propietario del territorio
     * @param ejercitos Número de ejércitos en el territorio
     */
    public Territorio(String nombre, int propietario, int ejercitos) {
        // TODO: Territorio(nombre,propietario,ejercitos)
    }

    // region getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public int getEjercitos() {
        return ejercitos;
    }

    public void setEjercitos(int ejercitos) {
        this.ejercitos = ejercitos;
    }

    // endregion

    /**
     * Resta n ejércitos al territorio de forma que
     * no pueda quedar con un número negativo de ejércitos
     * @param n Número de ejércitos a restar
     */
    public void pierdeEjercitos(int n) {
        // TODO: pierdeEjercitos
    }

    /**
     * Comprobación de si el territorio tiene ejércitos
     */
    public boolean tieneEjercitos() {
        // TODO: tieneEjercitos
        return false;
    }

    /**
     * Genera una representación en XML del territorio
     * @return String con el XML
     */
    public String toXml() {
        String s = "";
        // TODO: toXml
        return s;
    }

    public static void main(String[] args) {
        Territorio t = new Territorio("Buztintxuri", 1, 4);
        String xml = t.toXml();
        System.out.println(xml);
    }

}
