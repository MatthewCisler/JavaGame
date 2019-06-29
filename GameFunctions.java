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

    public static void MultiplicationTest() {
        int answer;
        int userAnswer;
        String prompt = "Please enter the lowest value you would like to multiply today. ";
        String highPrompt = "please enter the highest value you would like to multiply today. ";
        final int NUMOFQUESTIONS = 10;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println();
        System.out.println("This is the test session for using multiplication. To use this,");
        System.out.println("give the lowest value and the highest value you would want to use to multiply");
        System.out.println("then the amount of problems you would like to solve. At the end, the program");
        System.out.println("will give the number of times you answered correctly and incorrectly.");
        System.out.println("Along with a grade. There will be 10 Questions");
        System.out.println();

        int lowNumber = getInt(sc, prompt);
        int highNumber = getCorrectIntValue(sc, highPrompt, lowNumber);

        int correct = 0;
        int notCorrect = 0;

        for (int i = 0; i < NUMOFQUESTIONS; i++) {
            int firstRand = rand.nextInt(highNumber - lowNumber) + lowNumber;
            int secondRand = rand.nextInt(highNumber - lowNumber) + lowNumber;

            answer = (firstRand * secondRand);
            System.out.printf("Question %d out of 10%n", i + 1);
            userAnswer = getInt(sc, "What is " + firstRand + " x " + secondRand + "? ");

            if (userAnswer == answer) {
                correct++;
            } else {
                notCorrect++;
            }
            userAnswer = 0;
        }
        System.out.printf("You have answered %d correctly and %d incorrectly.%n", correct, notCorrect);
        double percentTotal = (correct / NUMOFQUESTIONS) * 100;
        String ending;
        System.out.println(percentTotal);
        if (percentTotal < 59) {
            ending = "Sorry, you didn't pass. Try again next time.";
        } else {
            ending = "Good job!";
        }
        System.out.printf("You got a %.2f, %s%n", percentTotal, ending);
    }

    public static void RockPaperScissors() {
        System.out.println("This is Rock Paper Scissors, Rules are simple");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");
        System.out.println();
        System.out.println("Beat the computer. All you need to do");
        int min = 0;
        int max = 2;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userAns = getInt(sc, "Pick Rock, Paper, or Scissors");
        int compAns = (rand.nextInt(max - min) + min) + 1;
        System.out.println();
        System.out.println(compAns);
        String userAnsString;
        String compAnsString;
        String resultsTie = "Both Tied";
        String resultsWon = "You won!";
        String resultsLost = "You Lost!";

        if (userAns == 1) {
            userAnsString = "Rock";
        } else if (userAns == 2) {
            userAnsString = "Paper";
        } else if (userAns == 3) {
            userAnsString = "Scissors";
        }

        if (compAns == 1) {
            compAnsString = "Rock";
        } else if (compAns == 2) {
            compAnsString = "Paper";
        } else if (compAns == 3) {
            compAnsString = "Scissors";
        }

        if (compAns == userAns) {
            System.out.print(resultsTie);
        } else if (userAns == 1 & compAns == 3) {
            System.out.println(resultsWon);
        } else if (userAns == 1 & compAns == 2) {
            System.out.println(resultsLost);
        }

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