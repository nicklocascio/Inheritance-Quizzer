import java.util.Scanner;

public class GameRunner
	{
	static String[] instantiations = new String[4];
	static String[] questions = new String[3];
	static int counter = 0;
	static Scanner userInput3 = new Scanner(System.in);
	
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
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = userInput.nextLine();
//		System.out.println("Hello " + name + ". It's time to take a quiz!");
//		delay();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("How many questions would you like to be asked?");
		int numberOfQuestions = userInput2.nextInt();
		
		// Quiz
		for(int i = 0; i < numberOfQuestions; i++)
			{
			askQuestion();
			int number = (int)(Math.random()*4);
			System.out.println("You are given the code on your paper and this instantiation: " + instantiations[number]);
			delay();
			int number2 = (int)(Math.random()*3);
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("If I run " + questions[number2] + ", what will print out?");
			System.out.println("a) Furniture provides a comfortable place for someone to sit.");
			System.out.println("b) The best place to purchase furniture is at American Furniture Warehouse.");
			System.out.println("c) Couches provide seating for multiple people, such as family and friends.");
			System.out.println("d) Some couches have neat accessories such as cupholders or recliners.");
			System.out.println("e) Nothing");
			String answer = userInput3.nextLine();
			
			// Answers
			if(number == 0 && number2 == 0 && answer.equals("a"))
				{
				counter++;
				}
			if(number == 0 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			if(number == 0 && number2 == 2 && answer.equals("e"))
				{
				counter++;
				}
			if(number == 1 && number2 == 0 && answer.equals("c"))
				{
				counter++;
				}
			if(number == 1 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			if(number == 1 && number2 == 2   && answer.equals("e"))
				{
				counter++;
				}
			if(number == 2 && answer.equals("e"))
				{
				counter++;
				}
			if(number == 3 && number2 == 0 && answer.equals("c"))
				{
				counter++;
				}
			if(number == 3 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			if(number == 3 && number2 == 2 && answer.equals("d"))
				{
				counter++;
				}
			}
		System.out.println("You got " + counter + " questions right out of " + numberOfQuestions);
		}
	}
