package com.epam.oranization;

import com.epam.oranization.emploee.*;
import com.epam.oranization.process.sort.*;

import java.util.Collections;

public class App {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Tom", 1, 200000, true);
        Manager manager2 = new Manager("Bob", 2, 220000, true);
        Manager manager3 = new Manager("Jerry", 3, 300000, true);

        Programmer programmer1 = new Programmer("Victor", 1, 100000, 5, "C++");
        Programmer programmer2 = new Programmer("Andrey", 2, 115000, 6, "Java");
        Programmer programmer3 = new Programmer("Ivan", 3, 90000, 4, "Java");
        Programmer programmer4 = new Programmer("Alex", 4, 110000, 6, "C#");
        Programmer programmer5 = new Programmer("Mark", 5, 80000, 3, "Java");
        Programmer programmer6 = new Programmer("Fedor", 6, 115000, 6, "C#");

        Intern intern1 = new Intern("Anton", 1, 50000, 1, "C++", 10);
        Intern intern2 = new Intern("Federico", 2, 60000, 2, "Java", 17);
        Intern intern3 = new Intern("John", 3, 45000, 1, "C#", 8);
        Intern intern4 = new Intern("Ros", 4, 55000, 2, "Java", 15);
        Intern intern5 = new Intern("Ben", 5, 55000, 2, "C#", 14);

        manager1.addEmploee(programmer1);
        manager1.addEmploee(programmer2);
        manager1.addEmploee(programmer3);
        manager1.addEmploee(intern1);
        manager1.addEmploee(intern2);

        manager2.addEmploee(programmer4);
        manager2.addEmploee(programmer5);
        manager2.addEmploee(programmer6);
        manager2.addEmploee(intern3);
        manager2.addEmploee(intern4);

        manager3.addEmploee(programmer1);
        manager3.addEmploee(programmer2);
        manager3.addEmploee(programmer3);
        manager3.addEmploee(programmer4);
        manager3.addEmploee(programmer5);
        manager3.addEmploee(programmer6);
        manager3.addEmploee(intern1);
        manager3.addEmploee(intern2);
        manager3.addEmploee(intern3);
        manager3.addEmploee(intern4);
        manager3.addEmploee(manager1);
        manager3.addEmploee(manager2);

        programmer1.addIntern(intern1);
        programmer1.addIntern(intern2);
        programmer1.addIntern(intern3);
        programmer1.addIntern(intern4);
        programmer1.addIntern(intern5);

        System.out.println("------ Sorted by Name ------");
        Collections.sort(manager1.getEmploees(), new CompareEmploeeByName());
        for (Emploee e : manager1.getEmploees())
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

        System.out.println("------ Sorted by ID ------");
        Collections.sort(manager2.getEmploees(), new CompareEmploeeById());
        for (Intern e : programmer1.getInterns())
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

        System.out.println("------ Sorted by Salary ------");
        Collections.sort(manager3.getEmploees(), new CompareEmploeeBySalary());
        for (Emploee e : manager3.getEmploees())
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

        System.out.println("------ Sorted by TechSkill ------");
        Collections.sort(programmer1.getInterns(), new CompareEngineerByTechSkill());
        for (Engineer e : programmer1.getInterns())
            System.out.println(e.getId() + " " + e.getName() + "  techSkill: " + e.getTechSkillLevel());

        System.out.println("------ Sorted by Programming Language ------");
        Collections.sort(programmer1.getInterns(), new CompareEngineerByProgrammingLanguage());
        for (Programmer e : programmer1.getInterns())
            System.out.println(e.getId() + " " + e.getName() + " " + e.getProgrammingLanguage());
    }
}
