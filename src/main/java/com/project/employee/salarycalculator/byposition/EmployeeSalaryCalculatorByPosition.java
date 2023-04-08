package com.project.employee.salarycalculator.byposition;

import com.project.employee.Employee;

public abstract class EmployeeSalaryCalculatorByPosition {

  public abstract int calculateSalaryInCents(Employee employee);

  protected int applyDiscountToSalary(int salaryInCents, double discount) {
    return (int) Math.floor(salaryInCents * (1 - discount));
  }
}
