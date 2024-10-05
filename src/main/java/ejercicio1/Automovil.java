package ejercicio1;

public class Automovil extends VehiculoTerrestre {

    //atributos
    private int cantidadPasajeros;
    private short cantidadMarchas;

    //constructor
    public Automovil(short cantidadRuedas, short cantidadPuertas, Colores color, int cantidadPasajeros, short cantidadMarchas) {
        super(cantidadRuedas, cantidadPuertas, color); //traigo los atributos de la clase padre
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadMarchas = cantidadMarchas;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public int getCantidadMarchas() {
        return cantidadMarchas;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void setCantidadMarchas(short cantidadMarchas) {
        this.cantidadMarchas = cantidadMarchas;
    }
};
