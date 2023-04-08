package com.project.salarycalculator;

public class MissingEmployeeSalaryCalculatorForPosition extends UnsupportedOperationException {

  public MissingEmployeeSalaryCalculatorForPosition(EmployeePosition position) {
    super("No salary calculator exists for position " + position.getTitle());
  }
}
