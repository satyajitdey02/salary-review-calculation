package com.cefalo.school.sln;

import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;
import com.cefalo.school.sln.Contracts.Indentation;
import com.cefalo.school.sln.Contracts.Resource;
import com.cefalo.school.sln.Contracts.Management;

public class TeamLead extends Management {

    private String teamName;
    private Score teamScore;

    public TeamLead(String name,String teamName, double salary, Score teamScore) {
        this.name = name;
        this.salary = salary;
        this.teamName = teamName;
        this.teamScore = teamScore;
        this.reviewCalculator = new ReviewCalculator(this.salary,this.teamScore, ImpactDefinition.getImpact(this.getClass()));
    }

    @Override
    public void printOwnResult(Indentation indentation) {

        System.out.println(indentation.apply(String.format("I am Team lead. My identity is : Name = %s, TeamName = %s, Previous Salary = %f," +
                " Current Salary : %f",this.name,this.teamName, this.salary,this.getOwnValue())));
        System.out.println(indentation.apply("Total expense of my team is : " + this.getTotalValue()));
        System.out.println(indentation.apply("Status of the resources under me :"));
        this.printChildrensResult(indentation);
    }
    
}