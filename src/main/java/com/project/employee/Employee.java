package com.project.employee;

public class Employee {

  private String name;
  private String email;
  private int baseSalaryInCents;
  private EmployeePosition position;

  public Employee(String name, String email, int baseSalaryInCents, EmployeePosition position) {
    this.name = name;
    this.email = email;
    this.baseSalaryInCents = baseSalaryInCents;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public int getBaseSalaryInCents() {
    return this.baseSalaryInCents;
  }

  public EmployeePosition getPosition() {
    return position;
  }
}
