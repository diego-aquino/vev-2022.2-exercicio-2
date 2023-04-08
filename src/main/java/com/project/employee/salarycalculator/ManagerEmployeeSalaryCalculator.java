package com.project.employee.salarycalculator;

import com.project.employee.Employee;

public class ManagerEmployeeSalaryCalculator extends EmployeeSalaryCalculatorByPosition {

  private static final int SALARY_THRESHOLD_IN_CENTS = 500000;
  private static final double SALARY_DISCOUNT_BELOW_THRESHOLD = 0.2;
  private static final double SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD = 0.3;

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();

    if (baseSalaryInCents < SALARY_THRESHOLD_IN_CENTS) {
      return this.applyDiscountToSalary(baseSalaryInCents, SALARY_DISCOUNT_BELOW_THRESHOLD);
    } else {
      return this.applyDiscountToSalary(baseSalaryInCents, SALARY_DISCOUNT_AT_OR_ABOVE_THRESHOLD);
    }
  }
}
