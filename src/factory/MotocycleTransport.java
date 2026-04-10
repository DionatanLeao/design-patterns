package factory;

public class MotocycleTransport extends Transport {
    @Override
    protected Vehicle createTransport() {
        return new Motorcycle();
    }
}
