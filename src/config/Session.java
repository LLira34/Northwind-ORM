package config;

import java.util.List;

/**
 * Clase que almacenará la información importante de un usuario en particular.
 * Ésta clase utilizar el patrón Singleton
 *
 * @author Luis Lira
 * @version 1.0
 */
public class Session {

    private static Session instance;//Instancia singleton

    private Session() {
    }

    /**
     * Método que regresa una única instancia.
     *
     * @return Instancia de session.
     */
    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

}//End class
