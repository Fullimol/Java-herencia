package ejercicio1;

public class Camion extends VehiculoTerrestre {
    private short cantidadMarcha;
    private int pesoCarga;

    public Camion(short cantidadMarcha, int pesoCarga, short cantidadRuedas, short cantidadPuertas, Colores color) {
        super(cantidadRuedas, cantidadPuertas, color);
        this.cantidadMarcha = cantidadMarcha;
        this.pesoCarga = pesoCarga;
    }

    public short getCantidadMarcha() {
        return cantidadMarcha;
    }

    public void setCantidadMarcha(short cantidadMarcha) {
        this.cantidadMarcha = cantidadMarcha;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
}
