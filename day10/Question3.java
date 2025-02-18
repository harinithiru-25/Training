package com.celcom.day10;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    public String title;
    private String isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = "Incomplete"; 
    }

    public String getTitle() {
        return title;
    }

    public String isCompleted() {
        return isCompleted;
    }
    public void markAsCompleted(String title) {
    	this.isCompleted = "Completed";
    }
 
}

class TaskManager {
	 public ArrayList<Task> tasks= new ArrayList<>();

	    
	    public void addTask(String title) {
	        Task newTask = new Task(title);
	        tasks.add(newTask);
	        System.out.println("Task added successfully!");
	    }

	    public void viewTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks available.");
	        } else {
	            for (Task task : tasks) {
	                System.out.println(task.getTitle()+" " +task.isCompleted());
	            }
	        }
	    }

	    
	    public void markTaskAsCompleted(String title) {
	        for (Task task : tasks) {
	            if (task.getTitle().equalsIgnoreCase(title)) {
	                task.markAsCompleted(title);
	                System.out.println("Task marked as completed.");
	                return;
	            }
	        }
	        System.out.println("Task not found!");
	    }

	  
	    public void deleteTask(String title) {
	        for (Task task : tasks) {
	            if (task.getTitle().equalsIgnoreCase(title)) 
	                tasks.remove(task);
	                break;
	            }
	        }

	    
	    public void searchTasks(String searchTerm) {
	        boolean found = false;
	        for (Task task : tasks) {
	            if (task.getTitle().contains(searchTerm)){
	                System.out.println("Found");
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No tasks found with the given search term.");
	        }
	    }
}

public class Question3 {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Search for tasks");
            System.out.println("6. Exit");
            System.out.print("Please select an option: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.next();
                    taskManager.addTask(title);
                    break;
                    
                case 2:
                    taskManager.viewTasks();
                    break;
                    
                case 3:
                    System.out.print("Enter the title of the task to mark as completed: ");
                    String taskname= scanner.next();
                    taskManager.markTaskAsCompleted(taskname);
                    
                    break;
                case 4:
                    System.out.print("Enter the title of the task to delete: ");
                    String taskToDelete = scanner.next();
                    taskManager.deleteTask(taskToDelete);
                    break;
                case 5:
                    System.out.print("Enter a search term: ");
                    String searchTerm = scanner.next();
                    taskManager.searchTasks(searchTerm);
                    break;
                case 6:
                    System.out.println("Exiting the Task Management System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
