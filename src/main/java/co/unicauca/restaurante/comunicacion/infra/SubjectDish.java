package co.unicauca.restaurante.comunicacion.infra;

import java.util.ArrayList;

/**
 * Sujeto, o tambien el observadoF
 *
 * @author ahurtado
 */
public abstract class SubjectDish {

    ArrayList<ObserverDish> observers;

    public void Subject() {

    }

    /**
     * Agrega un observador
     *
     * @param obs
     */
    public void addObserver(ObserverDish obs) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    /**
     * Notifica a todos los observadores que hubo un cambio en el modelo
     */
    public void notifyAllObserves() {
        for (ObserverDish each : observers) {
            each.update(this);
        }
    }

}
