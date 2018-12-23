import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int answer;
        int userAnswer;
        int total;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lowNumber = getInt(sc, "Please enter the lowest value you would like to multiply today. ");        
        int highNumber = getCorrectIntValue(sc, "Please enter the highest value you would like to multiply today. ", lowNumber);

        System.out.print("How many math problems would you like to do? ");
        total = sc.nextInt();
        userAnswer = 0;
        boolean value = false;
        int correct = 0;
        int notCorrect = 0;
        for (int i = 0; i < total; ++i) {

            int firstRand = rand.nextInt(highNumber - lowNumber) + lowNumber;
            int secondRand = rand.nextInt(highNumber - lowNumber) + lowNumber;

            while (!value) {
                userAnswer = 0;

                answer = (firstRand * secondRand);

                System.out.printf("What is %d x %d? ", firstRand, secondRand);
                userAnswer = sc.nextInt();

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
        System.out.printf("You have answered %d correctly and %d incorrectly.%n",correct, notCorrect);
    }

    private static int getInt(Scanner sc, String prompt)    {
        int i = 0;
        boolean valid = false;
        while(!valid)   {
            System.out.print(prompt);
            if(sc.hasNextInt()) {
                i = sc.nextInt();
                valid = true;
            }
            else{
                System.out.println("Error! Invalid value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    private static int getCorrectIntValue(Scanner sc, String prompt, int min)  {
        int i = 0;
        boolean valid = false;
        while(!valid)   {
            i = getInt(sc, prompt);
            if (i < min)   {
                System.out.println("Error! number must be greater than the lowest value");
            }
            else{
                valid = true;
            }
        }
        return i;
    }
}