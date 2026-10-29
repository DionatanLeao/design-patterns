package builder.director;

import builder.builders.Builder;
import builder.components.CarType;
import builder.components.Engine;
import builder.components.Transmission;

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
