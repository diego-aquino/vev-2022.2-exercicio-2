package com.project.employee.salarycalculator.byposition;

import com.project.employee.EmployeePosition;

public class MissingEmployeeSalaryCalculatorByPosition extends UnsupportedOperationException {

  public MissingEmployeeSalaryCalculatorByPosition(EmployeePosition position) {
    super("No salary calculator exists for position " + position.getTitle());
  }
}
