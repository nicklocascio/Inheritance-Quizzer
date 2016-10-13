import java.util.Scanner;
import java.util.ArrayList;

public class GameRunner
	{
	static String[] instantiations = new String[4];
	static String[] questions = new String[3];
	static int counter = 0;
	static int questionNumber = 1;
	static ArrayList <Integer> wrong = new ArrayList <Integer>();
	
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
		String input = userInput.nextLine();
		String name = input.substring(0, 1).toUpperCase() + input.substring(1);
		System.out.println("Hello " + name + ". It's time to take a quiz!");
		delay();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("How many questions would you like to be asked?");
		int numberOfQuestions = userInput2.nextInt();
		
		// Quiz
		for(int i = 0; i < numberOfQuestions; i++)
			{
			askQuestion();
			int number = (int)(Math.random()*4);
			System.out.println("Question " + questionNumber + ") You are given the code on your paper and this: "); 
			System.out.println("");
			System.out.println(instantiations[number]);
			int number2 = (int)(Math.random()*3);
			Scanner userInput3 = new Scanner(System.in);
			System.out.println(questions[number2]);
			System.out.println("");
			delay();
			System.out.println("What will print out?");
			System.out.println("a) Furniture provides a comfortable place for someone to sit.");
			System.out.println("b) The best place to purchase furniture is at American Furniture Warehouse.");
			System.out.println("c) Couches provide seating for multiple people, such as family and friends.");
			System.out.println("d) Some couches have neat accessories such as cupholders or recliners.");
			System.out.println("e) Will not run.");
			String answer = userInput3.nextLine();
			
			// Answers
			if(number == 0 && number2 == 0 && answer.equals("a"))
				{
				counter++;
				}
			else if(number == 0 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			else if(number == 0 && number2 == 2 && answer.equals("e"))
				{
				counter++;
				}
			else if(number == 1 && number2 == 0 && answer.equals("c"))
				{
				counter++;
				}
			else if(number == 1 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			else if(number == 1 && number2 == 2   && answer.equals("e"))
				{
				counter++;
				}
			else if(number == 2 && answer.equals("e"))
				{
				counter++;
				}
			else if(number == 3 && number2 == 0 && answer.equals("c"))
				{
				counter++;
				}
			else if(number == 3 && number2 == 1 && answer.equals("b"))
				{
				counter++;
				}
			else if(number == 3 && number2 == 2 && answer.equals("d"))
				{
				counter++;
				}
			else
				{
				wrong.add(questionNumber);
				}
			
			questionNumber++;
			}
		
		// Results 
		System.out.println("");
		if(counter == 1)
			{
			System.out.println("You got " + counter + " question right out of " + numberOfQuestions + ", " + name);
			}
		else if(counter > 1 || counter == 0)
			{
			System.out.println("You got " + counter + " questions right out of " + numberOfQuestions + ", " + name);
			}
		if(counter == 0)
			{
			System.out.println("You may need some more practice.");
			}
		else if(counter%numberOfQuestions != 0)
			{
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("Would you like to know what you got wrong?");
			String confirm = userInput4.nextLine().toLowerCase();
			if(confirm.equals("yes"))
				{
				for(int i = 0; i < wrong.size(); i++)
					{
					System.out.println("You missed question " + wrong.get(i));
					}				
				}
			else if(confirm.equals("no"))
				{
				System.out.println("Alright have a good day!");
				}
			}
		else
			{
			System.out.println("Good job!");
			}
		}
	}
