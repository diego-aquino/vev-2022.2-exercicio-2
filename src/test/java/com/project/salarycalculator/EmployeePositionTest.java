package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeePositionTest {

  @Test
  public void testEmployeePositionDeveloperShouldHaveCorrectTitle() {
    assertEquals("DESENVOLVEDOR", EmployeePosition.DEVELOPER.getTitle());
  }

  @Test
  public void testEmployeePositionDBAShouldHaveCorrectTitle() {
    assertEquals("DBA", EmployeePosition.DBA.getTitle());
  }

  @Test
  public void testEmployeePositionTesterShouldHaveCorrectTitle() {
    assertEquals("TESTADOR", EmployeePosition.TESTER.getTitle());
  }

  @Test
  public void testEmployeePositionManagerShouldHaveCorrectTitle() {
    assertEquals("GERENTE", EmployeePosition.MANAGER.getTitle());
  }
}
