package Estrutural.Adapter.paypal;

import Estrutural.Adapter.utils.Token;

public class PayPal implements PayPalPayments {
    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com PayPal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via PayPal");
    }
}
