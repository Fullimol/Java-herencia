package ejercicio7;

public class Auto extends Vehiculo {

    //atributos
    protected int cantidadAsientos;

    //contrusctor
    public Auto(String patente, byte cantidadRuedas, Marcas marca, int cantidadAsientos) {
        super(patente, cantidadRuedas, marca);
        this.cantidadAsientos = cantidadAsientos;
    }

    //metodos
    public String mostrarAuto() {
        return mostrar() + " /Asiento: " + cantidadAsientos;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

}