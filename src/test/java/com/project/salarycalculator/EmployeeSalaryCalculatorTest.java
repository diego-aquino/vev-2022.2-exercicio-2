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
  public void testCalculatorShouldUseCorrectDiscountForDevelopersBelowThreshold() {
    int salaryInCentsBelowThreshold = 299999;
    double expectedDiscount = 0.1;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDevelopersAtThreshold() {
    int salaryInCentsAtThreshold = 300000;
    double expectedDiscount = 0.2;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDevelopersAboveThreshold() {
    int salaryInCentsAboveThreshold = 300001;
    double expectedDiscount = 0.2;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsAboveThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAsBelowThreshold() {
    int salaryInCentsBelowThreshold = 199999;
    double expectedDiscount = 0.15;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAsAtThreshold() {
    int salaryInCentsAtThreshold = 200000;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAsAboveThreshold() {
    int salaryInCentsAboveThreshold = 200001;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsAboveThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTestersBelowThreshold() {
    int salaryInCentsBelowThreshold = 199999;
    double expectedDiscount = 0.15;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTestersAtThreshold() {
    int salaryInCentsAtThreshold = 200000;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTestersAboveThreshold() {
    int salaryInCentsAboveThreshold = 200001;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsAboveThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForManagersBelowThreshold() {
    int salaryInCentsBelowThreshold = 499999;
    double expectedDiscount = 0.2;
    testEmployeeSalary(EmployeePosition.MANAGER, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForManagersAtThreshold() {
    int salaryInCentsAtThreshold = 500000;
    double expectedDiscount = 0.3;
    testEmployeeSalary(EmployeePosition.MANAGER, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForManagersAboveThreshold() {
    int salaryInCentsAboveThreshold = 500001;
    double expectedDiscount = 0.3;
    testEmployeeSalary(EmployeePosition.MANAGER, salaryInCentsAboveThreshold, expectedDiscount);
  }

  private void testEmployeeSalary(EmployeePosition position, int baseSalaryInCents, double expectedDiscount) {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    Employee employee = createEmployeeWithDefaults(baseSalaryInCents, position);

    int salaryInCents = calculator.calculateSalaryInCents(employee);
    int expectedSalaryInCents = (int) Math.floor(baseSalaryInCents * (1 - expectedDiscount));
    assertEquals(expectedSalaryInCents, salaryInCents);
  }

  private Employee createEmployeeWithDefaults(int baseSalaryInCents, EmployeePosition position) {
    return new Employee(employeeName, employeeEmail, baseSalaryInCents, position);
  }
}
