package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class Lavadero {

    //atributos
    private List<Vehiculo> vehiculos;
    private float precioAuto;
    private float precioCamion;
    private float precioMoto;

    //constructor
    public Lavadero(float precioAuto, float precioCamion, float precioMoto) {
        this(); //Esto es para inicializar el constructo privado.
        this.precioAuto = precioAuto;
        this.precioCamion = precioCamion;
        this.precioMoto = precioMoto;
    }

    // Constructor privado por default
    private Lavadero() {
        this.vehiculos = new ArrayList<>();
    }

    //metodos
    public String getDetalle() {
        String mensajePrecios = "PrecioAuto: " + precioAuto + " | PrecioCamion: " + precioCamion + " | PrecioMoto: " + precioMoto;
        StringBuilder mensajeLista = new StringBuilder();

        for (Vehiculo vehiculo : vehiculos) {
            mensajeLista.append(vehiculo.getPatente()).append(" - ").append(vehiculo.getMarca()).append("; ");
        }

        return mensajePrecios + " | Vehiculos: " + mensajeLista.toString();
    }

    public double mostrarTotalFacturado() {
        int cantMotos = 0;
        int cantAutos = 0;
        int cantCamiones = 0;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca() == Marcas.ZANELLA || vehiculo.getMarca() == Marcas.HONDA) {
                cantMotos++;
            } else if (vehiculo.getMarca() == Marcas.FORD || vehiculo.getMarca() == Marcas.FIAT) {
                cantAutos++;
            } else if (vehiculo.getMarca() == Marcas.SCANIA || vehiculo.getMarca() == Marcas.IVECO) {
                cantCamiones++;
            }
        }
        double ganancias = cantMotos * precioMoto + cantAutos * precioAuto + cantCamiones * precioCamion;

        return ganancias;
    }

    //entre un lavadero y un vehículo, retorna TRUE, si el vehículo se encuentra en el lavadero.
    public boolean sonIguales(Vehiculo vehiculo, List<Vehiculo> listaLavadero) {
        for (Vehiculo v : listaLavadero) {
            if (v.getPatente().equals(vehiculo.getPatente())) {
                return true;
            }
        }
        return false;
    }

    public void agregar(Vehiculo vehiculo, List<Vehiculo> listaLavadero) {
        if (sonIguales(vehiculo, listaLavadero)) {
            System.out.println("Vehiculo ya se encuentra");
        } else {
            listaLavadero.add(vehiculo); // Agrego el vehiculo a la lista
        }
    }

    public boolean remover(Vehiculo vehiculo, List<Vehiculo> listaLavadero) {
        if (sonIguales(vehiculo, listaLavadero)) {
            listaLavadero.remove(vehiculo);
            System.out.println(vehiculo.getPatente() + " fue removido");
            return true;
        } else {
            return false;
        }
    }

    //getters y setters
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public float getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(float precioAuto) {
        this.precioAuto = precioAuto;
    }

    public float getPrecioCamion() {
        return precioCamion;
    }

    public void setPrecioCamion(float precioCamion) {
        this.precioCamion = precioCamion;
    }

    public float getPrecioMoto() {
        return precioMoto;
    }

    public void setPrecioMoto(float precioMoto) {
        this.precioMoto = precioMoto;
    }

}