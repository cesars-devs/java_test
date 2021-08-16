package com.uttlaxcala.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor= new PaymentProcessor(paymentGateway);
    }
    @Test
    public void payment_is_correct() {
        //Preparación del escenario/objetos

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));


        // llamada/ejecución del método
        boolean result = paymentProcessor.makePayment(1000);

        //Comprobación de resultado esperado
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));


        assertFalse(paymentProcessor.makePayment(1000));
    }
}