import java.util.Scanner;

public class MadLibWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        System.out.print("Enter a direction (e.g., east, west): ");
        String direction = scanner.nextLine();
      
        displayStory(animal, number, direction);

        scanner.close();
    }

    // Method to display the story
    public static void displayStory(String animal, String number, String direction) {
        System.out.println("\nHere is your Mad Lib:");
        System.out.println("Hickory Dickory Dock.");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ".");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
