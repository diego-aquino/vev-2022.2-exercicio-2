package com.project.salarycalculator;

public class EmployeeSalaryCalculator {

  private EmployeeSalaryCalculatorByPositionFactory calculatorFactory = new EmployeeSalaryCalculatorByPositionFactory();

  public int calculateSalaryInCents(Employee employee) {
    EmployeeSalaryCalculatorByPosition calculator = calculatorFactory.create(employee);
    return calculator.calculateSalaryInCents(employee);
  }
}
