// Name: <your name>
// Class: CS 3305/Section#
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: IntelliJ

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int option;
        String inputStr = null;

        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1 -> { // Input
                    System.out.print("Enter the input String: ");
                    input.nextLine();
                    inputStr = input.nextLine();
                }
                case 2 -> { // Output
                    assert inputStr != null;
                    String[] elements = inputStr.split(" ");
                    BST<String> bst = new BST<>(elements);
                    System.out.println("Original Text:");
                    System.out.println(inputStr);
                    System.out.println("\nProcessed Text:");
                    bst.inorder();
                    System.out.println();
                }
                case 3 -> // Exit
                        System.exit(255);
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n-----------------MAIN MENU---------------");
        System.out.println("1. Read input string");
        System.out.println("2. Remove duplicates and display outputs");
        System.out.println("3. Exit program");

        System.out.print("\nEnter option number: ");
    }
}
