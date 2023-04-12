package com.project.employee.salarycalculator;

import com.project.employee.Employee;
import com.project.employee.EmployeePosition;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPosition;
import com.project.employee.salarycalculator.byposition.EmployeeSalaryCalculatorByPositionFactory;

public class EmployeeSalaryCalculator {

  private EmployeeSalaryCalculatorByPositionFactory calculatorByPositionFactory = new EmployeeSalaryCalculatorByPositionFactory();

  public int calculateSalaryInCents(Employee employee) {
    EmployeePosition position = employee.getPosition();
    EmployeeSalaryCalculatorByPosition calculatorByPosition = calculatorByPositionFactory.create(position);
    return calculatorByPosition.calculateSalaryInCents(employee);
  }
}
