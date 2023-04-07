package com.project.salarycalculator;

public enum EmployeePosition {
  DEVELOPER("DESENVOLVEDOR"),
  DBA("DBA"),
  TESTER("TESTADOR"),
  MANAGER("GERENTE");

  private final String title;

  private EmployeePosition(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }
}
