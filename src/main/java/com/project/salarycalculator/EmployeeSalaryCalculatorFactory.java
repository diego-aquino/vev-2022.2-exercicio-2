package com.project.salarycalculator;

public class EmployeeSalaryCalculatorFactory {

  public DeveloperEmployeeSalaryCalculator create(Employee employee) {
    switch (employee.getPosition()) {
      case DEVELOPER:
        return new DeveloperEmployeeSalaryCalculator();
      default:
        throw new MissingEmployeeSalaryCalculatorForPosition(employee.getPosition());
    }
  }
}
