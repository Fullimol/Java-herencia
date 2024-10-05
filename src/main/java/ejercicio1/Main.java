package ejercicio1;

public class Main {

    public static void main(String[] args) {
        VehiculoTerrestre camion = new Camion((short) 6, 5000, (short) 12, (short) 2, Colores.ROJO);

        VehiculoTerrestre moto = new Moto((short) 2, (short) 0, Colores.BLANCO, (short) 1200);

        //crear automovil
        System.out.println(camion.getColor());
    }
}