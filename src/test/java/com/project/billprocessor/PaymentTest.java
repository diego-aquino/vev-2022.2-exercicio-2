package com.project.billprocessor;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class PaymentTest {

  @Test
  public void testPaymentShouldHavePaidAmountDatePaymentKind() {
    long paidAmount = 1500 * 100;
    Date date = new Date();
    String paymentKind = "BOLETO";
    Payment payment = new Payment(paidAmount, date, paymentKind);

    assertEquals(paidAmount, payment.getPaidAmount());
    assertEquals(date, payment.getDate());
    assertEquals(paymentKind, payment.getPaymentKind());
  }
}
