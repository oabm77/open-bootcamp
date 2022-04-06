/**
 * ejercicios tema 3
 * crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 */
public class ConcatenarTextos {
    public static void main(String[] args) {
        String[] nombres = {"Omar", "Marcela", "Sergio", "Paula"};
        int contador = 0;
        String nombresConcatenados = "";
        for(String nombre:nombres) {
            nombresConcatenados += nombre + " ";
            System.out.println(++contador + "- " + nombre);
        }
        System.out.println("Todos: " + nombresConcatenados);
    }
}
