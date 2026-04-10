package factory;

public class Car implements Vehicle {
    @Override
    public void startRote() {
        getCargo();
        System.out.println("Iniciamos o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, estamos prontos");
    }
}
