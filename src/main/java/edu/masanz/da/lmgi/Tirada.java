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
        dadosAtacante = new Dados(numDadosAtacante);
        dadosDefensor = new Dados(numDadosDefensor);

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
        int n = dadosAtacante.gana(dadosAtacante);
        return n;
    }

    /**
     * Devuelve el número de dados en los que pierde el atacante
     * @return Número de dados en los que pierde el atacante
     */
    public int cuantosPierdeAtacante() {
        // TODO: cuantosPierdeAtacante
        int n = dadosAtacante.gana(dadosAtacante);
        return n;
    }

    /**
     * Devuelve la representación en XML de la tirada
     * @return String con el XML de la tirada
     */
    public String toXml() {
        String s = "<tirada> \n<dadosAtacante> \n"+dadosAtacante+ "\n</dadosAtacante>"+
                "\n<dadosDefensor> \n"+dadosDefensor+"\n</dadosDefensor>"+
                "\n</tirada>";
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
        String s = "Tirada \nDadosAtacante: \n" +dadosAtacante+
                "\nDadosDefensor: \n" +dadosDefensor;
        // TODO: toString
        return s;
    }

    public static void main(String[] args) {
        Tirada t1 = new Tirada(3,2);
        System.out.println(t1.toXml());
        System.out.println(t1);
    }

}
