package builder.cars;

import builder.components.CarType;
import builder.components.Engine;
import builder.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Transmission transmission;
    private final Engine engine;


    public Truck(CarType carType, int seats, Transmission transmission, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
    }

    public String result() {
        return "Transmission: " + transmission  + " and truck with motor: " + engine.getPower();
    }
}
