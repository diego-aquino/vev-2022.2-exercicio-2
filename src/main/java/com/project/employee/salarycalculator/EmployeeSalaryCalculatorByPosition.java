package com.project.employee.salarycalculator;

import com.project.employee.Employee;

public abstract class EmployeeSalaryCalculatorByPosition {

  abstract int calculateSalaryInCents(Employee employee);

  protected int applyDiscountToSalary(int salaryInCents, double discount) {
    return (int) Math.floor(salaryInCents * (1 - discount));
  }
}
