package src.JavaWeek8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listing {

    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
        List<Object> theList = new ArrayList<>();
        String choice;
        boolean running = true;
        String addItem;

        while(running) {
            System.out.println("\nCurrent list: " + theList);
            System.out.println("Choose an option");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Edit an item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = userinput.nextLine();

            if (choice.equals("1")) {
                System.out.print("Add an item: ");
                addItem = userinput.nextLine();
                theList.add(addItem);
            } else if (choice.equals("2")) {
                System.out.print("Enter index of the item to remove it (0 to " + (theList.size() - 1) + "): ");
                int removeIndex = Integer.parseInt(userinput.nextLine());
                if (removeIndex >= 0 && removeIndex < theList.size()) {
                    theList.remove(removeIndex);
                    System.out.println("Item removed.");
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter index of the item to edit it (0 to " + (theList.size() - 1) + "): ");
                int editIndex = Integer.parseInt(userinput.nextLine());
                if (editIndex >= 0 && editIndex < theList.size()) {
                    System.out.print("Enter the new value: ");
                    String newValue = userinput.nextLine();
                    theList.set(editIndex, newValue);
                    System.out.println("Item updated.");
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (choice.equals("4")) {
                running = false;
                System.out.println("Here's the final list: " + theList);
                System.out.println("Ending program...\nGoodbye!");
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
        userinput.close();
    }
}
