package Estrutural.Adapter;

import Estrutural.Adapter.adapters.PayonnerAdapter;
import Estrutural.Adapter.payoneer.Payoneer;
import Estrutural.Adapter.paypal.PayPal;
import Estrutural.Adapter.paypal.PayPalPayments;

public class MainAdapter {
    public static void main(String[] args) {
        PayPalPayments payment = new PayonnerAdapter(new Payoneer());
        payment.paypalPayment();
        payment.paypalReceive();

        System.out.println("____________________________________________________________");

        PayPal payPal = new PayPal();
        payPal.paypalPayment();
        payPal.paypalReceive();
    }
}
