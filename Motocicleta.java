package Ejercicio22_vehiculosTransporte;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String patente, String marca, int anioFabricacion, int cilindrada) {
        super(patente, marca, anioFabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Motocicleta de " + cilindrada + " cc. Casco obligatorio.");
    }
}
