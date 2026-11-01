package Estrutural.Adapter.adapters;

import Estrutural.Adapter.payoneer.Payoneer;
import Estrutural.Adapter.paypal.PayPalPayments;
import Estrutural.Adapter.utils.Token;

public class PayonnerAdapter implements PayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayonnerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payonner utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
