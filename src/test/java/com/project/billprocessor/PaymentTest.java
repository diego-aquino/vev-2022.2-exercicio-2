package com.project.billprocessor;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class PaymentTest {

  @Test
  public void testPaymentShouldHavePaidAmountDatePaymentDest() {
    long paidAmount = 1500 * 100;
    Date date = new Date();
    String paymentKind = "BOLETO";
    Payment payment = new Payment(paidAmount, date, PaymentDest.BILL);

    assertEquals(paidAmount, payment.getPaidAmount());
    assertEquals(date, payment.getDate());
    assertEquals(PaymentDest.BILL, payment.getPaymentDest());
  }

  @Test
  (expected = IllegalArgumentException.class)
  public void testPaymentShouldNotHaveNegativeAmount() {
    new Payment(-1, new Date(), PaymentDest.BILL);
  }
}
