package com.project.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

  private String employeeName = "Name";
  private String employeeEmail = "email@email.com";
  private int employeeBaseSalaryInCents = 300000;

  @Test
  public void testEmployeeShouldInitializeCorrectly() {
    Employee employee = new Employee(
      employeeName,
      employeeEmail,
      employeeBaseSalaryInCents,
      EmployeePosition.DEVELOPER
    );

    assertEquals(employeeName, employee.getName());
    assertEquals(employeeEmail, employee.getEmail());
    assertEquals(employeeBaseSalaryInCents, employee.getBaseSalaryInCents());
    assertEquals(EmployeePosition.DEVELOPER, employee.getPosition());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfNameIsNull() {
    String nullEmployeeName = null;
    new Employee(nullEmployeeName, employeeEmail, employeeBaseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfEmailIsNull() {
    String nullEmployeeEmail = null;
    new Employee(employeeName, nullEmployeeEmail, employeeBaseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfBaseSalaryIsNegative() {
    int negativeEmployeeBaseSalaryInCents = -1;
    new Employee(employeeName, employeeEmail, negativeEmployeeBaseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfPositionIsNull() {
    EmployeePosition nullEmployeePosition = null;
    new Employee(employeeName, employeeEmail, employeeBaseSalaryInCents, nullEmployeePosition);
  }
}
