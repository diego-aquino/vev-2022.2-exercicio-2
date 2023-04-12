// tests for PaymentDest enum class
package com.project.billprocessor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaymentDestTest {
  @Test
  public void testBillPaymentDestShouldHaveCorrectTitle() {
    assertEquals("BOLETO", PaymentDest.BILL.getTitle());
  }
}
