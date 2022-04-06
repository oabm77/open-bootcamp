import java.util.Scanner;

/**
 * ejercicios tema 2
 *  crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class PrecioConIva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        try {
            double precio = scanner.nextDouble();
            System.out.println("El precio con el IVA incluido es: $" + agregarIva(precio));
        } catch (Exception e) { // En caso de ingresar valor inválido
            System.out.println("Error: verifique el precio.");
        }
    }

    public static double agregarIva(double precio) {
        return precio + precio * 0.16;
    }
}
