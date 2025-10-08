package edu.masanz.da.lmgi;

public class Tirada {

    private Dados dadosAtacante;
    private Dados dadosDefensor;

    /**
     * Crea una tirada con el número de dados del atacante y del defensor
     * @param numDadosAtacante Número de dados del atacante (1, 2 o 3)
     * @param numDadosDefensor Número de dados del defensor (1 o 2)
     */
    public Tirada(int numDadosAtacante, int numDadosDefensor) {
        // TODO: Tirada
        numDadosAtacante = 3;
        numDadosDefensor = 2;
    }

    // region getters y setters
    public Dados getDadosAtacante() {
        // TODO: getDadosAtacante
        return null;
    }

    public Dados getDadosDefensor() {
        // TODO: getDadosDefensor
        return null;
    }
    // endregion

    /**
     * Devuelve el número de dados en los que gana el atacante
     * @return Número de dados en los que gana el atacante
     */
    public int cuantosGanaAtacante() {
        // TODO: cuantosGanaAtacante
        return 0;
    }

    /**
     * Devuelve el número de dados en los que pierde el atacante
     * @return Número de dados en los que pierde el atacante
     */
    public int cuantosPierdeAtacante() {
        // TODO: cuantosPierdeAtacante
        return 0;
    }

    /**
     * Devuelve la representación en XML de la tirada
     * @return String con el XML de la tirada
     */
    public String toXml() {
        String s = "";
        // TODO: toXml
        return s;
    }

    /**
     * Devuelve la representación en String de la tirada. Ej. <br/>
     * [5] [4] [3] <br/>
     * [6] [2] <br/>
     * @return String con la representación de la tirada
     */
    public String toString() {
        String s = "";
        // TODO: toString
        return s;
    }

    public static void main(String[] args) {
        Tirada t1 = new Tirada(3,2);
        System.out.println(t1.toXml());
        System.out.println(t1);
    }

}
