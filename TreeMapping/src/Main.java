import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentSort ssl = new StudentSort();

        System.out.print("How many students? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter " + name + "'s marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline
            ssl.addStudent(name, marks);
        }

        ssl.ShowSortedStudent();
        sc.close();
    }
}
