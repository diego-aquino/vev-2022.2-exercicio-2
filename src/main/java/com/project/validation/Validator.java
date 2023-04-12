package com.project.validation;

public class Validator {

  public <Value> Value ensureNonNull(Value value, String valueName) {
    if (value == null) {
      throw new IllegalArgumentException("Value " + valueName + " cannot be null.");
    }
    return value;
  }

  public int ensureNonNegative(int value, String valueName) {
    if (value < 0) {
      throw new IllegalArgumentException("Value " + valueName + " cannot be negative.");
    }
    return value;
  }
}
