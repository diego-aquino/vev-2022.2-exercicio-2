package com.project.employee.salarycalculator;

import com.project.employee.Employee;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPosition;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPositionFactory;

public class EmployeeSalaryCalculator {

  private EmployeeSalaryCalculatorByPositionFactory calculatorByPositionFactory = new EmployeeSalaryCalculatorByPositionFactory();

  public int calculateSalaryInCents(Employee employee) {
    EmployeeSalaryCalculatorByPosition calculatorByPosition = calculatorByPositionFactory.create(employee);
    return calculatorByPosition.calculateSalaryInCents(employee);
  }
}
