package com.project.employee.salarycalculator.byposition;

public class ManagerEmployeeSalaryCalculator extends EmployeeSalaryCalculatorByPosition {

  @Override
  protected int getSalaryThresholdInCents() {
    return 500000;
  }

  @Override
  protected double getSalaryDiscountBelowThreshold() {
    return 0.2;
  }

  @Override
  protected double getSalaryDiscountAtOrAboveThreshold() {
    return 0.3;
  }
}
