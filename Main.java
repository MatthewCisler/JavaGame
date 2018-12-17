import java.util.Scanner;
import java.util.Random;

class Main   {
    public static void main(String[] args) {
        int lowNumber;
        int highNumber;
        int firstRand;
        int secondRand;
        int answer;
        int userAnswer;
        int total;
        double x;
        double y;
        boolean value = false;

        
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Please enter the lowest value you would like to multiply today. ");
        lowNumber = sc.nextInt();
        System.out.print("Please enter the highest value you would like to multiply today. ");
        highNumber = sc.nextInt();




        //System.out.println(firstRand);
        //System.out.println(secondRand);
        //System.out.println(answer);

        System.out.print("How many math problems would you like to do? ");
        total = sc.nextInt();

        int counter = 0;
        while (counter < total) {

            while (value = true)  {
                firstRand = rand.nextInt(highNumber) + lowNumber;
                secondRand = rand.nextInt(highNumber) + lowNumber;
        
                answer = (firstRand * secondRand);
                
                System.out.printf("What is %d x %d? ", firstRand, secondRand);
                userAnswer = sc.nextInt();

                if (userAnswer == answer)   {
                    System.out.println("Good job!");
                    value = true;
                }
                else    {
                    System.out.println("That was wrong, please try again");
                    value = false;
                }
                counter++;
            }
        }
    }
}