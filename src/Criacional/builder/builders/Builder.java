package Criacional.builder.builders;

import Criacional.builder.components.CarType;
import Criacional.builder.components.Engine;
import Criacional.builder.components.Transmission;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
