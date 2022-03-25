/**
 * Ejercicio para practicar las estructuras de control
 */
public class Ejercicios {
    public static void main(String[] args) {
        /**
         * 1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
         *     Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */
        int numeroIf = -5;
        if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println();
        /**
         * 2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior
         *      a 3, el bloque de código que tendrá el bucle deberá:
         *     - Incrementar el valor de la variable en uno cada vez que se ejecute.
         *     - Mostrarlo por pantalla cada vez que se ejecute.
         */
        int numeroWhile = -5;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println();
        /**
         * 3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
         *      ejecutar una vez.
         */
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        System.out.println();
        /**
         * 4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
         *      que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
         *      deberá mostrarse por pantalla.
         */
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println();
        /**
         * 5. Por último, para el Switch, deberás crear la variable estacion, y distintos *case* para las cuatro
         *      estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
         *      consola informando de la estación en la que está. También habrá que poner un default para cuando
         *      el valor de la variable no sea una estación.
         */
        int estacion = 0;
        String mensaje;
        switch (estacion) {
            case 1: mensaje = "Primavera";
            break;
            case 2: mensaje = "Otoño";
            break;
            case 3: mensaje = "Invierno";
            break;
            case 4: mensaje = "Verano";
            break;
            default: mensaje = "No es una estación";
        }
        System.out.println(mensaje);
    }
}
