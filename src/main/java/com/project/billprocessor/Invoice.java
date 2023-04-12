package com.project.billprocessor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
  private Date date;
  private long totalAmount;
  private String clientName;
  private List<Bill> billList;

  public Invoice(Date date, long totalAmount, String clientName) {
    this.date = date;
    this.totalAmount = totalAmount;
    this.clientName = clientName;
    this.billList = new ArrayList<Bill>();
  }

  public List<Bill> getBillList() {
    return billList;
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
