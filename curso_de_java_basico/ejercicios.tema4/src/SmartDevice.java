public class SmartDevice {
    String marca;
    float pulgadas;
    String tipoBateria;

    public SmartDevice() {
    }

    public SmartDevice(String marca, float pulgadas, String tipoBateria) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.tipoBateria = tipoBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    @Override
    public String toString() {
        return "Características básicas del SmartDevice{" +
                "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                ", tipoBateria='" + tipoBateria + '\'' +
                '}';
    }
}
