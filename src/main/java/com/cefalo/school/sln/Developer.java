package com.cefalo.school.sln;

import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;
import com.cefalo.school.sln.Contracts.EntryLevelEmployee;
import com.cefalo.school.sln.Contracts.Indentation;

public class Developer extends EntryLevelEmployee {
    private String teamName;
    private Score devScore;
    public Developer(String name, String teamName, Double salary, Score devScore) {
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
        this.devScore = devScore;
        this.reviewCalculator = new ReviewCalculator(this.salary,this.devScore, ImpactDefinition.getImpact(this.getClass()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Score getDevScore() {
        return devScore;
    }

    public void setDevScore(Score devScore) {
        this.devScore = devScore;
    }

    @Override
    protected double getTotalValue() {
        return this.getOwnValue();
    }

    @Override
    public void printOwnResult(Indentation indentation) {

        System.out.println(indentation.apply(String.format("I am developer. My identity is: Name = %s,TeamName = %s,Previous Salary = %f," +
                "Current Salary : %f",this.name,this.teamName, this.salary,this.getOwnValue())));
    }
}
