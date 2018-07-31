package com.cefalo.school.component;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.Score;

public class TeamLead extends EmployeeWithSubordinate {
    public TeamLead(String name, String teamName, double salary, Score score) {
        super(name, teamName, salary, score, new Impact(0.20, 0.20, 0.3, 0.15, 0.15));
    }
}
