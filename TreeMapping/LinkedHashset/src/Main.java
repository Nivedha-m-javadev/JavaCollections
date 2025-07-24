import java.util.LinkedHashSet;
import java.util.Scanner;

class OrderedUniqueNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<>();

        System.out.print("How many names? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.println("\nUnique names in entered order:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
