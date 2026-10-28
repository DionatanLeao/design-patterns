package AbstractFactory.factories;

import AbstractFactory.aircrafts.Aircraft;
import AbstractFactory.landvehicles.LandVehicle;
import FactoryMethod.Transport;

public interface TransportFactory {
    LandVehicle createTransportVehicle();
    Aircraft createTransportAircraft();
}
