package ejercicio7;

public class Camion extends Vehiculo {

    //atributo
    protected float tara;

    //contrusctor
    public Camion(String patente, byte cantidadRuedas, Marcas marca, float tara) {
        super(patente, cantidadRuedas, marca);
        this.tara = tara;
    }

    //metodos
    public String mostrarCamion() {
        return mostrar() + " / Tara: " + tara;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

}