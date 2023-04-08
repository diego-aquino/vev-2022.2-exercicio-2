package com.project.salarycalculator;

public class EmployeeSalaryCalculator {

  private EmployeeSalaryCalculatorFactory calculatorFactory = new EmployeeSalaryCalculatorFactory();

  public int calculateSalaryInCents(Employee employee) {
    DeveloperEmployeeSalaryCalculator calculator = calculatorFactory.create(employee);
    return calculator.calculateSalaryInCents(employee);
  }
}
