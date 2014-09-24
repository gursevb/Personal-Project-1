import java.io.IOException;
import java.util.ArrayList;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;

public class CarHelper
	{
	static int response1, response2, response3, response4, response5, response6;

	private static String make;
	private static String model;
	private String drivetrain;
	private String year;

	public CarHelper(String m, String ml, String d, String y)
		{
		make = m;
		model = ml;
		drivetrain = d;
		year = y;
		}

	public static String getMake()
		{
		return make;
		}

	public static String getModel()
		{
		return model;
		}

	public String getDrivetrain()
		{
		return drivetrain;
		}

	public String getYear()
		{
		return year;
		}


	public static void setMake(String make)
		{
		CarHelper.make = make;
		}

	public void setModel(String model)
		{
		this.model = model;
		}

	public void setDrivetrain(String drivetrain)
		{
		this.drivetrain = drivetrain;
		}

	public void setCylinders(String year)
		{
		this.year = year;
		}
	

	@Override
	public String toString()
		{
		return "\nCarHelper's Best Bet \nMake = " + make + "\nModel = " + model + "\nDrivetrain = "
				+ drivetrain + "\nYear = " + year +".\n";
		}

	public static void main(String[] args) throws IOException,
			URISyntaxException
		{

		askHelp();
		}

	public static void askHelp() throws IOException, URISyntaxException
		{
		// Ask the user if they need help finding a car.
		System.out.println("Do you need help finding your car? \n"
				+ "1) Yes \n" + "2) No \n" + "3) I don't need any help \n"
				+ "4) Give me a random type of car/truck to look at");
		Scanner userInput = new Scanner(System.in);
		response1 = userInput.nextInt();

		if (response1 == 1)
			{
			System.out.println("No problem I can help you!");
			helpUser();
			}
		if (response1 == 2)
			{
			CarLocator.askUser();
			}
		if (response1 == 4)
			{
			randomCar();
			} 
		else
			{
			System.exit(0);
			}

		}

	public static void randomCar() throws IOException, URISyntaxException
		{
		System.out.println("Here is a random car/truck!");
		String first[] =
			{ "Covertible and ", "Sports Car and", "Sedan and ", "Coupe and ",
					"Hatchback and ", "Hybrid/Electric and ", "Luxury and " };
		String second[] =
			{ "SUV", "Crossover", "Compact Pickup", "Fullsize Pickup",
					"Minivan/Van", "Wagon", "Off-Road" };
		Random random = new Random();
		System.out.println(second[random.nextInt(second.length)]
				+ first[random.nextInt(first.length)]);
		askHelp();
		}

	public static void helpUser()
		{
		ArrayList<CarHelper> selection = new ArrayList<CarHelper>();
		selection.add(new CarHelper("Ford", "Explorer", "4x4/AWD","2014"));
		selection.add(new CarHelper("Jeep", "Patriot", "AWD", "2015"));
		selection.add(new CarHelper("Subaru", "Impreza", "AWD", "2014"));
		selection.add(new CarHelper("Honda", "Accord", "FWD", "2014"));
		selection.add(new CarHelper("Chevorlet", "Corvette Stingray", "RWD","2015"));
		selection.add(new CarHelper("Nissan", "GTR", "AWD", "2014"));
		selection.add(new CarHelper("Chevorlet", "Tahoe", "AWD", "2014"));
		selection.add(new CarHelper("Nissan", "Versa", "FWD", "2014"));
		selection.add(new CarHelper("Toyota", "RAV4", "AWD","2014"));
		
		System.out.println("Do you need a truck with seating for more than 5? 1) Yes 2) No");
		Scanner userInput = new Scanner(System.in);
		response2 = userInput.nextInt();
		if (response2 == 1)
			{
			System.out.println("Do you need a AWD/4X4 drivetrain? 1) Yes 2) No");
			Scanner userInput1 = new Scanner(System.in);
			response3 = userInput.nextInt();
			if (response3 == 1)
				{
				System.out.println(selection.get(0));
				System.out.println(selection.get(6));

				}
			if (response3 == 2)
				{
				System.out.println(selection.get(1));
				System.out.println(selection.get(8));

				}
			}
		if (response2 == 2)
			{
			System.out.println("Would you perfer a Sedan or Coupe? 1) Yes 2) No");
			Scanner userInput1 = new Scanner(System.in);
			response4 = userInput.nextInt();
			if (response4 == 1)
				{
				System.out.println("Do you need a AWD/4X4 drivetrain? 1) Yes 2) No");
				Scanner userInput2 = new Scanner(System.in);
				response5 = userInput.nextInt();
				if (response5 == 1)
					{
					System.out.println(selection.get(2));

					}
				if (response5 == 2)
					{
					System.out.println(selection.get(3));
					System.out.println(selection.get(7));


					}
				
				}
			if (response4 == 2)
				{
				System.out.println("Would you be fine with a Coupe with 2 seats? 1) Yes 2) No");
				Scanner userInput3 = new Scanner(System.in);
				response6 = userInput.nextInt();
				if (response5 == 1)
					{
					System.out.println(selection.get(4));

					}
				if (response5 == 2)
					{
					System.out.println(selection.get(5));

					}
				}

			}

		}
	}
