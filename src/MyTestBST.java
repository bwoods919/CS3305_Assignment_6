// Name: Brendan Woods
// Class: CS 3305/0110

// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: IntelliJ

// 3 needs to be finished

import java.util.ArrayList;
import java.util.Scanner;

public class MyTestBST {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create the BSTs
        BST<String> strTree = new BST<>();
        BST<Integer> intTree = new BST<>();

        int option;
        boolean data = true;

        System.out.print("\nEnter the data type(integer/string): ");
        String inputStr = input.next();

        if (inputStr.equals("integer") || inputStr.equals("Integer") ||
                inputStr.equals("int") || inputStr.equals("Int") ||
                inputStr.equals("i") || inputStr.equals("I")) {
            data = false;
        } else if (inputStr.equals("string") || inputStr.equals("String") ||
                inputStr.equals("str") || inputStr.equals("Str") ||
                inputStr.equals("s") || inputStr.equals("S")) {
            data = true;
        }
        else
            System.out.println("Please select either integer or string.");

        while (true) {

            printMenu();
            option = input.nextInt();
            switch (option) {

                case 0: // Enter data type
                    System.out.print("\nEnter the data type(integer/string): ");
                    inputStr = input.next();

                    if (inputStr.equals("integer") || inputStr.equals("Integer") ||
                            inputStr.equals("int") || inputStr.equals("Int") ||
                            inputStr.equals("i") || inputStr.equals("I")) {
                        data = true;
                    } else if (inputStr.equals("string") || inputStr.equals("String") ||
                            inputStr.equals("str") || inputStr.equals("Str") ||
                            inputStr.equals("s") || inputStr.equals("S")) {
                        data = false;
                    }
                    else
                        System.out.println("Please select either integer or string.");
                    break;

                case 1: // Insert data element
                    if (data) {
                        System.out.print("\nEnter element to insert in the strTree: ");
                        String insertStr = input.next();

                        System.out.println("\nTesting method Insert Data Element (Option 1)");
                        System.out.print("BST before inserting: " + insertStr + " (Inorder): ");
                        strTree.inorder();

                        strTree.insert(insertStr);

                        System.out.print("\nBST after inserting: " + insertStr + " (Inorder): ");
                        strTree.inorder();
                        System.out.println();

                    } else {
                        System.out.print("\nEnter element to insert in the intTree: ");
                        int insertInt = input.nextInt();

                        System.out.println("\nTesting method Insert Data Element (Option 1)");
                        System.out.print("BST before inserting: " + insertInt + " (Inorder): ");
                        intTree.inorder();

                        intTree.insert(insertInt);

                        System.out.print("\nBST after inserting " + insertInt + " (Inorder): ");
                        intTree.inorder();
                        System.out.println();
                    }
                    break;

                case 2: // Delete data element
                    if (data) {
                        System.out.print("\nEnter element to delete from the strTree: ");
                        String deleteStr = input.next();

                        System.out.println("Testing method Insert Data Element (Option 2)");
                        System.out.println("\nTesting method Insert Data Element (Option 1)");
                        System.out.print("BST before deleting: " + deleteStr + " (Inorder): ");
                        strTree.inorder();

                        strTree.delete(deleteStr);

                        System.out.print("\nBST after deleting: " + deleteStr + " (Inorder): ");
                        strTree.inorder();
                        System.out.println();

                    } else {
                        System.out.print("\nEnter element to delete from the intTree: ");
                        int deleteInt = input.nextInt();

                        System.out.println("\nTesting method Insert Data Element (Option 2)");
                        System.out.print("BST before deleting: " + deleteInt + " (Inorder): ");
                        intTree.inorder();

                        intTree.delete(deleteInt);

                        System.out.print("\nBST after deleting: " + deleteInt + " (Inorder): ");
                        intTree.inorder();
                        System.out.println();
                    }
                    break;

                case 3: // Search for data element
                    System.out.print("Enter element to search for: ");
                    if (data) {
                        String searchStr = input.next();

                        System.out.println("Testing method Search for Data Element (Option 3)");
                        System.out.print("Is " + searchStr + " in the tree? " +
                                strTree.search(searchStr));

                    } else {
                        int searchInt = input.nextInt();

                        System.out.println("Testing method Search for Data Element (Option 3)");
                        System.out.print("Is " + searchInt + " in the tree? " +
                                intTree.search(searchInt));
                    }

                    break;
                case 4: // Print strTree size
                    System.out.println("Testing method Tree size (Option 4)");
                    if (data) {
                        System.out.println("Tree size: " + strTree.getSize());

                    } else {
                        System.out.println("Tree size: " + intTree.getSize());
                    }
                    break;

                case 5: // Path from root to element
                    System.out.print("Enter the node to get the path to: ");
                    if (data) {
                        String nodePathStr = input.next();

                        System.out.println("Testing method Path from Root to Data Element (Option 5)");
                        System.out.print("Path from root to " + nodePathStr + ": ");
                        ArrayList<BST.TreeNode<String>> path = strTree.path(nodePathStr);
                        for (int i = 0; path != null && i < path.size(); i++)
                            System.out.print(path.get(i).element + " ");

                    } else {
                        int nodePathInt = input.nextInt();

                        System.out.println("Testing method Path from Root to Data Element (Option 5)");
                        System.out.print("Path from root to " + nodePathInt + ": ");
                        ArrayList<BST.TreeNode<Integer>> path = intTree.path(nodePathInt);
                        for (int i = 0; path != null && i < path.size(); i++)
                            System.out.print(path.get(i).element + " ");
                    }
                    break;

                case 6: // Check if strTree is empty
                    System.out.println("Testing method Check if Empty Tree (Option 6)");

                    if (data) {
                        System.out.println("Is empty strTree? " + strTree.isEmpty());

                    } else {
                        System.out.println("Is empty strTree? " + intTree.isEmpty());
                    }
                    break;

                case 7: // Print preorder traversal
                    System.out.println("\nTesting method Preorder Traversal (Option 7)");
                    System.out.print("Preorder: ");
                    if (data) {
                        strTree.preorder();

                    } else {
                        intTree.preorder();
                    }
                    System.out.println();
                    break;

                case 8: // Print Inorder traversal
                    System.out.println("Testing method Inorder Traversal (Option 8)");
                    System.out.print("Inorder: ");
                    if (data) {
                        strTree.inorder();

                    } else {
                        intTree.inorder();
                    }
                    System.out.println();
                    break;

                case 9: // Print Postorder traversal
                    System.out.println("Testing method Postorder Traversal (Option 9)");
                    System.out.println("Postorder: ");
                    if (data) {
                        strTree.postorder();
                    } else {
                        intTree.postorder();
                    }
                    System.out.println();
                    break;

                case 10: // Exit
                    System.exit(255);
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n----------------MAIN MENU---------------");

        System.out.println("0. Enter Tree Data Type (integer or string)");
        System.out.println("1. Insert Data Element");
        System.out.println("2. Delete Data Element");
        System.out.println("3. Search for Data Element");
        System.out.println("4. Print Tree Size");
        System.out.println("5. Path from Root to Data Element");
        System.out.println("6. Check if Empty Tree");
        System.out.println("7. Print Preorder Traversal");
        System.out.println("8. Print Inorder Traversal");
        System.out.println("9. Print Postorder Traversal");
        System.out.println("10. Exit program");

        System.out.print("\nEnter option number: ");
    }
}