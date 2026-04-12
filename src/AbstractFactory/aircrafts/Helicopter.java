package AbstractFactory.aircrafts;

public class Helicopter implements Aircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passsageiros ok, Ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, suldeste, ventos ok!");
    }
}
