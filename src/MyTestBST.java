
// 5 needs to be fixed

import java.util.Scanner;

public class MyTestBST {
    public static void main(String[] args) {

        // Create a BST
        BST<String> tree = new BST<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        Scanner input = new Scanner(System.in);

        int option;

        while (true) {

            printMenu();
            option = input.nextInt();
            switch (option) {

                case 0: // Enter data type
                    break;
                case 1: // Insert data element
                    System.out.print("\nEnter element to insert in the tree: ");
                    String insert = input.next();

                    System.out.println("\nTesting method Insert Data Element (Option 1)");
                    System.out.print("BST before inserting: " + insert + " (Inorder): ");
                    tree.inorder();

                    tree.insert(insert);

                    System.out.print("\nBST after inserting: " + insert + " (Inorder): ");
                    tree.inorder();
                    System.out.println();
                    break;
                case 2: // Delete data element


                    System.out.print("\nEnter element to delete from the tree: ");
                    String delete = input.next();

                    System.out.println("Testing method Insert Data Element (Option 2)");
                    System.out.println("\nTesting method Insert Data Element (Option 1)");
                    System.out.print("BST before deleting: " + delete + " (Inorder): ");
                    tree.inorder();

                    tree.delete(delete);

                    System.out.print("\nBST after deleting: " + delete + " (Inorder): ");
                    tree.inorder();
                    System.out.println();
                    break;
                case 3: // Search for data element

                    System.out.println("Testing method Search for Data Element (Option 3)");

                    break;
                case 4: // Print tree size
                    System.out.println("Testing method Tree size (Option 4)");
                    System.out.println("Tree size: " + tree.getSize());
                    break;
                case 5: // Path from root to element
                    System.out.print("Enter the node to get the path to: ");
                    String path = input.next();

                    System.out.println("Testing method Path from Root to Data Element (Option 5)");
                    System.out.print("Path from root to " + path + ": ");
                    tree.path(path);
                    System.out.println();
                    break;
                case 6: // Check if tree is empty
                    System.out.println("Testing method Check if Empty Tree (Option 6)");
                    System.out.println("Is empty tree? " + tree.isEmpty());
                    break;
                case 7: // Print preorder traversal
                    System.out.println("\nTesting method Preorder Traversal (Option 7)");
                    System.out.print("Preorder: ");
                    tree.preorder();
                    System.out.println();
                    break;
                case 8: // Print Inorder traversal
                    System.out.println("Testing method Inorder Traversal (Option 8)");
                    System.out.print("Inorder: ");
                    tree.inorder();
                    System.out.println();
                    break;
                case 9: // Print Postorder traversal
                    System.out.println("Testing method Postorder Traversal (Option 9)");
                    System.out.println("Postorder: ");
                    tree.postorder();
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
