package com.cefalo.school.sln;

import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;
import com.cefalo.school.sln.Contracts.Indentation;
import com.cefalo.school.sln.Contracts.Management;

public class ProjectManager extends Management {

    private String projectName;
    private Score projectScore;

    public ProjectManager(String name,String projectName, double salary, Score projectScore) {
        this.name = name;
        this.salary = salary;
        this.projectName = projectName;
        this.projectScore = projectScore;
        this.reviewCalculator = new ReviewCalculator(this.salary,this.projectScore, ImpactDefinition.getImpact(this.getClass()));
    }

    @Override
    public void printOwnResult(Indentation indentation) {

        System.out.println(indentation.apply(String.format("I am projectManager. My identity is :  Name = %s, Project Name = %s, Previous Salary = %f," +
                " Current Salary : %f",this.name,this.projectName, this.salary,this.getOwnValue())));
        System.out.println(indentation.apply("Total expense of my project is : " + this.getTotalValue()));
        System.out.println(indentation.apply("Status of the resources under me :"));
        this.printChildrensResult(indentation);
    }
}