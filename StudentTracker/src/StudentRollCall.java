import java.util.HashMap;
import java.util.Scanner;

public class StudentRollCall {
    HashMap<Integer, String> studentMap = new HashMap<>();

    public void addStudents(Scanner sc, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter roll number for student " + i + ":");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter name for roll number : " + roll +";");
            String name = sc.nextLine();
            studentMap.put(roll, name);
        }
    }

    public void searchStudent(Scanner sc) {
        System.out.print("\nEnter a roll number to search: ");
        int roll = sc.nextInt();
        if (studentMap.containsKey(roll)) {
            System.out.println("Student name: " + studentMap.get(roll));
        } else {
            System.out.println("Roll number not found.");
        }
    }

    public void printAllStudents() {
        System.out.println("\nAll student entries:");
        for (Integer roll : studentMap.keySet()) {
            System.out.println("Roll No: " + roll + " -> Name: " + studentMap.get(roll));
        }
    }
}
