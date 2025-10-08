package edu.masanz.da.lmgi;

public class Ataque {

    private int idJugadorAtacante;
    private int idJugadorDefensor;

    private Territorio territorioAtacante;
    private Territorio territorioDefensor;

    private Tirada tirada;

    /**
     * Constructor que define un ataque entre dos territorios.
     * El ataque no se ejecuta hasta que se llame al método ataca().
     * Esto no hay que hacerlo en el constructo,
     * solo hay que iniciar los atributos.
     * @param atacante Territorio atacante
     * @param defensor Territorio defensor
     */
    public Ataque(Territorio atacante, Territorio defensor) {
        // TODO: Ataque
        atacante = territorioAtacante;
        defensor = territorioDefensor;
    }

    /**
     * Devuelve la tirada resultante del ataque.
     * @return tirada Resultado del ataque
     * (puede ser null si no se ha atacado aún)
     */
    public Tirada getTirada() {
        // TODO: getTirada
        return tirada;
    }

    /**
     * Realiza el ataque entre los dos territorios.
     * El atacante puede tirar 1, 2 o 3 dados dependiendo de sus ejércitos.
     * El defensor puede tirar 1 o 2 dados dependiendo de sus ejércitos.
     * La tirada se define con la cantidad de estos dados.
     * Se deben restar los ejércitos perdidos a cada territorio.
     * Si un territorio se queda sin ejércitos, cambia de propietario y se le asigna 1 ejército.
     * @return Tirada resultado del ataque
     */
    public Tirada ataca() {
        // TODO: ataca
        return null;
    }

    /**
     * Devuelve la representación en XML del ataque.
     * @return String con el XML del ataque
     */
    public String toXml() {
      String s  = "";
      // TODO: toXml
      return s;
    }

    public static void main(String[] args) {
        Territorio t1 = new Territorio("Buztintxuri", 1, 3);
        Territorio t2 = new Territorio("Arrosadia", 2, 2);
        Ataque a1 = new Ataque(t1, t2);
        Tirada tirada1 = a1.ataca();
        System.out.println(a1.toXml());
        System.out.println(tirada1);
    }

}
