package Ejercicio22_vehiculosTransporte;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anioFabricacion;
    private boolean encendido;

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void mostrarInformacion() {
        System.out.println(marca + " " + anioFabricacion + " (patente " + patente + ") - " + (encendido ? "encendido" : "apagado"));
    }
}
