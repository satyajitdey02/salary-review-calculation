package com.cefalo.school.component;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.Score;

public class CTO extends EmployeeWithSubordinate {
  public CTO(String name, String projectName, double salary, Score score) {
    super(name, projectName, salary, score, new Impact(0.05, 0.05, 0.3, 0.3, 0.3));
  }
}
