package com.project.employee.salarycalculator.byposition;

public class DBAEmployeeSalaryCalculator extends EmployeeSalaryCalculatorByPosition {

  @Override
  protected int getSalaryThresholdInCents() {
    return 200000;
  }

  @Override
  protected double getSalaryDiscountBelowThreshold() {
    return 0.15;
  }

  @Override
  protected double getSalaryDiscountAtOrAboveThreshold() {
    return 0.25;
  }
}
