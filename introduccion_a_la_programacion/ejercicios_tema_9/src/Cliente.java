/**
 * Clase hija Cliente que hereda de Persona
 */
public class Cliente extends Persona{
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{ " +
                "Datos " +
                super.toString() +
                ", credito= $" + credito +
                " } ";
    }
}
