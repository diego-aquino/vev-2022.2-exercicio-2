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
    int salaryInCentsBelowThreshold = 299999;
    double expectedDiscount = 0.1;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDeveloperEmployeesAtThreshold() {
    int salaryInCentsAtThreshold = 300000;
    double expectedDiscount = 0.2;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDeveloperEmployeesAboveThreshold() {
    int salaryInCentsAboveThreshold = 300001;
    double expectedDiscount = 0.2;
    testEmployeeSalary(EmployeePosition.DEVELOPER, salaryInCentsAboveThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesBelowThreshold() {
    int salaryInCentsBelowThreshold = 199999;
    double expectedDiscount = 0.15;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesAtThreshold() {
    int salaryInCentsAtThreshold = 200000;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForDBAEmployeesAboveThreshold() {
    int salaryInCentsAboveThreshold = 200001;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.DBA, salaryInCentsAboveThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTesterEmployeesBelowThreshold() {
    int salaryInCentsBelowThreshold = 199999;
    double expectedDiscount = 0.15;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsBelowThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTesterEmployeesAtThreshold() {
    int salaryInCentsAtThreshold = 200000;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsAtThreshold, expectedDiscount);
  }

  @Test
  public void testCalculatorShouldUseCorrectDiscountForTesterEmployeesAboveThreshold() {
    int salaryInCentsAboveThreshold = 200001;
    double expectedDiscount = 0.25;
    testEmployeeSalary(EmployeePosition.TESTER, salaryInCentsAboveThreshold, expectedDiscount);
  }

  private Employee createEmployeeWithDefaults(int baseSalaryInCents, EmployeePosition position) {
    return new Employee(employeeName, employeeEmail, baseSalaryInCents, position);
  }

  private void testEmployeeSalary(EmployeePosition position, int baseSalaryInCents, double expectedDiscount) {
    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    Employee employee = createEmployeeWithDefaults(baseSalaryInCents, position);

    int salaryInCents = calculator.calculateSalaryInCents(employee);
    int expectedSalaryInCents = (int) Math.floor(baseSalaryInCents * (1 - expectedDiscount));
    assertEquals(expectedSalaryInCents, salaryInCents);
  }
}
