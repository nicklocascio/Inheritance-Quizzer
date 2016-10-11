import java.util.Scanner;

public class GameRunner
	{
	static String[] instantiations = new String[4];
	static String[] questions = new String[3];

	
	public static void delay()
		{
		try
			{
			Thread.sleep(2000);
			} 
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	
	public static void askQuestion()
		{
		instantiations[0] = "Furniture x = new Furniture()";
		instantiations[1] = "Furniture x = new Couch()";
		instantiations[2] = "Couch x = new Furniture()";
		instantiations[3] = "Couch x = new Couch()";
		
		questions[0] = "x.seating()";
		questions[1] = "x.purchase()";
		questions[2] = "x.accessories()";
		}
	
	public static void main(String[] args)
		{						
		// Intro
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello " + name + ". It's time to take a quiz!");
		delay();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("How many questions would you like to be asked?");
		int numberOfQuestions = userInput2.nextInt();
		
		// Quiz
		for(int i = 0; i < numberOfQuestions; i++)
			{
			int number = (int)(Math.random()*3) + 1;
			System.out.println("You are given the code on your paper and this instantiation: " + instantiations[number]);
			delay();
			int number2 = (int)(Math.random()*2) + 1;
			System.out.println("If I run " + questions[number2] + ", what will print out?");
			}
		}
	}
