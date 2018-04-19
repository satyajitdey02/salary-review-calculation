package com.cefalo.school;

import com.cefalo.school.calculator.Score;
import com.cefalo.school.sln.Contracts.Indentation;
import com.cefalo.school.sln.Developer;
import com.cefalo.school.sln.Contracts.Resource;
import com.cefalo.school.sln.Contracts.Management;
import com.cefalo.school.sln.ProjectManager;
import com.cefalo.school.sln.TeamLead;

public class App {

    public static void main(String[] args) throws Exception {

        Score devScore1 = new Score(8, 3, 2, 7, 10);

        Resource dev1 = new Developer("Dev 1", "Team1", (double) 10, devScore1);
        //dev1.printOwnResult();


        Score devScore2 = new Score(8, 3, 3, 7, 10);
        Resource dev2 = new Developer("Dev 2", "Team1", (double) 10, devScore2);


        Score devScore3 = new Score(8, 3, 2, 7, 10);

        Resource dev3 = new Developer("Dev 3", "Team2", (double) 10, devScore1);
        //dev1.printOwnResult();


        Score devScore4 = new Score(8, 3, 3, 7, 10);
        Resource dev4 = new Developer("Dev 4", "Team2", (double) 10, devScore2);


        //dev2.printOwnResult();


        Score teamScore1 = new Score(8, 3, 2, 7, 10);
        Management teamLead1 = new TeamLead("Team Lead1","Team1",15,teamScore1);
        teamLead1.addResource(dev1);
        teamLead1.addResource(dev2);
        //teamLead1.printOwnResult();



        Score teamScore2 = new Score(8, 3, 2, 7, 10);
        Management teamLead2 = new TeamLead("Team Lead2","Team2",15,teamScore2);
        teamLead2.addResource(dev3);
        teamLead2.addResource(dev4);
        //teamLead2.printOwnResult();

        Score projectManagerScore = new Score(8, 3, 2, 7, 10);
        Management projectManager1 = new ProjectManager("projectManager1","project1",25,projectManagerScore);
        projectManager1.addResource(teamLead1);
        projectManager1.addResource(teamLead2);
        projectManager1.printOwnResult(new Indentation(0));
    }
}
