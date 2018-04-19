package com.cefalo.school.sln.Contracts;

import com.cefalo.school.calculator.ReviewCalculator;

/*Every Employee of CEFALO is a resource, the name is not good, Another team proposed the name to be Individual, I prefer that name*/
/*Developer -> TeamLead -> Project Manager -> CEO*/
public abstract class Resource {
    /* */
    protected ReviewCalculator reviewCalculator; // Every resource object has a review calculator who calculates review of that resource
    protected double salary;// Every resource has his own salary
    protected String name; //Every resource has a name
    // Every resource has his own value : Updated calculated salary
    public double getOwnValue(){
        return this.reviewCalculator.calculate();
    }
    // The total value of a resource is the summation of its ownValue(the reviewed salary) and the accumulated sum of it's subordinate resources
    protected abstract double getTotalValue();
    // Every resource has it's own styled sheet to print it's report
    public abstract void printOwnResult(Indentation indentation); // Different for Management type resources and EntryLevel resources
}

