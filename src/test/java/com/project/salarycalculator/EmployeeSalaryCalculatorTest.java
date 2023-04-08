package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeSalaryCalculatorTest {

  private String employeeName = "Name";
  private String employeeEmail = "email@email.com";

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDeveloperEmployeesBelowThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsBelowThreshold = 299999;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsBelowThreshold,
      EmployeePosition.DEVELOPER
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.1;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsBelowThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  private Employee createEmployeeWithDefaults(int baseSalaryInCents, EmployeePosition position) {
    return new Employee(employeeName, employeeEmail, baseSalaryInCents, position);
  }
}
