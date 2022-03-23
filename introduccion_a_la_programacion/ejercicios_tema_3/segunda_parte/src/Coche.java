/**
 * Segunda parte:
 *
 * - Crear una clase coche.
 * - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * - Una función que incremente el número de puertas que tiene el coche.
 * - Crear un objeto miCoche en el main y añadirle una puerta.
 * - Mostrar el número de puertas que tiene el objeto.
 */
public class Coche {
    public int numeroPuertas = 0;

    /**
     * Función que incrementa el número de puertas que tiene el coche.
     * @param puertas
     */
    public void incrementaPuertas(int puertas) {
        this.numeroPuertas += puertas;
    }
}
