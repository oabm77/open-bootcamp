/**
 * - Crear clase Persona.
 * - Crear variables las privadas edad, nombre y telefono de la clase Persona.
 * - Crear gets y sets de cada propiedad.
 * - Crear un objeto persona en el main.
 * - Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */
class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("persona = { edad: " + persona.getEdad() + ", nombre: '" + persona.getNombre() + "', teléfono: '" + persona.getTelefono() + "' }");
        persona.setEdad(44);
        persona.setNombre("Omar");
        persona.setTelefono("+57 324567890");
        System.out.println("persona = { edad: " + persona.getEdad() + ", nombre: '" + persona.getNombre() + "', teléfono: '" + persona.getTelefono() + "' }");
    }
}

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Constructor vacío
    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.telefono = "";
    }

    // Constructor con parámetros
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
