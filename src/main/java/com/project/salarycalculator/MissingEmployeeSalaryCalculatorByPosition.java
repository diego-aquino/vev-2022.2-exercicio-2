package com.project.salarycalculator;

public class MissingEmployeeSalaryCalculatorByPosition extends UnsupportedOperationException {

  public MissingEmployeeSalaryCalculatorByPosition(EmployeePosition position) {
    super("No salary calculator exists for position " + position.getTitle());
  }
}
