public class SmartWatch extends SmartDevice{
    boolean mideRitmo;
    String tipoCarga;

    public SmartWatch(boolean mideRitmo, String tipoCarga) {
        this.mideRitmo = mideRitmo;
        this.tipoCarga = tipoCarga;
    }

    public SmartWatch(String marca, float pulgadas, String tipoBateria, boolean mideRitmo, String tipoCarga) {
        super(marca, pulgadas, tipoBateria);
        this.mideRitmo = mideRitmo;
        this.tipoCarga = tipoCarga;
    }

    public boolean isMideRitmo() {
        return mideRitmo;
    }

    public void setMideRitmo(boolean mideRitmo) {
        this.mideRitmo = mideRitmo;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "mideRitmo=" + mideRitmo +
                ", tipoCarga='" + tipoCarga + '\'' +
                "} " + super.toString();
    }
}
