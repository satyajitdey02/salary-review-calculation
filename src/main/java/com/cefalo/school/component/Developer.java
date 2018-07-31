package com.cefalo.school.component;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Developer implements Employee {

    private final String name;
    private final String teamName;
    private final double salary;
    private final Score score;

    private final ReviewCalculator calculator;

    public Developer(String name, String teamName, double salary, Score score) {
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
        this.score = score;
        Impact impact = new Impact(0.20, 0.5, 0.1, 0.1, 0.1);
        this.calculator = new ReviewCalculator(salary, score, impact);
    }

    @Override
    public void print() {
        System.out.printf("%s---%s---%.2f%n", name, teamName, calculator.calculate());
    }

    public double calculateReview() {
        return calculator.calculate();
    }
}
