package com.cefalo.school.component;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.Score;

public class ProjectManager extends EmployeeWithSubordinate {
  public ProjectManager(String name, String projectName, double salary, Score score) {
    super(name, projectName, salary, score, new Impact(0.10, 0.10, 0.3, 0.2, 0.2));
  }
}
