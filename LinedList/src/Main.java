import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print(" Enter task: ");
                    String task = sc.nextLine();
                    manager.addTask(task);
                    break;
                case 2:
                    manager.showTasks();
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();
                    manager.removeTask(index - 1);
                    break;
                case 3:
                    manager.showTasks();
                    break;
                case 4:
                    System.out.println(" Bye babe, keep slaying!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
