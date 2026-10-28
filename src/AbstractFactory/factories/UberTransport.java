package AbstractFactory.factories;

import AbstractFactory.aircrafts.Aircraft;
import AbstractFactory.aircrafts.Airplane;
import AbstractFactory.landvehicles.Car;
import AbstractFactory.landvehicles.LandVehicle;

public class UberTransport implements TransportFactory {
    @Override
    public LandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public Aircraft createTransportAircraft() {
        return new Airplane();
    }
}
