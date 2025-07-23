import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        StudentRollCall sm = new StudentRollCall();

        System.out.print("How many students do you want to enter? ");
        int count = sc.nextInt();

        sm.addStudents(sc, count);
        sm.printAllStudents();
        sm.searchStudent(sc);

        sc.close();
    }
}