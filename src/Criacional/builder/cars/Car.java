package Criacional.builder.cars;

import Criacional.builder.components.CarType;
import Criacional.builder.components.Engine;
import Criacional.builder.components.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType, int seats, Transmission transmission, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }
}
