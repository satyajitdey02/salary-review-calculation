package com.cefalo.school.component;

import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;
import com.cefalo.school.calculator.TeamLeaderReviewCalculator;

import java.util.ArrayList;
import java.util.List;

public class TeamLead implements Employee {

  String name;
  String teamName;
  double salary;
  Score score;

  ReviewCalculator calculator;

  List<Employee> developers = new ArrayList<Employee>();

  public TeamLead(String name, String teamName, double salary, Score score) {
    this.name = name;
    this.teamName = teamName;
    this.salary = salary;
    this.score = score;
    this.calculator = new TeamLeaderReviewCalculator(salary, score);
  }

  public void add(Employee employee) throws UnsupportedOperationException {
    developers.add(employee);
  }

  public void remove(Employee employee) throws UnsupportedOperationException {
    developers.remove(employee);
  }

  public Employee getChild(int i) throws UnsupportedOperationException {
    return developers.get(i);
  }

  public void print() {
    System.out.printf("Name: %s---Team: %s---Review: %.2f%n",
        name, teamName, calculator.calculate());
    for (Employee employee : developers) {
      employee.print();
    }
  }

  public double calculateReview() {
    double result = calculator.calculate();
    for (Employee employee : developers) {
      result += employee.calculateReview();
    }

    return result;
  }
}
