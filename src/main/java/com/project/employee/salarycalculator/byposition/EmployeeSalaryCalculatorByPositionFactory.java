package com.project.employee.salarycalculator.byposition;

import com.project.employee.Employee;
import com.project.employee.EmployeePosition;

public class EmployeeSalaryCalculatorByPositionFactory {

  public EmployeeSalaryCalculatorByPosition create(Employee employee) {
    EmployeePosition position = employee.getPosition();

    switch (position) {
      case DEVELOPER:
        return new DeveloperEmployeeSalaryCalculator();
      case DBA:
        return new DBAEmployeeSalaryCalculator();
      case TESTER:
        return new TesterEmployeeSalaryCalculator();
      case MANAGER:
        return new ManagerEmployeeSalaryCalculator();
      default:
        throw new MissingEmployeeSalaryCalculatorByPosition(position);
    }
  }
}
