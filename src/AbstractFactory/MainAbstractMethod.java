package AbstractFactory;

import AbstractFactory.app.Application;
import AbstractFactory.factories.NiNeNineTransport;
import AbstractFactory.factories.TransportFactory;
import AbstractFactory.factories.UberTransport;

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
