
package ejercicio1;

public class Moto extends VehiculoTerrestre{
    //atributos
    private short cilindrada;
    
    //constructor
    public Moto(short cantidadRuedas, short cantidadPuertas, Colores color, short cilindrada){
        super(cantidadRuedas,cantidadPuertas, color);
        this.cilindrada = cilindrada;
    }
    
    //getters y setters
}
