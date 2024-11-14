package LabProblems.SearchingAndSorting;

// Write a Menu driven Java program to do the following 
// 1) Create a doubly linked list of elements.
// 2) Delete a given element from the above list.
// 3) Display the contents of the list after deletion.

import java.util.Scanner;

class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    Node head = null;

    void insertElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Element " + data + " added to the list.");
    }

    void deleteElement(int key) {
        if (head == null) {
            System.out.println("The list is empty. No elements to delete.");
            return;
        }

        Node temp = head;

        if (temp != null && temp.data == key) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Element " + key + " deleted.");
            return;
        }

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element " + key + " not found in the list.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        System.out.println("Element " + key + " deleted.");
    }

    void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Create Doubly Linked List");
            System.out.println("2) Delete a given element");
            System.out.println("3) Display the contents of the list");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add to the list: ");
                    int element = scanner.nextInt();
                    dll.insertElement(element);
                    break;

                case 2:
                    System.out.print("Enter element to delete from the list: ");
                    int deleteElement = scanner.nextInt();
                    dll.deleteElement(deleteElement);
                    break;

                case 3:
                    dll.displayList();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
