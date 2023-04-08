package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import com.project.employee.Employee;
import com.project.employee.EmployeePosition;
import com.project.employee.salarycalculator.EmployeeSalaryCalculator;
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

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDeveloperEmployeesAtThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsAtThreshold = 300000;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsAtThreshold,
      EmployeePosition.DEVELOPER
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.2;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsAtThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDeveloperEmployeesAboveThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsAtThreshold = 300001;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsAtThreshold,
      EmployeePosition.DEVELOPER
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.2;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsAtThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesBelowThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsBelowThreshold = 199999;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsBelowThreshold,
      EmployeePosition.DBA
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.15;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsBelowThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesAtThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsBelowThreshold = 200000;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsBelowThreshold,
      EmployeePosition.DBA
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.25;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsBelowThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesAboveThreshold() {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    int salaryInCentsBelowThreshold = 200001;
    Employee employeeWithSalaryBelowThreshold = createEmployeeWithDefaults(
      salaryInCentsBelowThreshold,
      EmployeePosition.DBA
    );

    int salaryInCents = calculator.calculateSalaryInCents(employeeWithSalaryBelowThreshold);

    double expectedDiscount = 0.25;
    int expectedSalaryInCents = (int) Math.floor(salaryInCentsBelowThreshold * (1 - expectedDiscount));

    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  private Employee createEmployeeWithDefaults(int baseSalaryInCents, EmployeePosition position) {
    return new Employee(employeeName, employeeEmail, baseSalaryInCents, position);
  }
}
