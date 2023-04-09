package com.project.salarycalculator;

import static org.junit.Assert.assertEquals;

import com.project.employee.EmployeePosition;
import org.junit.Test;

public class EmployeePositionTest {

  @Test
  public void testPositionDeveloperShouldHaveCorrectTitle() {
    assertEquals("DESENVOLVEDOR", EmployeePosition.DEVELOPER.getTitle());
  }

  @Test
  public void testPositionDBAShouldHaveCorrectTitle() {
    assertEquals("DBA", EmployeePosition.DBA.getTitle());
  }

  @Test
  public void testPositionTesterShouldHaveCorrectTitle() {
    assertEquals("TESTADOR", EmployeePosition.TESTER.getTitle());
  }

  @Test
  public void testPositionManagerShouldHaveCorrectTitle() {
    assertEquals("GERENTE", EmployeePosition.MANAGER.getTitle());
  }
}
