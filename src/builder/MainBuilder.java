package builder;

import builder.builders.CarBuilder;
import builder.builders.TruckBuilder;
import builder.cars.Truck;
import builder.director.Director;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        System.out.println("Carro: " + carBuilder.getResult().getCarType() + " produzido com sucesso!");

        System.out.println("_______________________________________________________________________");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());
    }

}
