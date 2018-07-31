package com.cefalo.school;

import com.cefalo.school.calculator.Score;
import com.cefalo.school.component.*;

public class App {

    public static void main(String[] args) {
        Score empScore = new Score(8, 3, 2, 7, 10);
        Employee emp1 = new Developer("Dev 1", "GB", 10000, empScore);
        Employee emp2 = new Developer("Dev 2", "GB", 20000, empScore);
        Employee emp3 = new Developer("Dev 3", "GB", 30000, empScore);

        Score tlScore = new Score(8, 5, 8, 8, 9);
        EmployeeWithSubordinate teamLead1 = new TeamLead("TL 1", "GB", 40000, tlScore);
        teamLead1.add(emp1);
        teamLead1.add(emp2);
        teamLead1.add(emp3);


      //Score empScore = new Score(8, 3, 2, 7, 10);
        Employee emp4 = new Developer("Dev 4", "NV", 15000, empScore);
        Employee emp5 = new Developer("Dev 5", "NV", 10000, empScore);
        Employee emp6 = new Developer("Dev 6", "NV", 20000, empScore);
        Employee emp7 = new Developer("Dev 7", "NV", 25000, empScore);

        //Score tlScore = new Score(8, 5, 8, 8, 9);
        EmployeeWithSubordinate teamLead2 = new TeamLead("TL 2", "GB", 50000, tlScore);
        teamLead2.add(emp4);
        teamLead2.add(emp5);
        teamLead2.add(emp6);
        teamLead2.add(emp7);

        Score pmScore = new Score(8, 8, 8, 8, 8);
        EmployeeWithSubordinate pm1 = new ProjectManager("PM 1", "GB", 100000, pmScore);
        pm1.add(teamLead1);
        pm1.add(teamLead2);

        //Score empScore = new Score(8, 3, 2, 7, 10);
        Employee emp8 = new Developer("Dev 8", "MN", 10000, empScore);
        Employee emp9 = new Developer("Dev 9", "MN", 20000, empScore);

        //Score tlScore = new Score(8, 5, 8, 8, 9);
        EmployeeWithSubordinate teamLead3 = new TeamLead("TL 3", "MN", 60000, tlScore);
        teamLead3.add(emp8);
        teamLead3.add(emp9);

        //Score empScore = new Score(8, 3, 2, 7, 10);
        Employee emp10 = new Developer("Dev 10", "DN", 15000, empScore);
        Employee emp11 = new Developer("Dev 11", "DN", 10000, empScore);
        Employee emp12 = new Developer("Dev 12", "DN", 20000, empScore);

        //Score tlScore = new Score(8, 5, 8, 8, 9);
        EmployeeWithSubordinate teamLead4 = new TeamLead("TL 4", "DN", 80000, tlScore);
        teamLead4.add(emp10);
        teamLead4.add(emp11);
        teamLead4.add(emp12);

        //Score pmScore = new Score(8, 8, 8, 8, 8);
        EmployeeWithSubordinate pm2 = new ProjectManager("PM 2", "DN", 100000, pmScore);
        pm2.add(teamLead3);
        pm2.add(teamLead4);

        Score ctoScore = new Score(9, 9, 9, 9, 8);
        EmployeeWithSubordinate cto = new CTO("CTO", "", 500000, ctoScore);
        cto.add(pm1);
        cto.add(pm2);

        cto.print();

        System.out.printf("Total review amount: %.2f%n", cto.calculateReview());

    }
}
