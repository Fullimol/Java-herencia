/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("HMB362", (byte) 4, Marcas.FORD, 4);
        Auto auto2 = new Auto("JIL782", (byte) 4, Marcas.FIAT, 2);
        Moto moto1 = new Moto("HED124", (byte) 2, Marcas.ZANELLA, 250);
        Camion camion1 = new Camion("KWS910", (byte) 6, Marcas.SCANIA, 5000);

        Lavadero lavadero = new Lavadero(5000, 9000, 2000);

        System.out.println("AUTO1: " + auto1.mostrarAuto());
        System.out.println("MOTO1: " + moto1.mostrarMoto());
        System.out.println("CAMION1: " + camion1.mostrarCamion());

        System.out.println("--------------");
        System.out.println(lavadero.getDetalle());

        //agrego vehiculos al listado del lavadero
        lavadero.agregar(auto1, lavadero.getVehiculos());
        lavadero.agregar(moto1, lavadero.getVehiculos());
        lavadero.agregar(camion1, lavadero.getVehiculos());

        System.out.println("-----Vehiculos ya Agregados-----");
        System.out.println(lavadero.getDetalle());

        System.out.println("-----Vehiculos Actualizados-----");
        lavadero.remover(moto1, lavadero.getVehiculos());
        lavadero.agregar(auto2, lavadero.getVehiculos());
        System.out.println(lavadero.getDetalle());

        System.out.println("-----GANANCIAS-----");
        System.out.println("$" + lavadero.mostrarTotalFacturado());
    }
}