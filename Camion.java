package Ejercicio22_vehiculosTransporte;

public class Camion extends Vehiculo {
    private double capacidadCargaToneladas;

    public Camion(String patente, String marca, int anioFabricacion, double capacidadCargaToneladas) {
        super(patente, marca, anioFabricacion);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    public boolean puedeTransportar(double toneladas) {
        return toneladas > 0 && toneladas <= capacidadCargaToneladas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Camión de carga: capacidad " + capacidadCargaToneladas + " t. Requiere licencia profesional.");
    }
}
