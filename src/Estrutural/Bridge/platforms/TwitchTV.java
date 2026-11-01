package Estrutural.Bridge.platforms;

public class TwitchTV implements Platform {
    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal");
    }
}
