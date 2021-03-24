//Jacob Vaught
//Due-9-30-2020
//Date-9-28-2020
//A Program that can identify which class you should be in. 
//It also plays the Twelve Days Of Christmas
package projects;

import java.util.Scanner;



public class Project05 {
//CRS is shorthand for Compass Reading Score.
//WRSS is shorthand for WRiting Sample Score.
	
	//Lowest score for Compass Reading Score.
	public static final double CRS_FAIL_SCORE=35;
	//Second to lowest score for Compass Reading Score.
	public static final double CRS_NO_FAIL_SCORE1H=60;
	//Third to Lowest score for Compass Reading Score.
	public static final double CRS_NO_FAIL_SCORE2H=79;
	//Fourth to Lowest score for Compass Reading Score.
	public static final double CRS_NO_FAIL_SCORE3H=87;
	//Fifth to Lowest score for Compass Reading Score.
	public static final double CRS_NO_FAIL_SCORE4=88;
	
	//Lowest score for Writing Sample Score.
	public static final double WWRS_SCORE1=10;
	//Second to lowest score for Writing Sample Score.
	public static final double WWRS_SCORE2=20;
	public static final double WWRS_SCORE3=30;
	
	//Names of the classes
	public static final String READING_1ST_CLASS="RDG 032";
	public static final String READING_2ND_CLASS="RDG 100";
	public static final String READING_3RD_CLASS="RDG 101";
	public static final String ENGLISH_1ST_CLASS="ENG 100";
	public static final String ENGLISH_2ND_CLASS="ENG 101";
	
	public static final String WELCOME_MESSAGE="Welcome to Midlands Technical College's \n"
											+ "Reading and English Advisement Program ";
	
	//Option Selection (Work) or (PLay)
	public static final String STRING_FOR_WORK_PRGM_SELECTION="1";
	public static final String STRING_FOR_CHRISTMAS_PRGM_SELECTION="2";
	
	//Input Scores/Grades
	public static final String ENTER_CRS_GRADE_DATA="Input the Compass Reading Score";
	public static final String ENTER_WRSS_GRADE_DATA="Input the Writing Sample Score (10,20, or 30)";
	
	//ERROR MESSAGES
	public static final String CHRISTMAS_ERROR_MESSAGE="Merry Christmas. \nI don't think you entered the correct number.";
	public static final String WRSS_ERROR_MESSAGE="You did not enter 10, 20, or 30. \n(OR THIS PROGRAM IS CORRUPTED)";
	
	//Christmas Days
	public static final int DAY1=1;
	public static final int DAY2=2;
	public static final int DAY3=3;
	public static final int DAY4=4;
	public static final int DAY5=5;
	public static final int DAY6=6;
	public static final int DAY7=7;
	public static final int DAY8=8;
	public static final int DAY9=9;
	public static final int DAY10=10;
	public static final int DAY11=11;
	public static final int DAY12=12;
		
