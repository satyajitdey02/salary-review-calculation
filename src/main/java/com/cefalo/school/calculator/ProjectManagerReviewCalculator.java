package com.cefalo.school.calculator;

public class ProjectManagerReviewCalculator extends ReviewCalculator {

  public ProjectManagerReviewCalculator(double salary, Score score) {
    super(salary, score);
  }

  public double countDeciplineScore() {
    return salary * (score.getDecipline() / 10) * 0.10; //Impact 10%
  }

  public double countProblemSolvingScore() {
    return salary * (score.getProblemSolving() / 10) * 0.10; //Impact 10%
  }

  public double countLeadershipScore() {
    return salary * (score.getLeaderShip() / 10) * 0.30; //Impact 30%
  }

  public double countCommunicationScore() {
    return salary * (score.getCommunication() / 10) * 0.20; //Impact 20%
  }

  public double countExperienceScore() {
    return salary * (score.getYearsOfExperience() / 10) * 0.20; //Impact 20%
  }
}
