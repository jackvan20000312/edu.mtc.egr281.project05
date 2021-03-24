package inClass;
import java.util.Scanner;

public class SimpleIfElse {
	public static void main(String[] args) {
	
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		//INPUT
		System.out.print("Enter A Number;");
		
		int Number = keyboard.nextInt();
		//PROCESS
		keyboard.close();

		//OUTPUT
		if(Number%2==0) {
			System.out.println(Number+" is an EVEN Number");
		}//ending bracket of if
		else {
			System.out.println(Number+" is an ODD Number");
		}//ending bracket of else
	}//ending bracket of method main
}//ending bracket of class SimpleIfElse 
