package Estrutural.Bridge.transmissions;

import Estrutural.Bridge.platforms.Platform;

public class Live implements Transmission {
    protected Platform platform;
    public Live() {
    }

    public Live(Platform platform) {
        this.platform = platform;
    }

    @Override
    public void broadCasting() {
        System.out.println("Iniciando a Transmissão!");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
