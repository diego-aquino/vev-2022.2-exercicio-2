package com.project.employee.salarycalculator;

import com.project.employee.Employee;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPosition;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPositionFactory;

public class EmployeeSalaryCalculator {

  private EmployeeSalaryCalculatorByPositionFactory calculatorFactory = new EmployeeSalaryCalculatorByPositionFactory();

  public int calculateSalaryInCents(Employee employee) {
    EmployeeSalaryCalculatorByPosition calculator = calculatorFactory.create(employee);
    return calculator.calculateSalaryInCents(employee);
  }
}
