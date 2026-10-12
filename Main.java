package Ejercicio22_vehiculosTransporte;

public class Main {
    public static void main(String[] args) {
        AutoParticular auto = new AutoParticular("AB123CD", "Toyota", 2022, 5);
        Camion camion = new Camion("EF456GH", "Scania", 2019, 18.5);
        Motocicleta moto = new Motocicleta("123ABC", "Honda", 2023, 250);

        auto.encender();
        camion.encender();

        Vehiculo[] flota = {auto, camion, moto};
        for (Vehiculo v : flota) {
            v.mostrarInformacion();
        }

        System.out.println("¿El camión puede llevar 20 t? " + camion.puedeTransportar(20.0));
        System.out.println("¿El camión puede llevar 12 t? " + camion.puedeTransportar(12.0));
    }
}
