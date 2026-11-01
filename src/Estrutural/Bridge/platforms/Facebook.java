package Estrutural.Bridge.platforms;

public class Facebook implements Platform {
    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
