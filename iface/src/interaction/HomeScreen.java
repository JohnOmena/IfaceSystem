package interaction;
import java.util.Scanner;
import database.AccountDatabase;
import iface.Account;
import useful.Utilities;

public class HomeScreen {
	
	Scanner input = new Scanner(System.in);
	
	public void homeScreen(AccountDatabase accData) {
	
		Utilities utilities = new Utilities();
		utilities.cleanScreen();
		
		System.out.println("---------------------");
		System.out.println("#       IFACE       #");
		System.out.println("---------------------");
		System.out.println("[1] - Sign in");
		System.out.println("[2] - Sign up");
		System.out.println("[3] - Exit");
		System.out.println("--------------------------");
		System.out.println("=> Choose an option: ");
		
		HomeScreen homeScreen = new HomeScreen();
		int option = input.nextInt();
		
		utilities.cleanScreen();
		homeScreen.homeScreenDecision(option, accData, homeScreen);
		
	}
	
	public void homeScreenDecision(int option, AccountDatabase accData, HomeScreen homeScreen) {
		
		switch(option) {
		
			case 1:
				accData.accessProfileAccount(accData);
				break;
			case 2:
				Account account = new Account();
				accData.addAccount(account.createAccount(accData));
				break;
			case 3:
				System.exit(0);
				break;
			default:
                System.out.println("Choose a true option!");
			
		}
		
		System.out.println("\nPress any key to return to the main menu.");
		String pause = input.nextLine();
		homeScreen.homeScreen(accData);
		
	}
	
}