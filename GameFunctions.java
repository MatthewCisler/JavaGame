import java.util.Scanner;
import java.util.Random;

public class GameFunctions {

    public static void MultiplicationPractice() {
        int answer;
        int userAnswer;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println();
        System.out.println("This is practice a practice session for using multiplication. To use this,");
        System.out.println("give the lowest value and the highest value you would want to use to multiply");
        System.out.println("then the amount of problems you would like to solve. At the end, the program");
        System.out.println("will give the number of times you answered correctly and incorrectly.");
        System.out.println();

        int lowNumber = getInt(sc, "Please enter the lowest value you would like to multiply today. ");
        int highNumber = getCorrectIntValue(sc, "Please enter the highest value you would like to multiply today. ",
                lowNumber);

        int total = getInt(sc, "How many math problems would you like to do? ");

        int correct = 0;
        int notCorrect = 0;
        for (int i = 0; i < total; ++i) {

            int firstRand = rand.nextInt(highNumber - lowNumber) + lowNumber;
            int secondRand = rand.nextInt(highNumber - lowNumber) + lowNumber;
            boolean value = false;

            while (!value) {
                userAnswer = 0;

                answer = (firstRand * secondRand);
                userAnswer = getInt(sc, "What is " + firstRand + " x " + secondRand + "? ");

                if (userAnswer == answer) {
                    System.out.println("Good job!");
                    value = true;
                    correct++;
                } else {
                    System.out.println("That was wrong, please try again");
                    notCorrect++;
                }
            }
            userAnswer = 0;
            value = false;
        }
        System.out.printf("You have answered %d correctly and %d incorrectly.%n", correct, notCorrect);
    }

    // Validations, do not put "Game" classes underneath these.
    private static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                valid = true;
            } else {
                System.out.println("Error! Invalid value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    private static int getCorrectIntValue(Scanner sc, String prompt, int min) {
        int i = 0;
        boolean valid = false;
        while (!valid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Error! number must be greater than the lowest value");
            } else {
                valid = true;
            }
        }
        return i;
    }

}