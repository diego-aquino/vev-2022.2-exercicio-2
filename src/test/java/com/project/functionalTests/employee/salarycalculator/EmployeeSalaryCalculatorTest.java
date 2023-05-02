package com.project.functionalTests.employee.salarycalculator;

import static org.junit.Assert.assertEquals;

import com.project.employee.Employee;
import com.project.employee.EmployeePosition;
import com.project.employee.salarycalculator.EmployeeSalaryCalculator;
import org.junit.Test;

public class EmployeeSalaryCalculatorTest {

  private String employeeName = "Name";
  private String employeeEmail = "email@email.com";

  @Test(expected = IllegalArgumentException.class)
  public void testCalculatorShouldThrowErrorOnNegativeDeveloperSalary() {
    int baseSalaryInCents = -1;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldReturnZeroIfDeveloperSalaryIsZero() {
    int baseSalaryInCents = 0;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryJustAboveZero() {
    int baseSalaryInCents = 1;
    int expectedSalaryInCents = 1;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryBetweenZeroAndThreshold() {
    int baseSalaryInCents = 250000;
    int expectedSalaryInCents = 225000;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryJustBelowThreshold() {
    int baseSalaryInCents = 299999;
    int expectedSalaryInCents = 269999;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryAtThreshold() {
    int baseSalaryInCents = 300000;
    int expectedSalaryInCents = 240000;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryJustAboveThreshold() {
    int baseSalaryInCents = 300001;
    int expectedSalaryInCents = 240001;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDeveloperSalaryAboveThreshold() {
    int baseSalaryInCents = 350000;
    int expectedSalaryInCents = 280000;
    testEmployeeSalary(EmployeePosition.DEVELOPER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCalculatorShouldThrowErrorOnNegativeDBASalary() {
    int baseSalaryInCents = -1;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldReturnZeroIfDBASalaryIsZero() {
    int baseSalaryInCents = 0;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryJustAboveZero() {
    int baseSalaryInCents = 1;
    int expectedSalaryInCents = 1;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryBetweenZeroAndThreshold() {
    int baseSalaryInCents = 150000;
    int expectedSalaryInCents = 127500;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryJustBelowThreshold() {
    int baseSalaryInCents = 199999;
    int expectedSalaryInCents = 169999;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryAtThreshold() {
    int baseSalaryInCents = 200000;
    int expectedSalaryInCents = 150000;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryJustAboveThreshold() {
    int baseSalaryInCents = 200001;
    int expectedSalaryInCents = 150001;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnDBASalaryAboveThreshold() {
    int baseSalaryInCents = 250000;
    int expectedSalaryInCents = 187500;
    testEmployeeSalary(EmployeePosition.DBA, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCalculatorShouldThrowErrorOnNegativeTesterSalary() {
    int baseSalaryInCents = -1;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldReturnZeroIfTesterSalaryIsZero() {
    int baseSalaryInCents = 0;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryJustAboveZero() {
    int baseSalaryInCents = 1;
    int expectedSalaryInCents = 1;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryBetweenZeroAndThreshold() {
    int baseSalaryInCents = 150000;
    int expectedSalaryInCents = 127500;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryJustBelowThreshold() {
    int baseSalaryInCents = 199999;
    int expectedSalaryInCents = 169999;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryAtThreshold() {
    int baseSalaryInCents = 200000;
    int expectedSalaryInCents = 150000;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryJustAboveThreshold() {
    int baseSalaryInCents = 200001;
    int expectedSalaryInCents = 150001;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnTesterSalaryAboveThreshold() {
    int baseSalaryInCents = 250000;
    int expectedSalaryInCents = 187500;
    testEmployeeSalary(EmployeePosition.TESTER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCalculatorShouldThrowErrorOnNegativeManagerSalary() {
    int baseSalaryInCents = -1;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldReturnZeroIfManagerSalaryIsZero() {
    int baseSalaryInCents = 0;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryJustAboveZero() {
    int baseSalaryInCents = 1;
    int expectedSalaryInCents = 1;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryBetweenZeroAndThreshold() {
    int baseSalaryInCents = 450000;
    int expectedSalaryInCents = 360000;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryJustBelowThreshold() {
    int baseSalaryInCents = 499999;
    int expectedSalaryInCents = 399999;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryAtThreshold() {
    int baseSalaryInCents = 500000;
    int expectedSalaryInCents = 350000;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryJustAboveThreshold() {
    int baseSalaryInCents = 500001;
    int expectedSalaryInCents = 350001;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountOnManagerSalaryAboveThreshold() {
    int baseSalaryInCents = 550000;
    int expectedSalaryInCents = 385000;
    testEmployeeSalary(EmployeePosition.MANAGER, baseSalaryInCents, expectedSalaryInCents);
  }

  private void testEmployeeSalary(EmployeePosition position, int baseSalaryInCents) {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    Employee employee = createEmployeeWithDefaults(baseSalaryInCents, position);
    calculator.calculateSalaryInCents(employee);
  }

  private void testEmployeeSalary(EmployeePosition position, int baseSalaryInCents, int expectedSalaryInCents) {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    Employee employee = createEmployeeWithDefaults(baseSalaryInCents, position);
    int salaryInCents = calculator.calculateSalaryInCents(employee);
    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  private Employee createEmployeeWithDefaults(int baseSalaryInCents, EmployeePosition position) {
    return new Employee(employeeName, employeeEmail, baseSalaryInCents, position);
  }
}
