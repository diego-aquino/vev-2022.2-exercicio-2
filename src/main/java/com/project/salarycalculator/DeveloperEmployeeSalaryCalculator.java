package com.project.salarycalculator;

public class DeveloperEmployeeSalaryCalculator {

  private static final double DISCOUNT = 0.1;

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();
    return (int) Math.floor(baseSalaryInCents * (1 - DISCOUNT));
  }
}
