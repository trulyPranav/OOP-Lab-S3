import java.util.LinkedList;
import java.util.Scanner;
public class DLL
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = sc.nextLine();
                    list.add(elementToAdd);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    String elementToDelete = sc.nextLine();
                    if (list.remove(elementToDelete))
                    {
                    System.out.println("Deleted element: " +
                    elementToDelete);
                    }
                    else
                    {
                    System.out.println("Element not found: " +
                    elementToDelete);
                    }
                    break;
                case 3:
                    System.out.println("List:");
                    System.out.println(list);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid ");
            }
        } while (choice != 4);
    }   
}