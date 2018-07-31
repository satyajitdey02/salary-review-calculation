package com.cefalo.school.component;

import com.cefalo.school.calculator.DeveloperReviewCalculator;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Developer implements Employee {

  String name;
  String teamName;
  double salary;
  Score score;

  ReviewCalculator calculator;

  public Developer(String name, String teamName, double salary, Score score) {
    this.name = name;
    this.teamName = teamName;
    this.salary = salary;
    this.score = score;
    this.calculator = new DeveloperReviewCalculator(salary, score);
  }

  public void add(Employee employee) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("Adding child not allowed.");
  }

  public void remove(Employee employee) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("Nothing to remove.");
  }

  public Employee getChild(int i) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("No child available.");
  }

  public void print() {
    System.out.printf("%s---%s---%.2f%n", name, teamName, calculator.calculate());
  }

  public double calculateReview()  {
    return calculator.calculate();
  }

  //TODO: Separate individual review
}
