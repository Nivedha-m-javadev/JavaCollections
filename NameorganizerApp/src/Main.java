import java.util.*;

class NameOrganizerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> nameSet = new LinkedHashSet<>();

        System.out.print("Enter number of names: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            nameSet.add(sc.nextLine());
        }

        System.out.println("\n📘 Names in entered order (duplicates removed):");
        for (String name : nameSet) {
            System.out.println(name);
        }

        TreeSet<String> sortedSet = new TreeSet<>(nameSet);
        System.out.println("\n📘 Names in sorted order:");
        for (String name : sortedSet) {
            System.out.println(name);
        }

        sc.close();
    }
}
