package com.project.employee.salarycalculator;

import com.project.employee.Employee;
import com.project.employee.EmployeePosition;

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
