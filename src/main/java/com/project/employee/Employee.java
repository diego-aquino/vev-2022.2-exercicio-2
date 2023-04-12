package com.project.employee;

public class Employee {

  private String name;
  private String email;
  private int baseSalaryInCents;
  private EmployeePosition position;

  public Employee(String name, String email, int baseSalaryInCents, EmployeePosition position) {
    this.name = ensureNonNull(name, "name");
    this.email = ensureNonNull(email, "email");
    this.baseSalaryInCents = ensureNonNegative(baseSalaryInCents, "baseSalaryInCents");
    this.position = ensureNonNull(position, "position");
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public int getBaseSalaryInCents() {
    return baseSalaryInCents;
  }

  public EmployeePosition getPosition() {
    return position;
  }

  private <Value> Value ensureNonNull(Value value, String valueName) {
    if (value == null) {
      throw new IllegalArgumentException("Value " + valueName + " cannot be null");
    }
    return value;
  }

  private int ensureNonNegative(int value, String valueName) {
    if (value < 0) {
      throw new IllegalArgumentException("Value " + valueName + " cannot be negative");
    }
    return value;
  }
}
