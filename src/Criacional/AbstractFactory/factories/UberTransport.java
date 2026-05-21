package Criacional.AbstractFactory.factories;

import Criacional.AbstractFactory.aircrafts.Aircraft;
import Criacional.AbstractFactory.aircrafts.Airplane;
import Criacional.AbstractFactory.landvehicles.Car;
import Criacional.AbstractFactory.landvehicles.LandVehicle;

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
