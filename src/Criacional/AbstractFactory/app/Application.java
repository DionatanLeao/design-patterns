package Criacional.AbstractFactory.app;

import Criacional.AbstractFactory.aircrafts.Aircraft;
import Criacional.AbstractFactory.factories.TransportFactory;
import Criacional.AbstractFactory.landvehicles.LandVehicle;

public class Application {
    private LandVehicle vehicle;
    private Aircraft aircraft;

    public Application(TransportFactory factory) {
        this.vehicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
