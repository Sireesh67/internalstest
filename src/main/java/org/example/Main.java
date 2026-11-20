package org.example;

public class Main {
    public static void main(String[] args) {
        // Hardcoded values
        String projectName = "Mobile Banking App";
        int totalTasks = 10;
        int completedTasks = 7;

        // Basic business logic
        int remainingTasks = totalTasks - completedTasks;
        boolean isReadyForRelease = (remainingTasks == 0);

        // Output to console
        System.out.println("Project: " + projectName);
        System.out.println("Completed: " + completedTasks + "/" + totalTasks);
        System.out.println("Remaining: " + remainingTasks);
        System.out.println("Ready for release? " + isReadyForRelease);
    }
}

