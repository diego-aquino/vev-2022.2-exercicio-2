package com.project.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

  private String name = "Name";
  private String email = "email@email.com";
  private int baseSalaryInCents = 300000;

  @Test
  public void testEmployeeShouldInitializeCorrectly() {
    Employee employee = new Employee(name, email, baseSalaryInCents, EmployeePosition.DEVELOPER);

    assertEquals(name, employee.getName());
    assertEquals(email, employee.getEmail());
    assertEquals(baseSalaryInCents, employee.getBaseSalaryInCents());
    assertEquals(EmployeePosition.DEVELOPER, employee.getPosition());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfNameIsNull() {
    String nullName = null;
    new Employee(nullName, email, baseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfEmailIsNull() {
    String nullEmail = null;
    new Employee(name, nullEmail, baseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfBaseSalaryIsNegative() {
    int negativeBaseSalaryInCents = -1;
    new Employee(name, email, negativeBaseSalaryInCents, EmployeePosition.DEVELOPER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmployeeShouldThrowAnErrorIfPositionIsNull() {
    EmployeePosition nullPosition = null;
    new Employee(name, email, baseSalaryInCents, nullPosition);
  }
}
