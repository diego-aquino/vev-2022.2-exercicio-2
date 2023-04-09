package com.project.employee.salarycalculator.byposition;

import com.project.employee.Employee;

public abstract class EmployeeSalaryCalculatorByPosition {

  protected abstract int getSalaryThresholdInCents();

  protected abstract double getSalaryDiscountBelowThreshold();

  protected abstract double getSalaryDiscountAtOrAboveThreshold();

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();
    return calculateSalaryInCentsWithDiscounts(baseSalaryInCents);
  }

  protected int calculateSalaryInCentsWithDiscounts(int baseSalaryInCents) {
    int salaryThresholdInCents = getSalaryThresholdInCents();
    double discount = baseSalaryInCents < salaryThresholdInCents
      ? getSalaryDiscountBelowThreshold()
      : getSalaryDiscountAtOrAboveThreshold();

    return applyDiscountToSalary(baseSalaryInCents, discount);
  }

  protected int applyDiscountToSalary(int salaryInCents, double discount) {
    return (int) Math.floor(salaryInCents * (1 - discount));
  }
}
