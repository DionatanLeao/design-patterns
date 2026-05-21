package Criacional.AbstractFactory.factories;

import Criacional.AbstractFactory.aircrafts.Aircraft;
import Criacional.AbstractFactory.landvehicles.LandVehicle;

public interface TransportFactory {
    LandVehicle createTransportVehicle();
    Aircraft createTransportAircraft();
}
