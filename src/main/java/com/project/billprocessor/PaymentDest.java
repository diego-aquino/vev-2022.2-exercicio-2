package com.project.billprocessor;

public enum PaymentDest {
  BILL("BOLETO");

  // enum with title
  private String title;

  private PaymentDest(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
