package Estrutural.Adapter.payoneer;

import Estrutural.Adapter.utils.Token;

public class Payoneer implements PayoneerPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneeer");
    }
}
