import java.util.Scanner;


public class Greeting
	{
	static String name;

	public static void greetPlayer()
		{
		System.out.println("Hey! Welcome to CarLocator.exe. Enter your name please");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		System.out.println("Hello "+ name +"." + " With this java program you can search for a Car/Truck of your preference. If you need help researching a car, I can also help with that!");
		}

	}
