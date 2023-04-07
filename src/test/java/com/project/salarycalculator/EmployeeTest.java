package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

  private String employeeName = "Name";
  private String employeeEmail = "email@email.com";
  private int employeeBaseSalaryInCents = 300000;

  @Test
  public void testEmployeeShouldInitializeCorrectly() {
    Employee employee = new Employee(employeeName, employeeEmail, employeeBaseSalaryInCents);
    assertEquals(employeeName, employee.getName());
    assertEquals(employeeEmail, employee.getEmail());
    assertEquals(employeeBaseSalaryInCents, employee.getBaseSalaryInCents());
  }
}
