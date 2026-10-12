package Ejercicio22_vehiculosTransporte;

public class AutoParticular extends Vehiculo {
    private int cantidadPuertas;

    public AutoParticular(String patente, String marca, int anioFabricacion, int cantidadPuertas) {
        super(patente, marca, anioFabricacion);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Auto particular de " + cantidadPuertas + " puertas. Circula con licencia clase B.");
    }
}
