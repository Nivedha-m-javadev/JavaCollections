import java.util.LinkedList;

public class TaskManager {
    private LinkedList<String> tasks = new LinkedList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("✅ Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removed = tasks.remove(index);
            System.out.println(" Task removed: " + removed);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("\n Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
