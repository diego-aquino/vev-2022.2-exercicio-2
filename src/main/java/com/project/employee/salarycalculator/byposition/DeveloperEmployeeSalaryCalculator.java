package com.project.employee.salarycalculator.byposition;

import com.project.employee.Employee;

public class DeveloperEmployeeSalaryCalculator extends EmployeeSalaryCalculatorByPosition {

  private static final int SALARY_THRESHOLD_IN_CENTS = 300000;
  private static final double SALARY_DISCOUNT_BELOW_THRESHOLD = 0.1;
  private static final double SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD = 0.2;

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();

    if (baseSalaryInCents < SALARY_THRESHOLD_IN_CENTS) {
      return this.applyDiscountToSalary(baseSalaryInCents, SALARY_DISCOUNT_BELOW_THRESHOLD);
    } else {
      return this.applyDiscountToSalary(baseSalaryInCents, SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD);
    }
  }
}
