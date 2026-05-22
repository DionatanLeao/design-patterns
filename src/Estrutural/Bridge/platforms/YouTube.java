package Estrutural.Bridge.platforms;

public class YouTube implements Platform {
    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação");
    }
}
