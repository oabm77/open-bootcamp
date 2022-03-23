/**
 * Clase que crea un objeto miCoche en el main y añadirle una puerta.
 */
public class TestCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementaPuertas(1);
        System.out.println("El número de puertas es: " + miCoche.numeroPuertas);
    }
}
