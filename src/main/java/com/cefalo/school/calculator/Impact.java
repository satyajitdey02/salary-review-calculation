package com.cefalo.school.calculator;

/**
 * Created by jobaer on Feb-08-2018.
 */
public class Impact {
    public Impact(double disciplineImpact, double problemSolvingImpact, double leadershipImpact, double communicationImpact, double experienceImpact) {
        this.disciplineImpact = disciplineImpact;
        this.problemSolvingImpact = problemSolvingImpact;
        this.leadershipImpact = leadershipImpact;
        this.communicationImpact = communicationImpact;
        this.experienceImpact = experienceImpact;
    }

    public double getDisciplineImpact() {
        return disciplineImpact;
    }

    public double getProblemSolvingImpact() {
        return problemSolvingImpact;
    }

    public double getLeadershipImpact() {
        return leadershipImpact;
    }


    public double getCommunicationImpact() {
        return communicationImpact;
    }


    public double getExperienceImpact() {
        return experienceImpact;
    }


    private final double disciplineImpact;
    private final double problemSolvingImpact;
    private final double leadershipImpact;
    private final double communicationImpact;
    private final double experienceImpact;
}
