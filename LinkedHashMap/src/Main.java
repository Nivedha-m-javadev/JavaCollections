import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentsLL STL= new StudentsLL();
    System.out.println("Enter how many students");
    int number = sc.nextInt();
    sc.nextLine();
    for(int i=0;i< number;i++){
        System.out.println("Enter students name");
        String names= sc.nextLine();
        System.out.print("Enter " + names + "'s marks: ");
        int score = sc.nextInt();
        sc.nextLine(); // consume newline
        STL.addStudent(names, score);
    }
    STL.DisplayStudents();
    sc.close();
    }
}