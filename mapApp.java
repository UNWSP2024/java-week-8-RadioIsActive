package src.JavaWeek8Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapApp {

    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        // Create the username-password map
        Map<String, String> userCredentials = new HashMap<>();
        userCredentials.put("alice123", "A1b2c3d4!");
        userCredentials.put("bob_smith", "B@bSecure!");
        userCredentials.put("charlieZ", "Ch@rlie#789");
        userCredentials.put("diane_22", "Diane$Pass22");
        userCredentials.put("eddieC", "Edd1e_Pass!");

        // Create the username-message map
        Map<String, String> userMessages = new HashMap<>();
        userMessages.put("alice123", "Hello Alice! Don't forget to complete your tasks today.");
        userMessages.put("bob_smith", "Hi Bob! Meeting at 3 PM in Conference Room B.");
        userMessages.put("charlieZ", "Charlie, your package has been delivered.");
        userMessages.put("diane_22", "Diane, remember to submit the report by Friday.");
        userMessages.put("eddieC", "Eddie, let's catch up over coffee this weekend!");

        // Input for username and password
        System.out.print("Enter username: ");
        String username = userinput.nextLine();
        
        System.out.print("Enter password: ");
        String password = userinput.nextLine();
        
        // Check login credentials
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            System.out.println("Login successful!");
            System.out.println("Message: " + userMessages.get(username));
        } else {
            System.out.println("Error: Incorrect username or password.");
        }
        
        userinput.close();
    }
}
