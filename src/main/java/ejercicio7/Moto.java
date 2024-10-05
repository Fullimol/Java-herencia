/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author usuario
 */
public class Moto extends Vehiculo {

    //atributo
    protected float cilindrada;

    //contrusctor
    public Moto(String patente, byte cantidadRuedas, Marcas marca, float cilindrada) {
        super(patente, cantidadRuedas, marca);
        this.cilindrada = cilindrada;
    }

    //metodos
    public String mostrarMoto() {
        return mostrar() + " / Clinidrada: " + cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

}