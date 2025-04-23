import java.util.Scanner;

public class ifstatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age: "); // Input

        int age = scanner.nextInt(); // Reads the scanner input

        if(age >= 18) {
            System.out.println("You are an adult!");
        }
        else{
            System.out.println("You are a child!");
        }
    }
}