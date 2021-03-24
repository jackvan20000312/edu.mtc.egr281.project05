package inClass;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		
		//Prepare
		
		//Declare object to generate random Number
		Random randomizer = new Random();
		//declare scanner object
		Scanner keyboard = new Scanner(System.in);
		//declare variable to count guesses
		int numberOfGuesses=0;
		//store number of users guesses
		int userGuess;
		//generate random number
		int randomNumber = randomizer.nextInt(1000);
		//INPUT and Process
		do {
		//Prompt user to make guess
		System.out.print("Enter Your Guess:");
		//increment number of guesses
		userGuess=keyboard.nextInt();
		++numberOfGuesses;
		//if user guess<than random output higher
		if(userGuess<randomNumber) {
			System.out.println("Higher");
		}
		//if user guess>than random output lower
		else if(userGuess>randomNumber) {
			System.out.println("Lower");
		}
		//continue loop until correct answer
		} while(userGuess != randomNumber);
		
		//output number of guesses and the random number
		System.out.println("You guessed my number "+randomNumber+" in " +numberOfGuesses+" guesses.");
		//close scanner object
		keyboard.close();
	//Ending Bracket of method main
	}
	//ennding bracket of class
}
