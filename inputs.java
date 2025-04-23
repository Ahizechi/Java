

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create scanner that allows for inputs
        
        System.out.print("Enter your name: "); // Input
        
        String name = scanner.nextLine(); // Reads the scanner input
        
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        
        
        System.out.println("Hello, " + name + "! " + "You are " + age); // Output hello and your name
    }
}
