package com.project.billprocessor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    assertFalse(invoice.isPaid());
    assertEquals(0, invoice.getPaymentList().size());
  }

  @Test
  public void invoiceAcceptsBillsList() {
    Invoice invoice = new Invoice(new Date(), 0, "");
    Bill billOne = new Bill("", new Date(), 0);
    Bill billTwo = new Bill("", new Date(), 0);
    Bill billThree = new Bill("", new Date(), 0);
    List<Bill> billList = new ArrayList<>();

    billList.add(billOne);
    billList.add(billTwo);
    billList.add(billThree);

    invoice.addBills(billList);

    assertEquals(billList, invoice.getBillList());
  }

  @Test
  public void invoiceIsMarkedAsPaid() {
    Invoice invoice = new Invoice(new Date(), 0, "");

    Bill billOne = new Bill("", new Date(), 0);
    List<Bill> billList = new ArrayList<>();
    billList.add(billOne);

    invoice.addBills(billList);

    assertTrue(invoice.isPaid());
  }

  @Test
  public void invoiceIsNotMarkedAsPaidWhenMissingAmount() {
    Invoice invoice = new Invoice(new Date(), 1, "");

    Bill billOne = new Bill("", new Date(), 0);
    List<Bill> billList = new ArrayList<>();
    billList.add(billOne);

    invoice.addBills(billList);

    assertFalse(invoice.isPaid());
  }
}
