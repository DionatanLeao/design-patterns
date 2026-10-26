package factory;

public abstract class Transport {
    void startTransport() {
        Vehicle vehicle = createTransport();
        vehicle.startRote();
    }

    protected abstract Vehicle createTransport();
}
