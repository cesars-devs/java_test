package com.uttlaxcala.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);


}
