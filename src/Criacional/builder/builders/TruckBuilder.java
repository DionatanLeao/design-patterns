package Criacional.builder.builders;

import Criacional.builder.cars.Truck;
import Criacional.builder.components.CarType;
import Criacional.builder.components.Engine;
import Criacional.builder.components.Transmission;

public class TruckBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult() {
        return new Truck(carType, seats, transmission, engine);
    }
}
