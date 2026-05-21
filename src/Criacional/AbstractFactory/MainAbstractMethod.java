package Criacional.AbstractFactory;

import Criacional.AbstractFactory.app.Application;
import Criacional.AbstractFactory.factories.NiNeNineTransport;
import Criacional.AbstractFactory.factories.TransportFactory;
import Criacional.AbstractFactory.factories.UberTransport;

public class MainAbstractMethod {
    public static Application configureApplication() {
        Application app;
        TransportFactory factory;
        String company = "uber";

        if (company == "99") {
            factory = new UberTransport();
        } else {
            factory = new NiNeNineTransport();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }

}
