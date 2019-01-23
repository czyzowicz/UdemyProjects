package JavaMasterClass.PasibusBurger;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		Decision();
		
		}
		public static int Decision () {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome!\nPlease choose your burger.\n"
				+ "Press 0 for Typical Burger, 1 for Deluxe Hamburger and 2 for Healthy Burger: ");
		int choice = input.nextInt();
		if (choice == 0) {
			TypicalBurger typicalBurger = new TypicalBurger ("white", "bloody", "Typical Burger", 5.00);
			Sleep(); 
			Meat(typicalBurger);
			Sleep(); 
			Resume(typicalBurger);
		} else if (choice == 1) {
			DeluxeHamburger deluxeHamburger = new DeluxeHamburger ("white", "bloody", "Deluxe Hamburger with cola and fries ", 12.00); 
			Sleep(); 
			Meat(deluxeHamburger);
			Sleep(); 
			Resume(deluxeHamburger);
			} else if (choice == 2) {
			HealthyBurger healthyBurger = new HealthyBurger ("brown", "bloody", "Healthy Burger", 7.00);
			Sleep(); 
			Meat(healthyBurger);
			Sleep();
			Resume(healthyBurger);		
			} else {
			System.out.println("Uncorrect decision. Please choose again.");
			Sleep();
			Decision();
		}
		input.close();
		return choice;
		
		}
		private static void Meat(TypicalBurger burger) {
			Scanner input2 = new Scanner (System.in);
			System.out.println("What meat do you prefer? Bloody? Medium? Well done?\n"
				+ "Press 0 for bloody, 1 for medium and 2 for well done: ");
			int choice2 = input2.nextInt();
			if (choice2 == 0) {
				burger.setMeat("bloody");
			} else if (choice2 == 1) {
				burger.setMeat("medium");
			} else if (choice2 == 2) {
				burger.setMeat("well done");
			} else {
				System.out.println("Uncorrect decision. Please choose again.");
				Sleep();
				Decision();
			}
			
		}
		private static void Resume(TypicalBurger burger) {
			Scanner input2 = new Scanner (System.in);
			System.out.println("If you want to add some additionals please type how many additionals you will take: ");
			int choice3 = input2.nextInt();
			double finalPrice = choice3 * 0.50;
			finalPrice = (burger.getPrice()) + finalPrice;
			System.out.println("You choose " + burger.getName() + "with " + burger.getMeat() +  " for the " + finalPrice + " dollars");
			input2.close();
		}
		public static void Sleep(){
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

