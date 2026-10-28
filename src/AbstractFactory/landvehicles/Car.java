package AbstractFactory.landvehicles;

public class Car implements LandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos o passageiros, estamos prontos");
    }
}
