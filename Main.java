import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int lowNumber;
        int highNumber;
        int firstRand;
        int secondRand;
        int answer;
        int userAnswer;
        int total;
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Please enter the lowest value you would like to multiply today. ");
        lowNumber = sc.nextInt();
        System.out.print("Please enter the highest value you would like to multiply today. ");
        highNumber = sc.nextInt();

        System.out.print("How many math problems would you like to do? ");
        total = sc.nextInt();
        userAnswer = 0;
        boolean value = false;
        for (int i = 0; i < total; ++i) {

            userAnswer = 0;
            while (!value) {
                userAnswer = 0;
                firstRand = rand.nextInt(highNumber) + lowNumber;
                secondRand = rand.nextInt(highNumber) + lowNumber;

                answer = (firstRand * secondRand);

                System.out.printf("What is %d x %d? ", firstRand, secondRand);
                userAnswer = sc.nextInt();

                if (userAnswer == answer) {
                    System.out.println("Good job!");
                    value = true;
                } else {
                    System.out.println("That was wrong, please try again");
                }
            }
            userAnswer = 0;
            value = false;
        }
    }
}