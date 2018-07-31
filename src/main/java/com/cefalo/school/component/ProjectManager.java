package com.cefalo.school.component;

import com.cefalo.school.calculator.ProjectManagerReviewCalculator;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Employee {

  String name;
  String projectName;
  double salary;
  Score score;

  ReviewCalculator calculator;

  List<Employee> teamLeaders = new ArrayList<Employee>();

  public ProjectManager(String name, String projectName, double salary, Score score) {
    this.name = name;
    this.projectName = projectName;
    this.salary = salary;
    this.score = score;
    this.calculator = new ProjectManagerReviewCalculator(salary, score);
  }

  public void add(Employee employee) throws UnsupportedOperationException {
    teamLeaders.add(employee);
  }

  public void remove(Employee employee) throws UnsupportedOperationException {
    teamLeaders.remove(employee);
  }

  public Employee getChild(int i) throws UnsupportedOperationException {
    return teamLeaders.get(i);
  }

  public void print() {
    System.out.printf("Name: %s---Project: %s---Review: %.2f%n",
        name, projectName, calculator.calculate());
    for (Employee employee : teamLeaders) {
      employee.print();
    }
  }

  public double calculateReview() {
    double result = calculator.calculate();
    for (Employee employee : teamLeaders) {
      result += employee.calculateReview();
    }

    return result;
  }
}
