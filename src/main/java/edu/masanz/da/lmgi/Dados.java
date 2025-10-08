package edu.masanz.da.lmgi;

/**
 * Clase que simula el lanzamiento de hasta tres dados.
 * Los valores se guardan ordenados de mayor a menor.
 * Permite comparar dos tiradas de dados.
 */
public class Dados {

    private int v1;
    private int v2;
    private int v3;

    /**
     * Constructor que crea un objeto Dados sin valores (0, 0, 0).
     */
    public Dados() {
        // TODO: Dados
        v1 = 0;
        v2 = 0;
        v3 = 0;
    }

    /**
     * Constructor que crea un objeto Dados lanzando n dados (1, 2 o 3).
     * @param n número de dados a lanzar (1, 2 o 3)
     */
    public Dados(int n) {
        // TODO: Dados(n)
        if (n >= 1 || n <= 3){

        }
        tirarDados(n);
    }

    /**
     * Constructor que crea un objeto Dados con los valores indicados.
     * @param d1
     * @param d2
     * @param d3
     */
    public Dados(int d1, int d2, int d3) {
        // TODO: Dados(d1,d2,d3)
        v1 = d1;
        v2 = d2;
        v3 = d3;
    }

    /**
     * Lanza un dado y guarda su valor.
     */
    public void tirarDado() {
        // TODO: tirarDado
        int valor = (int) (Math.random() * 6 + 1);
        System.out.println(valor);
    }


    /**
     * Lanza n dados (1, 2 o 3) y guarda sus valores.
     * @param n número de dados a lanzar (1, 2 o 3)
     */
    public void tirarDados(int n) {
        // TODO: tirarDados(n)
        if (n >= 1 || n <= 3){

        }
        v1 = 0;
        v2 = 0;
        v3 = 0;

        for (int i = 0; i < n; i++) {
            int valor = (int) (Math.random() * 6) + 1;
            meter(valor);

        }

    }

    /**
     * Mete un valor en la lista de valores v1, v2 y v3
     * manteniendo el orden v1 >= v2 >= v3.<br/>
     * Ej. si se crea una instancia de dados con el constructor sin parámetros
     * y se llama a meter(4), meter(6), meter(2) la secuencia de valores
     * será: (0,0,0) -> (4,0,0) -> (6,4,0) -> (6,4,2)
     * @param v valor a meter (1..6)
     */
    public void meter(int v ) {
        // TODO: meter
        if (v > v1 ){
            v3 = v2;
            v2 = v1;
            v1 = v;
        } else if (v > v2 ){
            v3 = v2;
            v2 = v;
        } else {
            v3 = v;
        }
    }

    /**
     * Devuelve el número de valores distinto de cero que tiene el objeto (0..3).
     * @return número de valores distintos de cero (0..3)
     */
    public int cuantosValores() {
        int c = 0;
        if (v1 != 0){
            c = c +1 ;
        } if (v2 != 0){
            c = c +2;
        } if (v3 != 0){
            c = c +3;
        }

        // TODO: cuantosValores

        return c;
    }

    /**
     * Compara los valores de este objeto con los de otro objeto Dados.
     * Compara v1 con v1, v2 con v2 y v3 con v3 si existen.
     * Cada vez que el valor de este objeto es mayor que el del otro
     * se suma 1 al contador.
     * @param d2 objeto Dados a comparar
     * @return número de valores en los que este objeto es mayor que d2 (0..3)
     */
    public int gana(Dados d2) {
        int n = 0;
        if (this.v1 > d2.v1){
            n = n +1;
        } if (this.v2 > d2.v2){
            n = n +1;
        } if (this.v3 > d2.v3){
            n = n +1;
        }

        // TODO: gana
        return n;
    }

    /**
     * Devuelve una representación en XML de los valores del objeto.
     * @return cadena con la representación en XML
     */
    public String toXml() {
        String s = "<Primer valor: " +v1+ "/>" +
                "\n<Segundo valor: "+ v2+ "/>"
                + "\n<Tercer valor: "+ v3+ "/>";
        // TODO: toXml
        return s;
    }

    /**
     * Devuelve una representación textual de los valores del objeto. Ej. <br/>
     * [6] [4] [1] <br/>
     * o <br/>
     * [4] [3] <br/>
     * @return cadena con la representación de los valores
     */
    public String toString() {
        String s = "Primer valor: " + v1
                + "\nSegundo valor: "+v2
                + "\nTercer valor: "+ v3;
        // TODO: toString
        return s;
    }


    public static void main(String[] args) {

        Dados d1 = new Dados();
        d1.tirarDados(3);
        System.out.println(d1.toXml());

        Dados d2 = new Dados();
        d2.tirarDados(2);
        System.out.println(d2.toXml());

        System.out.println(d1);
        System.out.println(d2);

        int n = d1.gana(d2);
        System.out.println("la primera tirada gana " + n + " veces");

    }

}
