package com.project.salarycalculator;

public class DeveloperEmployeeSalaryCalculator {

  private static final int SALARY_THRESHOLD_IN_CENTS = 300000;
  private static final double SALARY_DISCOUNT_BELOW_THRESHOLD = 0.1;
  private static final double SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD = 0.2;

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();

    if (baseSalaryInCents < SALARY_THRESHOLD_IN_CENTS) {
      return (int) Math.floor(baseSalaryInCents * (1 - SALARY_DISCOUNT_BELOW_THRESHOLD));
    } else {
      return (int) Math.floor(baseSalaryInCents * (1 - SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD));
    }
  }
}
