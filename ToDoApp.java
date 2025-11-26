import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    // A simple list to store tasks
    public static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- To-Do List App ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                addTask(task);
                System.out.println("Task added!");
            } else if (choice.equals("2")) {
                System.out.println("\nYour Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (choice.equals("3")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    // Helper method to add task (Easier to test)
    public static void addTask(String task) {
        tasks.add(task);
    }
}