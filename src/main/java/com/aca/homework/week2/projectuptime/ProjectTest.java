package com.aca.homework.week2.projectuptime;

import java.util.Scanner;

public class ProjectTest {
    public static void main(String[] args) {
        Project[] projects = createProject();
        printProjects(projects);
    }

    public static Project[] createProject() {
        long startTime = System.currentTimeMillis();
        Project[] projects = new Project[3];
        for (int i = 0; i < 3; i++) {
            Project project = new Project();
            System.out.println("Please enter the project name:");
            project.name = new Scanner(System.in).nextLine();
            long current = System.currentTimeMillis();
            project.creationSeconds = (current - startTime) / 1000;
            projects[i] = project;
        }
        return projects;

    }

    public static void printProjects(Project[] projects) {
        for (int i = 0; i < 3; i++) {
            System.out.println(projects[i].creationSeconds + " " + projects[i].name);
        }
    }
}