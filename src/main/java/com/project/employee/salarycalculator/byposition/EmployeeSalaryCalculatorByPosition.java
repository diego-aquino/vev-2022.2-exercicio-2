package com.project.employee.salarycalculator.byposition;

import com.project.employee.Employee;

public abstract class EmployeeSalaryCalculatorByPosition {

  protected abstract int getSalaryThresholdInCents();

  protected abstract double getSalaryDiscountBelowThreshold();

  protected abstract double getSalaryDiscountAtOrAboveThreshold();

  public int calculateSalaryInCents(Employee employee) {
    int baseSalaryInCents = employee.getBaseSalaryInCents();
    return applyDiscountBasedOnThreshold(baseSalaryInCents);
  }

  protected int applyDiscountBasedOnThreshold(int baseSalaryInCents) {
    if (baseSalaryInCents < this.getSalaryThresholdInCents()) {
      double discount = this.getSalaryDiscountBelowThreshold();
      return this.applyDiscountToSalary(baseSalaryInCents, discount);
    } else {
      double discount = this.getSalaryDiscountAtOrAboveThreshold();
      return this.applyDiscountToSalary(baseSalaryInCents, discount);
    }
  }

  protected int applyDiscountToSalary(int salaryInCents, double discount) {
    return (int) Math.floor(salaryInCents * (1 - discount));
  }
}
