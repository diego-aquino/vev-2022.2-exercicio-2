package com.project.functionalTests.billprocessor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.project.billprocessor.Bill;
import com.project.billprocessor.Invoice;

import org.junit.Test;

public class InvoiceTest {
  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenZeroed() {
    Invoice invoice = createInvoice(new int[]{0}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenOneCent() {
    Invoice invoice = createInvoice(new int[]{1}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenMissingAmount() {
    Invoice invoice = createInvoice(new int[]{50}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenMissingOneCent() {
    Invoice invoice = createInvoice(new int[]{99}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenExactAmount() {
    Invoice invoice = createInvoice(new int[]{100}, 100);
    assertTrue(invoice.isPaid());
  }

  @Test
  (expected = IllegalArgumentException.class)
  public void testInvoiceShouldErrorOutOnNegativeBillValue() {
    Invoice invoice = createInvoice(new int[]{-1}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenOverAmount() {
    Invoice invoice = createInvoice(new int[]{101}, 100);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenCostinZero() {
    Invoice invoice = createInvoice(new int[]{100}, 0);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenCostingOne() {
    Invoice invoice = createInvoice(new int[]{100}, 1);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenCostingLessThanPaid() {
    Invoice invoice = createInvoice(new int[]{100}, 50);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenCostingOneLessThanPaid() {
    Invoice invoice = createInvoice(new int[]{100}, 99);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenCostingExactAsPaid() {
    Invoice invoice = createInvoice(new int[]{100}, 100);
    assertTrue(invoice.isPaid());
  }

  @Test
  (expected = IllegalArgumentException.class)
  public void testInvoiceShouldErrorOutWhenCostingNegative() {
    Invoice invoice = createInvoice(new int[]{100}, -1);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenCostingOneMoreThanPaid() {
    Invoice invoice = createInvoice(new int[]{100}, 101);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenEmptyBills() {
    Invoice invoice = createInvoice(new int[]{}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldNotMarkAsPaidWhenMissingValuesFromBills() {
    Invoice invoice = createInvoice(new int[]{50, 49}, 100);
    assertFalse(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenMatchingValuesFromBills() {
    Invoice invoice = createInvoice(new int[]{50, 50}, 100);
    assertTrue(invoice.isPaid());
  }

  @Test
  public void testInvoiceShouldMarkAsPaidWhenUnderValuesFromBills() {
    Invoice invoice = createInvoice(new int[]{50, 51}, 100);
    assertTrue(invoice.isPaid());
  }

  private Invoice createInvoice(int[] billsValues, int invoiceAmount) {
    Invoice invoice = new Invoice(new Date(), invoiceAmount, "ClientName");
    List<Bill> billList = new ArrayList<>();

    for (int billValue : billsValues) {
      billList.add(new Bill("", new Date(), billValue));
    }

    invoice.addBills(billList);

    return invoice;
  }
}
