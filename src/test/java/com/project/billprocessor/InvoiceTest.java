package com.project.billprocessor;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class InvoiceTest {
  @Test
  public void newInvoiceHasDateTotalAmountClientNameEmptyBillList() {
    Date date = new Date();
    long amountInCents = 1500 * 100;
    String clientName = "Frank";
    Invoice invoice = new Invoice(date, amountInCents, clientName);

    assertEquals(date, invoice.getDate());
    assertEquals(amountInCents, invoice.getTotalAmount());
    assertEquals(clientName, invoice.getClientName());
    assertEquals(0, invoice.getBillList().size());
  }
}
