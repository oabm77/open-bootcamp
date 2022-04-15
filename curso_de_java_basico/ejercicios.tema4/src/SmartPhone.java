public class SmartPhone extends SmartDevice{
    int numeroCamaras;
    String sistemaOperativo;

    public SmartPhone(int numeroCamaras, String sistemaOperativo) {
        this.numeroCamaras = numeroCamaras;
        this.sistemaOperativo = sistemaOperativo;
    }

    public SmartPhone(String marca, float pulgadas, String tipoBateria, int numeroCamaras, String sistemaOperativo) {
        super(marca, pulgadas, tipoBateria);
        this.numeroCamaras = numeroCamaras;
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getNumeroCamaras() {
        return numeroCamaras;
    }

    public void setNumeroCamaras(int numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numeroCamaras=" + numeroCamaras +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                "} " + super.toString();
    }
}
