package ejercicio1;

// es "abstract" porque esta clase NO la vamos a instanciar (por ser clase padre)
public abstract class VehiculoTerrestre {
    //atributos
    private short cantidadRuedas;
    private short cantidadPuertas;
    private Colores color;

    //constructor
    protected VehiculoTerrestre(short cantidadRuedas, short cantidadPuertas, Colores color) {
        this.cantidadRuedas = cantidadRuedas;
        this.cantidadPuertas = cantidadPuertas;
        this.color = color;
    }
    
    public short getCantidadRuedas(){
        return cantidadRuedas;
    }
    
    public short getCantidadPuertas(){
        return cantidadPuertas;
    }
    
    public Colores getColor(){
        return color;
    }
    
    public void setColor(Colores color){
        this.color = color;
    }
}
