package Estrutural.Adapter.payoneer;

import Estrutural.Adapter.utils.Token;

public interface PayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
