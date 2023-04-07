package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void testEmployeeShouldHaveAName() {
    Employee employee = new Employee("Name");
    assertEquals("Name", employee.getName());
  }
}
