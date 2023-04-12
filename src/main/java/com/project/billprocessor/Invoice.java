package com.project.billprocessor;

import java.util.Date;

public class Invoice {
  private Date date;
  private long totalAmount;
  private String clientName;

  public Invoice(Date date, long totalAmount, String clientName) {
    this.date = date;
    this.totalAmount = totalAmount;
    this.clientName = clientName;
  }

  public Date getDate() {
    return date;
  }

  public long getTotalAmount() {
    return totalAmount;
  }

  public String getClientName() {
    return clientName;
  }
}
