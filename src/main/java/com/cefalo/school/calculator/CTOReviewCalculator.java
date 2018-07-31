package com.cefalo.school.calculator;

public class CTOReviewCalculator extends ReviewCalculator {

    /*TODO: Abstract the Impacts(could be Strategy Pattern)
    so that new impacts can be applied in every review time*/

  public CTOReviewCalculator(double salary, Score score) {
    super(salary, score);
  }

  public double countDeciplineScore() {
    return salary * (score.getDecipline() / 10) * 0.05; //Impact 5%
  }

  public double countProblemSolvingScore() {
    return salary * (score.getProblemSolving() / 10) * 0.05; //Impact 5%
  }

  public double countLeadershipScore() {
    return salary * (score.getLeaderShip() / 10) * 0.30; //Impact 30%
  }

  public double countCommunicationScore() {
    return salary * (score.getCommunication() / 10) * 0.30; //Impact 30%
  }

  public double countExperienceScore() {
    return salary * (score.getYearsOfExperience() / 10) * 0.30; //Impact 30%
  }
}
