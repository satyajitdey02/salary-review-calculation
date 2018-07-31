package com.cefalo.school.component;

public interface Employee {

  public void add(Employee employee) throws UnsupportedOperationException;

  public void remove(Employee employee) throws UnsupportedOperationException;

  public Employee getChild(int i) throws UnsupportedOperationException;

  public void print();

  public double calculateReview();
}
