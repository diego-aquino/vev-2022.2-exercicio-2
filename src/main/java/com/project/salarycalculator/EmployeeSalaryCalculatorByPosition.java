package com.project.salarycalculator;

public abstract class EmployeeSalaryCalculatorByPosition {

  abstract int calculateSalaryInCents(Employee employee);

  protected int applyDiscountToSalary(int salaryInCents, double discount) {
    return (int) Math.floor(salaryInCents * (1 - discount));
  }
}
