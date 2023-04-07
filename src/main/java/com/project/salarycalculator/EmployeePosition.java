package com.project.salarycalculator;

public enum EmployeePosition {
  DEVELOPER("DESENVOLVEDOR");

  private final String name;

  private EmployeePosition(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
