import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Math Facts game. To start, type out the ");
        System.out.println("number from the menu to pick a game. ");
        printMenu();
        System.out.print("What kind of math would you like to do today?: ");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            GameFunctions.MultiplicationPractice();
            break;
        case 2:
            GameFunctions.MultiplicationTest();
            break;
        case 3:
            System.out.println("Function not available yet.");
            break;
        case 4:
            System.out.println("Function not available yet.");
            break;
        case 5:
            System.out.println("Function not available yet.");
            break;
        case 6:
            System.out.println("Function not available yet.");
            break;
        case 7:
            System.out.println("Function not available yet.");
            break;
        case 8:
            System.out.println("Function not available yet.");
            break;
        case 9:
            GameFunctions.RockPaperScissors();
        }
        sc.close();

    }

    private static void printMenu() {
        System.out.println("1: Multiplication as practice");
        System.out.println("2: Multiplication as a test");
        System.out.println("3: Addition as practice");
        System.out.println("4: Addition as a test");
        System.out.println("5: Subtraction as practice");
        System.out.println("6: Subtraction as a test");
        System.out.println("7: Division as practice");
        System.out.println("8: Division as a test");
        System.out.println("9: Rock, Paper, Scissors");
        System.out.println();
    }
}