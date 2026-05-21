package Criacional.AbstractFactory.factories;

import Criacional.AbstractFactory.aircrafts.Aircraft;
import Criacional.AbstractFactory.aircrafts.Helicopter;
import Criacional.AbstractFactory.landvehicles.Car;
import Criacional.AbstractFactory.landvehicles.LandVehicle;

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
