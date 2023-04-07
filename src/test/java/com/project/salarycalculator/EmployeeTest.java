package com.project.salarycalculator;

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
  }

  @Test
  public void testEmployeeShouldBeADeveloper() {
    Employee employee = new Employee(
      employeeName,
      employeeEmail,
      employeeBaseSalaryInCents,
      EmployeePosition.DEVELOPER
    );

    assertEquals(EmployeePosition.DEVELOPER, employee.getPosition());
    assertEquals("DESENVOLVEDOR", employee.getPosition().toString());
  }

  @Test
  public void testEmployeeShouldBeADBA() {
    Employee employee = new Employee(employeeName, employeeEmail, employeeBaseSalaryInCents, EmployeePosition.DBA);

    assertEquals(EmployeePosition.DBA, employee.getPosition());
    assertEquals("DBA", employee.getPosition().toString());
  }

  @Test
  public void testEmployeeShouldBeATester() {
    Employee employee = new Employee(employeeName, employeeEmail, employeeBaseSalaryInCents, EmployeePosition.TESTER);

    assertEquals(EmployeePosition.TESTER, employee.getPosition());
    assertEquals("TESTADOR", employee.getPosition().toString());
  }

  @Test
  public void testEmployeeShouldBeAManager() {
    Employee employee = new Employee(employeeName, employeeEmail, employeeBaseSalaryInCents, EmployeePosition.MANAGER);

    assertEquals(EmployeePosition.MANAGER, employee.getPosition());
    assertEquals("GERENTE", employee.getPosition().toString());
  }
}
