package com.cefalo.school.calculator;

public abstract class ReviewCalculator {

  double salary;
  Score score;

  public ReviewCalculator(double salary, Score score) {
    this.salary = salary;
    this.score = score;
  }

  public double calculate() {

    double result = this.salary;
    result += countBaseScore();
    result += countDeciplineScore();
    result += countProblemSolvingScore();
    result += countLeadershipScore();
    result += countCommunicationScore();
    result += countExperienceScore();

    return result;
  }

  public double countBaseScore() {
    return this.salary * 0.05;
  }

  public abstract double countDeciplineScore();

  public abstract double countProblemSolvingScore();

  public abstract double countLeadershipScore();

  public abstract double countCommunicationScore();

  public abstract double countExperienceScore();

}
