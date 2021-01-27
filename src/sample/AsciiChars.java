package sample;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class AsciiChars {
//    These are the three methods that print Ascii values

    public static void printNumbers() {
        System.out.println("Numbers");
        for (int i=(int)'0'; i<=(int)'9'; i++){
            System.out.println(i);
        }
    }

    public static void printLowerCase() {
        System.out.println("Lowercase");
        for (int i=(int)'a'; i<=(int)'z'; i++) {
            System.out.println(i);
        }
    }

    public static void printUpperCase() {
        System.out.println("Uppercase");
        for (int i=(int)'A'; i<=(int)'Z'; i++) {
            System.out.println(i);
        }
    }



    public static void main(String[] args) {

//      Calling the three functions for Ascii values
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

//        Just a test to see that a character assigned to an int becomes and int with that character's Ascii value
//        int value = 'g';
//        System.out.println(value);

        Scanner input = new Scanner(System.in);

//      2.) Initialize variables outside of main
        String petName;
        int petAge;
        int luckyNum;
        String quarterBack;
        int quarterBackNumber;
        int carYear;
        int randomNum;
        String actressName;
        int magicBall;

        System.out.println("\nPlease enter your name: ");
        String userName = input.nextLine();
        System.out.printf("Hello %s",userName);

        System.out.println("\nWould you like to continue? Enter [y] or [yes]: ");
        String userContinue = input.nextLine();

        while (userContinue.equals("yes") || userContinue.equals("y")) {

//          I tried to attempt do-while statements on the input questions to force the user to input
//          the correct data types and correct numbers, but could not figure it out
            do {
                System.out.println("Please enter the name of favorite pet: ");
                petName = input.nextLine();
            } while (!(petName instanceof String));

//          Favorite quarterback
            System.out.println("Do you have a favorite quarterback: ");
            quarterBack = input.nextLine();
            if (quarterBack.equals("yes") || quarterBack.equals("y")) {
                System.out.println("What is their jersey number? ");
                quarterBackNumber = input.nextInt();
            }


//          This was used to prevent question from stacking two at a time on top of one another
            input.nextLine();


//          I tried to attempt do-while statements on the input questions to force the user to input
//          the correct data types and correct numbers, but could not figure it out
            do {
                System.out.println("What is the first name of your favorite actor or actress: ");
                actressName = input.nextLine();
            } while (!(actressName instanceof String));

//          Ask for lucky number
            System.out.println("What is your lucky number (integer): ");
            luckyNum = input.nextInt();

//          Ask for two-digit model
            System.out.println("What is the two-digit model year of your car? ");
            carYear = input.nextInt();

//          Age of pet
            System.out.println("Please enter the (integer) age of your pet: ");
            petAge = input.nextInt();


//          This do-while loop works, forcing the user to input a num <= 50 and > 0.
            do {
                System.out.println("Enter a random number between 1 and 50: ");
                randomNum = input.nextInt();
            } while (randomNum > 50 || randomNum < 1);



//          1.) Grab third char and transform into an int.
            int intPetThirdLetter = petName.charAt(2);
            System.out.println(intPetThirdLetter);
            System.out.println(petName);


//          2.) create combined number and and carYear and luckyNum.
            int CombinedNum = carYear + luckyNum;
            System.out.println(CombinedNum);

//          3.)Take user randomNum and subtract an actual randomized number.
            Random rand = new Random();
            int int_random = rand.nextInt(51);
            int newRandomNum = randomNum - int_random;

//          4.) Convert first letter of actress name into a number value. This will be Ascii.
            int actressIntFirstLetter = actressName.charAt(0);
            System.out.println(actressIntFirstLetter);
            int actressIntFinalLetter = actressName.charAt(actressName.length() - 1);

//          5.) Calculate the magic ball
            magicBall = randomNum * luckyNum;
            while (magicBall > 75) {
                magicBall -= 75;
            }


//          6.) Create an array to store the five values and then sort
            int[] storeLottery = {actressIntFirstLetter, actressIntFinalLetter, newRandomNum, CombinedNum, intPetThirdLetter};
            Arrays.sort(storeLottery);

//          7.) Format the string without brackets and commas
            String formattedString = Arrays.toString(storeLottery).replace(",", "").replace("[", "").replace("]", "").trim();



//          Print the magic ball and the lottery numbers
            System.out.printf(("\n\nHere are your lottery numbers: %s   Magic Ball: %d \n"), formattedString, magicBall );

//          Used to prevent input question stacking
            input.nextLine();


//          This determines whether the user stats or exits the while loop
            System.out.println("\n\nWould you like to continue? Enter y or yes to continue or n: ");
            userContinue = input.nextLine();

        }

//      At this point the user has exited the while loop that prompts questions, and the program ends
        System.out.println("Thank you!");

    }




}

