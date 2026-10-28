package AbstractFactory.aircrafts;

public class Airplane implements Aircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passsageiros a bordo, vôo autorizado");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, ventos ok!");
    }
}
