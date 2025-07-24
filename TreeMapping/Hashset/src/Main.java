import java.util.HashSet;
import java.util.Scanner;

class UniqueNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();

        System.out.print("How many names do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name); // duplicates will be ignored
        }

        System.out.println("\nUnique names you entered:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
