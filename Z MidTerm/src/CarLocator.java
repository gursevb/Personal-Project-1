import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class CarLocator
	{
	static String zipCode, searchRadius, make, model, endYear, startingYear;

	public static void main(String args[]) throws Exception
		{
		Greeting.greetPlayer();
		CarHelper.main(args);
		askUser();
		}
	
	
	public static void askUser() throws IOException, URISyntaxException
		{
		// Create Desktop object, this allows me to open the default browser 
				Desktop d = Desktop.getDesktop();
				// User input's the Zip Code, which then is entered in to the cars.com URL 
				System.out.println("Alright lets get started!");
				System.out.println("What is your Zip Code?");
				Scanner userInput = new Scanner(System.in);
				zipCode = userInput.nextLine();
				System.out.println("What is your Search Radius? Options: 10, 50, 75, 100, 200, 300, 400, 500 Freedom Units (Miles).");//Round it to the nearest available radius
				Scanner userInput1 = new Scanner(System.in);
				searchRadius = userInput.nextLine();
				System.out.println("What is the MAKE of the car your looking at? Ex. Ford, Lexus, Acura");
				Scanner userInput2 = new Scanner(System.in);
				make = userInput.nextLine();
				System.out.println("What is the MODEL of the car your looking at? Ex. Focus, IS-F, Integra");
				Scanner userInput3 = new Scanner(System.in);
				model = userInput.nextLine();
				System.out.println("What earliest year you are willing to look at? 1981 is the earliest you can lookup!");
				Scanner userInput4 = new Scanner(System.in);
				startingYear = userInput.nextLine();
				System.out.println("What is the ending year you are willing to look at? 2015 is the latest you can lookup!");
				Scanner userInput5 = new Scanner(System.in);
				endYear = userInput.nextLine();
				d.browse(new URI("http://www.autotrader.com/cars-for-sale/" + make + "/" + model + "/Commerce+City+CO-"+ zipCode +"?endYear="+ endYear +"&makeCode1=" + make + "&mmt=%5B"+ make +"%5B"+ model +"%5B%5D%5D%5B%5D%5D&modelCode1=" + model +"&searchRadius=" + searchRadius + "&showcaseOwnerId=57970527&startYear="+ startingYear +"&Log=0&showcaseListingId=379025893&showcaseOwnerId=57970527&captureSearch=true&fromSIP=81008C3FF3C0922A699616E4A3954AC4&showToolbar=true&Log=0"));
		}
	}