public class TestToDoApp {
    public static void main(String[] args) {
        System.out.println("Running Tests...");
        
        // Clear list before testing
        ToDoApp.tasks.clear();
        
        // Test Adding a Task
        String testTask = "Buy Milk";
        ToDoApp.addTask(testTask);
        
        if (ToDoApp.tasks.size() == 1 && ToDoApp.tasks.get(0).equals(testTask)) {
            System.out.println("Test Passed: Task added successfully.");
        } else {
            System.err.println("Test Failed!");
            System.exit(1); // This exit code tells Jenkins the test failed
        }
    }
}