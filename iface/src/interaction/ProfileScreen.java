package interaction;
import java.util.Scanner;
import database.IfaceDatabase;
import iface.Account;
import useful.Utilities;

public class ProfileScreen {
	
	Scanner input = new Scanner(System.in);
	
	public IfaceDatabase profileScreen(IfaceDatabase ifaceData, Account account) {
		
		Utilities utilities = new Utilities();
		utilities.cleanScreen();
		
		System.out.println("---------------------");
		System.out.println("Welcome!" + account.getNickName());
		System.out.println("---------------------");
		System.out.println("[1] - Sign in");
		System.out.println("[2] - Sign up");
		System.out.println("[3] - Sign out");
		
	
		System.out.println("--------------------------");
		System.out.println("=> Choose an option: ");
		
		HomeScreen profileScreen = new HomeScreen();
		int option = input.nextInt();
		
		utilities.cleanScreen();
		ifaceData = profileScreen.profileScreenDecision(option, ifaceData, profileScreen);
		
		return ifaceData;
		
	}
	
	public IfaceDatabase profileScreenDecision(int option, IfaceDatabase ifaceData, ProfileScreen profileScreen) {
		
		switch(option) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
			
		
		}
		
		
		return ifaceData;
	}
	
}
