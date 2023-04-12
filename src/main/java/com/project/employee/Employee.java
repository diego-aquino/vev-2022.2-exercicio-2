package com.project.employee;

import com.project.validation.Validator;

public class Employee {

  private String name;
  private String email;
  private int baseSalaryInCents;
  private EmployeePosition position;

  public Employee(String name, String email, int baseSalaryInCents, EmployeePosition position) {
    Validator validator = new Validator();

    this.name = validator.ensureNonNull(name, "name");
    this.email = validator.ensureNonNull(email, "email");
    this.baseSalaryInCents = validator.ensureNonNegative(baseSalaryInCents, "baseSalaryInCents");
    this.position = validator.ensureNonNull(position, "position");
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
}
