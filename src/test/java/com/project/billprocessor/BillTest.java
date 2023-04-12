package com.project.billprocessor;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class BillTest {
  @Test
  public void testBillShouldHaveCodeDatePaidAmount() {
    String code = "A1";
    Date date = new Date();
    long paidAmount = 500 * 100;
    Bill bill = new Bill(code, date, paidAmount);

    assertEquals(code, bill.getCode());
    assertEquals(date, bill.getDate());
    assertEquals(paidAmount, bill.getPaidAmount());
  }
}
