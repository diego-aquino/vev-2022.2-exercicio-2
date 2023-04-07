package com.project.salarycalculator;

public class Employee {

  private String name;
  private String email;
  private int baseSalaryInCents;

  public Employee(String name, String email, int baseSalaryInCents) {
    this.name = name;
    this.email = email;
    this.baseSalaryInCents = baseSalaryInCents;
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
}
