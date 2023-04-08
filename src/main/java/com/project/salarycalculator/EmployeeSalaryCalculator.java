package com.project.salarycalculator;

public class EmployeeSalaryCalculator {

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();
    return (int) Math.floor(baseSalaryInCents * 0.9);
  }
}
