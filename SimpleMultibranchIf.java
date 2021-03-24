package inClass;

import java.util.Scanner;

public class SimpleMultibranchIf {
public static void main(String[] args) {
	Scanner kb;
	
	kb= new Scanner(System.in);
			
			
	System.out.print("Do you wnat to see a movie");
	String answer = kb.next();
	if("YES".equalsIgnoreCase(answer)) {
		System.out.println("SWEET!!");
		System.out.println("How much much $$ you got?");
		int money = kb.nextInt();
		if(money<50) {
			System.out.println("not enough!!!! :)(:");
			
		}
		else {
			System.out.println("Let's Go!, I'll Drive!");
		}
		
	}
	else {
		System.out.println("Maybe another time.");
	}
	kb.close();
}
}
