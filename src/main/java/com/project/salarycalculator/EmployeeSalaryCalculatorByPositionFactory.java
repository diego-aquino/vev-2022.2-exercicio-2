package com.project.salarycalculator;

public class EmployeeSalaryCalculatorByPositionFactory {

  public EmployeeSalaryCalculatorByPosition create(Employee employee) {
    EmployeePosition position = employee.getPosition();

    switch (position) {
      case DEVELOPER:
        return new DeveloperEmployeeSalaryCalculator();
      default:
        throw new MissingEmployeeSalaryCalculatorByPosition(position);
    }
  }
}
