package com.project.salarycalculator;

public class Employee {

  private String name;
  private String email;
  private int salaryInCents;

  public Employee(String name, String email, int salaryInCents) {
    this.name = name;
    this.email = email;
    this.salaryInCents = salaryInCents;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public int getSalaryInCents() {
    return this.salaryInCents;
  }
}
