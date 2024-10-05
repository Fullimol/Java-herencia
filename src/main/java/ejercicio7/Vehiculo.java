package ejercicio7;

public class Vehiculo {

    //atributos
    protected String patente;
    private byte cantidadRuedas;
    private Marcas marca;

    //metodos
    protected String mostrar() {
        return "Patente: " + patente + " /Marca: " + marca + " /Ruedas: " + cantidadRuedas;
    }

    //constructor
    public Vehiculo(String patente, byte cantidadRuedas, Marcas marca) {
        this.patente = patente;
        this.cantidadRuedas = cantidadRuedas;
        this.marca = marca;
    }

    public static boolean sonIguales(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        return vehiculo1.marca == vehiculo2.marca && vehiculo1.patente == vehiculo2.patente;
    }

    public String getPatente() {
        return patente;
    }

    public Marcas getMarca() {
        return marca;
    }

    public byte getCantidadRuedas() {
        return cantidadRuedas;
    }
}