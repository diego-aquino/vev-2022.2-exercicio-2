package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void testEmployeeShouldInitializeCorrectly() {
    Employee employee = new Employee("Name", "email@email.com", 300000);
    assertEquals("Name", employee.getName());
    assertEquals("email@email.com", employee.getEmail());
    assertEquals(300000, employee.getSalaryInCents());
  }
}
