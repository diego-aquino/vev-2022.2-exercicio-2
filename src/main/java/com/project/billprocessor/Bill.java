package com.project.billprocessor;

import java.util.Date;

public class Bill {
  private Date dueDate;
  private long totalAmount;
  private String clientName;

  public Bill(Date date, long totalAmount, String clientName) {
    this.dueDate = date;
    this.totalAmount = totalAmount;
    this.clientName = clientName;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public long getTotalAmount() {
    return totalAmount;
  }

  public String getClientName() {
    return clientName;
  }
}
