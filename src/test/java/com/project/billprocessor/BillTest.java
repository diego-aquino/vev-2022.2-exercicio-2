package com.project.billprocessor;

import java.util.Date;

import org.junit.Test;
import com.project.billprocessor.Bill;

public class BillTest {
  @Test
  public void newBillAcceptsDueDateTotalAmountClientName() {
    Date date = new Date();
    long amountInCents = 1500 * 100;
    String clientName = "Frank";
    Bill bill = new Bill(date, amountInCents, clientName);

    assertEquals(date, bill.getDueDate());
    assertEquals(amountInCents, bill.getTotalAmount());
    assertEquals(clientName, bill.getClientName());
  }
}
