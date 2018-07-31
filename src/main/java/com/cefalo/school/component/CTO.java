package com.cefalo.school.component;

import com.cefalo.school.calculator.CTOReviewCalculator;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

import java.util.ArrayList;
import java.util.List;

public class CTO implements Employee {

  String name;
  double salary;
  Score score;

  ReviewCalculator calculator;

  List<Employee> projectManagers = new ArrayList<Employee>();

  public CTO(String name, double salary, Score score) {
    this.name = name;
    this.salary = salary;
    this.score = score;
    this.calculator = new CTOReviewCalculator(salary, score);
  }

  public void add(Employee employee) throws UnsupportedOperationException {
    projectManagers.add(employee);
  }

  public void remove(Employee employee) throws UnsupportedOperationException {
    projectManagers.remove(employee);
  }

  public Employee getChild(int i) throws UnsupportedOperationException {
    return projectManagers.get(i);
  }

  public void print() {
    System.out.printf("Name: %s---Review: %.2f%n", name, calculator.calculate());
    for (Employee employee : projectManagers) {
      employee.print();
    }
  }

  public double calculateReview() {
    double result = calculator.calculate();
    for (Employee employee : projectManagers) {
      result += employee.calculateReview();
    }

    return result;
  }
}
