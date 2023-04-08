package com.project.employee.salarycalculator.byposition;

public class DeveloperEmployeeSalaryCalculator extends EmployeeSalaryCalculatorByPosition {

  @Override
  protected int getSalaryThresholdInCents() {
    return 300000;
  }

  @Override
  protected double getSalaryDiscountBelowThreshold() {
    return 0.1;
  }

  @Override
  protected double getSalaryDiscountAtOrAboveThreshold() {
    return 0.2;
  }
}
