package com.project.billprocessor;

import java.util.Date;

public class Payment {
  private long paidAmount;
  private Date date;
  private String paymentKind;

  public Payment(long paidAmount, Date date, String paymentKind) {
    if (paidAmount < 0) {
      throw new IllegalArgumentException("Paid amount " + paidAmount + " cannot be negative");
    }
    this.paidAmount = paidAmount;
    this.date = date;
    this.paymentKind = paymentKind;
  }

  public long getPaidAmount() {
    return paidAmount;
  }

  public Date getDate() {
    return date;
  }

  public String getPaymentKind() {
    return paymentKind;
  }
}