	public static void main(String[] args) {
		
		//Setup the program
		//Variables. "Select A program" input, "Do your job" input and "Christmas" Input.
	    String which_Program;
		double cRS, wRSS;
		int dAY_Christmas;
		//Start the Scanner
		Scanner uSER_INPUT = new Scanner(System.in);
		
		//Program Now Starting.
		System.out.println(WELCOME_MESSAGE);
		
		//Pause program until enter is pressed
		System.out.print("Press Enter to continue . . . .");
	    uSER_INPUT.nextLine();
	    
	    System.out.println();
		System.out.println("Enter 1 for Actual Work.\nEnter 2 for some nice Christmas FUN!");
		which_Program = uSER_INPUT.next();
		
		//If STATEMENT
		if(STRING_FOR_WORK_PRGM_SELECTION.equalsIgnoreCase(which_Program)) {
			
			System.out.println(ENTER_CRS_GRADE_DATA);
			cRS = uSER_INPUT.nextDouble();
			System.out.println(ENTER_WRSS_GRADE_DATA);
			wRSS = uSER_INPUT.nextDouble();
			
			if(cRS<=CRS_FAIL_SCORE) {
				
				System.out.println();
				System.out.println("Unacceptable Reading Score");
				System.out.println("Cannot place Student in Class");
				
			//2nd level if statement #(1) (closing bracket)	
			}
			
			else if(cRS<=CRS_NO_FAIL_SCORE1H) {
				
				System.out.println();
				System.out.println("Place Student into "+READING_1ST_CLASS+".");
				System.out.println("Cannot take ANY English class until "+READING_1ST_CLASS+" is Completed.");
			
			//2nd level if statement #(2) (closing bracket)	
			}
			
			else if(cRS<=CRS_NO_FAIL_SCORE2H) {
				
				if(wRSS==WWRS_SCORE1) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_1ST_CLASS+".");
					System.out.println("Cannot take ANY English class until "+READING_1ST_CLASS+" is Completed.");
				//3rdLevel if statement #(1) (closing Bracket)
				}
				
				else if(wRSS==WWRS_SCORE2) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_2ND_CLASS+".");
					System.out.println("Place Student into "+ENGLISH_1ST_CLASS+".");
				//3rdLevel if statement #(2) (closing Bracket)
				}
			
				else if(wRSS==WWRS_SCORE3) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_2ND_CLASS+".");
					System.out.println("Place Student into "+ENGLISH_1ST_CLASS+".");
					System.out.println("Student Cannot take "+ENGLISH_2ND_CLASS+" until "+READING_2ND_CLASS+" is completed.");
				//3rdLevel if statement #(3) (closing Bracket)
				}
			
			//2nd level if statement #(3) (closing bracket)	
			}
			
			else if(cRS<=CRS_NO_FAIL_SCORE3H) {
				
				if(wRSS==WWRS_SCORE1) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_1ST_CLASS+".");
					System.out.println("Cannot take ANY English class until "+READING_1ST_CLASS+" is Completed.");
				//3rdLevel if statement #(1) (closing Bracket)
				}
				
				else if(wRSS==WWRS_SCORE2) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_3RD_CLASS+", IF required by program, \nor else no Reading course is required.");
					System.out.println("Place Student into "+ENGLISH_1ST_CLASS+".");
				//3rdLevel if statement #(2) (closing Bracket)
				}
			
				else if(wRSS==WWRS_SCORE3) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_3RD_CLASS+".");
					System.out.println("Place Student into "+ENGLISH_2ND_CLASS+".");
				//3rdLevel if statement #(3) (closing Bracket)
				}
			
			//2nd level if statement #(4) (closing bracket)	
			}
			
			else if(cRS>=CRS_NO_FAIL_SCORE4) {
				
				if(wRSS==WWRS_SCORE1) {
					
					System.out.println();
					System.out.println("Place Student into "+READING_1ST_CLASS+"");
				//3rdLevel if statement #(1) (closing Bracket)
				}
				
				else if(wRSS==WWRS_SCORE2) {
					
					System.out.println();
					System.out.println("Place Student into "+ENGLISH_1ST_CLASS+".");
				//3rdLevel if statement #(2) (closing Bracket)
				}
			
				else if(wRSS==WWRS_SCORE3) {
					
					System.out.println();
					System.out.println("Place Student into "+ENGLISH_2ND_CLASS+".");
				//3rdLevel if statement #(3) (closing Bracket)
				}
				else {
					System.out.println();
					System.out.println(WRSS_ERROR_MESSAGE);
				//3rdLevel if statement #(3) (closing Bracket)
				}
				
			//2nd level if statement #(5) (closing bracket)	
			}
		//1st level if statement #(1)	(closing bracket)
		}
		
		else if(STRING_FOR_CHRISTMAS_PRGM_SELECTION.equalsIgnoreCase(which_Program)) {
			
			System.out.println("Enter a day between 1 and 12");
			dAY_Christmas = uSER_INPUT.nextInt();
			
			if (dAY_Christmas>=1 && dAY_Christmas<=12) {
			
				//Inserts first line of christmas song
				switch(dAY_Christmas) {
		    	  
		      case DAY3 :
		    	  System.out.println("On the 3rd day of Christmas my true love sent to me ");
		    	  break;
		    	  
		      case DAY2 :
		    	  System.out.println("On the 2nd day of Christmas my true love sent to me ");
		    	  break;
		    	  
		      case DAY1 :
		    	  System.out.println("On the 1st day of Christmas my true love sent to me ");
		    	  break;
		    	  
		      default :
		    	System.out.println("On the "+dAY_Christmas+"th day of Christmas my true love sent to me ");
		    	  break;
		    	  
		    	//3rd level switch statement #(1) (closing Bracket)
		      }
			
		    //Inserts the rest of the christmas song
		      switch(dAY_Christmas) {
		         
		      case DAY12 :
		    	 System.out.println("Twelve Drummers Drumming,");
		    	 
		      case DAY11 :
		    	  System.out.println("Eleven Pipers Piping,");
		    	  
		      case DAY10 :
		    	  System.out.println("Ten Lords a-Leaping,");
		    	  
		      case DAY9 :
		    	  System.out.println("Nine Ladies Dancing,");
		    	  
		      case DAY8 :
		    	  System.out.println("Eight Maids a-Milking,");
		    	  
		      case DAY7 :
		    	  System.out.println("Seven Swans a-Swimming,");
		    	  
		      case DAY6 :
		    	  System.out.println("Six Geese a-Laying,");
		    	  
		      case DAY5 :
		    	  System.out.println("Five Gold Rings,");
		    	  
		      case DAY4 :
		    	  System.out.println("Four Calling Birds,");
		    	  
		      case DAY3 :
		    	  System.out.println("Three French Hens,");
		    	  
		      case DAY2 :
		    	  System.out.println("Two Turtle Doves and");
		    	  
		      case DAY1 :
		    	  System.out.println("a Partridge in a Pear Tree.");
		    	  break;
		    	  
		    	  
		    	//3rd level switch statement #(2) (closing Bracket)
		      }
			//2nd level if statement #1 (closing Bracket)
			}
			
			else 
			{System.out.println(CHRISTMAS_ERROR_MESSAGE);
			
			//2nd level if statement  #2 (closing bracket)
			}
		      
		//1st level if statement #(2) (closing Bracket)	
		}
		
		
	uSER_INPUT.close();	
	//End bracket of Method Main	
	}
	
	
	
	
// End Bracket of class
}
