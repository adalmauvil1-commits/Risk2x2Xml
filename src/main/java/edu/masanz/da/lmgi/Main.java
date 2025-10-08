package edu.masanz.da.lmgi;

import edu.masanz.da.lmgi.utils.Exec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static Logger log = LogManager.getLogger();// NO BORRAR


    public static void main(String[] args) {
        log.info(Exec.getHostName());// NO BORRAR


        Juego juego = new Juego();

        juego.empezar();

        juego.jugar(1);

        juego.terminar();


    }


}
