import java.util.*;
import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Name");
            System.out.println("2. Search Name");
            System.out.println("3. Display Names");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = sc.nextLine();
                    names.add(nameToAdd);
                    System.out.println("Name added.");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = sc.nextLine();
                    Collections.sort(names);
                    int index = Collections.binarySearch(names,
                    nameToSearch);
                    if (index >= 0)
                    {
                    System.out.println("Name found at index " +
                    index);
                    }
                    else
                    {
                    System.out.println("Name not found");
                    }
                    break;
                case 3:
                    System.out.println("Names:");
                    System.out.println(names);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid ");
            }
        }
        while (choice != 4);
    }
}