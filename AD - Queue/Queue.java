/**
 * Abstrakte Basisklasse für Queues
 * 
 * @author Rainer Helfrich
 * @version Oktober 2020
 */
public abstract class Queue<T>
{
    /**
     * Gibt zurück, ob die Queue leer ist
     * @return true, wenn die Queue leer ist; false sonst
     */
    public abstract boolean isEmpty();

    /**
     * Fügt ein neues Element hinten in der Schlange ein
     * @param x Das neue Element
     */
    public abstract void enqueue(T x);

    /**
     * Entfernt das vorderste Element aus der Queue (falls sie nicht leer ist) und gibt es zurück
     * @return Das bisherige vorderste Element
     */
    public abstract T dequeue();

    /**
     * Gibt das vorderste Element der Queue zurück (falls sie nicht leer ist)
     * @return Das vorderste Element
     */
    public abstract T front();
}
