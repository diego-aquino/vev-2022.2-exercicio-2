package com.project.billprocessor;

import java.util.Date;

public class Bill {
  private String code;
  private Date date;

  private long paidAmount;

  public Bill(String code, Date date, long paidAmount) {
    if (paidAmount < 0) {
      throw new IllegalArgumentException("Paid amount {" + paidAmount + "} cannot be negative");
    }
    this.code = code;
    this.date = date;
    this.paidAmount = paidAmount;
  }

  public String getCode() {
    return code;
  }

  public Date getDate() {
    return date;
  }

  public long getPaidAmount() {
    return paidAmount;
  }
}
