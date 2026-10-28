package FactoryMethod;

public class Motorcycle implements Vehicle {
    @Override
    public void startRote() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");
    }
}
