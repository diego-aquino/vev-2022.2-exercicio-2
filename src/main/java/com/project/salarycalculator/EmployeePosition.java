package com.project.salarycalculator;

public enum EmployeePosition {
  DEVELOPER("DESENVOLVEDOR"),
  DBA("DBA"),
  TESTER("TESTADOR"),
  MANAGER("GERENTE");

  private final String name;

  private EmployeePosition(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
