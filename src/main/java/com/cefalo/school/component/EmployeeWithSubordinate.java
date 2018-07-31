package com.cefalo.school.component;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

import java.util.ArrayList;
import java.util.List;

public abstract class EmployeeWithSubordinate implements HasSubordinate, Employee {
    private final String name;
    private final String projectName;
    private final double salary;
    private final Score score;

    private final ReviewCalculator calculator;

    private final List<Employee> employees = new ArrayList<>();

    EmployeeWithSubordinate(String name, String projectName, double salary, Score score, Impact impact) {
        this.name = name;
        this.projectName = projectName;
        this.salary = salary;
        this.score = score;
        this.calculator = new ReviewCalculator(salary, score, impact);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void print() {
        System.out.printf("Name: %s---Project: %s---Salary Review: %.2f%n",
                name, projectName, calculator.calculate());
        for (Employee employee : employees) {
            employee.print();
        }
    }

    @Override
    public double calculateReview() {
        double result = calculator.calculate();
        for (Employee employee : employees) {
            result += employee.calculateReview();
        }

        return result;
    }
}
