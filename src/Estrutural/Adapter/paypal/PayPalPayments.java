package Estrutural.Adapter.paypal;

import Estrutural.Adapter.utils.Token;

public interface PayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
