package AbstractFactory.app;

import AbstractFactory.aircrafts.Aircraft;
import AbstractFactory.factories.TransportFactory;
import AbstractFactory.landvehicles.LandVehicle;

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
