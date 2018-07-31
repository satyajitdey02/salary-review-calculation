package com.cefalo.school.calculator;

public class DeveloperReviewCalculator extends ReviewCalculator {

  public DeveloperReviewCalculator(double salary, Score score) {
    super(salary, score);
  }

  public double countDeciplineScore() {
    return salary * (score.getDecipline() / 10) * 0.20; //Impact 20%
  }

  public double countProblemSolvingScore() {
    return salary * (score.getProblemSolving() / 10) * 0.50; //Impact 50%
  }

  public double countLeadershipScore() {
    return salary * (score.getLeaderShip() / 10) * 0.10; //Impact 10%
  }

  public double countCommunicationScore() {
    return salary * (score.getCommunication() / 10) * 0.10; //Impact 10%
  }

  public double countExperienceScore() {
    return salary * (score.getYearsOfExperience() / 10) * 0.10; //Impact 10%
  }
}
