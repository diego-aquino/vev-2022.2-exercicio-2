package com.project.billprocessor;

import java.util.Date;

public class Payment {
  private long paidAmount;
  private Date date;
  private PaymentDest paymentDest;

  public Payment(long paidAmount, Date date, PaymentDest paymentDest) {
    if (paidAmount < 0) {
      throw new IllegalArgumentException("Paid amount " + paidAmount + " cannot be negative");
    }
    this.paidAmount = paidAmount;
    this.date = date;
    this.paymentDest = paymentDest;
  }

  public long getPaidAmount() {
    return paidAmount;
  }

  public Date getDate() {
    return date;
  }

  public PaymentDest getPaymentDest() {
    return paymentDest;
  }
}
