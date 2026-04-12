package AbstractFactory.factories;

import AbstractFactory.aircrafts.Aircraft;
import AbstractFactory.aircrafts.Helicopter;
import AbstractFactory.landvehicles.Car;
import AbstractFactory.landvehicles.LandVehicle;

public class NiNeNineTransport implements TransportFactory {
    @Override
    public LandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public Aircraft createTransportAircraft() {
        return new Helicopter();
    }
}
