package Criacional.builder.director;

import Criacional.builder.builders.Builder;
import Criacional.builder.components.CarType;
import Criacional.builder.components.Engine;
import Criacional.builder.components.Transmission;

public class Director {
    public void constructSedanCar(Builder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(Builder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(3);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(1300));
    }
}
